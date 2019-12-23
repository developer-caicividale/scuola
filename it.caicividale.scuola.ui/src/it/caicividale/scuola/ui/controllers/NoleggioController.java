package it.caicividale.scuola.ui.controllers;

import java.time.LocalDate;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.ui.composites.NoleggioComposite;
import it.caicividale.scuola.ui.databinding.converters.Float2StringConverter;
import it.caicividale.scuola.ui.databinding.converters.PersonaNomeCognome2StringConverter;
import it.caicividale.scuola.ui.databinding.converters.String2FloatConverter;
import it.caicividale.scuola.ui.dialogs.NoleggioMaterialeDialog;
import it.caicividale.scuola.ui.parts.tableviewer.labelproviders.MaterialeNoleggiatoLabelProvider;
import it.caicividale.scuola.ui.updatevaluestrategy.ConverterUpdateValueStrategy;
import it.caicividale.scuola.ui.utils.EmfUtils;
import it.caicividale.scuola.ui.validators.TextFloatValidator;
import lombok.Data;

@Data
public class NoleggioController {

    private final NoleggioComposite noleggioComposite;
    private final Button okButton;

    private final IObservableValue<Iscrizione> iscrizioneActualObservable;

    private final IObservableValue<MaterialeNoleggiato> materialeNoleggiatoItemsObservable = WritableValue
	    .withValueType(MaterialeNoleggiato.class);

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void bind2model() {
	DataBindingContext bindingContext = new DataBindingContext();

	UpdateValueStrategy model2targetInfoAllievo = new ConverterUpdateValueStrategy(
		new PersonaNomeCognome2StringConverter());

	UpdateValueStrategy target2modelQuotaStrategy = new ConverterUpdateValueStrategy(new String2FloatConverter());
	target2modelQuotaStrategy.setBeforeSetValidator(new TextFloatValidator());
	UpdateValueStrategy model2targetQuotaStrategy = new ConverterUpdateValueStrategy(new Float2StringConverter());

	// allievo
	IObservableValue<Text> allievoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue allievoTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(noleggioComposite.getAllievo());
	bindingContext.bindValue(allievoTextObservable, allievoObservable, null, model2targetInfoAllievo);

	// tabella noleggio
	noleggioComposite.getTableViewerNoleggio()
		.setLabelProvider(new MaterialeNoleggiatoLabelProvider(noleggioComposite.getTableViewerNoleggio()));
	ObservableListContentProvider noleggioListContentProvider = new ObservableListContentProvider();
	noleggioComposite.getTableViewerNoleggio().setContentProvider(noleggioListContentProvider);
	IObservableList<MaterialeNoleggiato> materialeNoleggiatoObservableList = EMFProperties
		.list(ModelPackage.Literals.ISCRIZIONE__MATERIALE_NOLEGGIATO).observeDetail(iscrizioneActualObservable);
	noleggioComposite.getTableViewerNoleggio().setInput(materialeNoleggiatoObservableList);
	IViewerObservableValue targetObservableMaterialeNoleggiato = ViewerProperties.singleSelection()
		.observe(noleggioComposite.getTableViewerNoleggio());
	bindingContext.bindValue(targetObservableMaterialeNoleggiato, materialeNoleggiatoItemsObservable);

	noleggioComposite.getAggiungiNoleggio().addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		@SuppressWarnings("unused")
		MaterialeNoleggiato materialeNoleggiato = ModelFactory.eINSTANCE.createMaterialeNoleggiato();
		materialeNoleggiato.setDataNoleggio(LocalDate.now());
		materialeNoleggiato.setQuantita(Short.valueOf("1"));
		NoleggioMaterialeDialog noleggioMaterialeDialog = new NoleggioMaterialeDialog(
			noleggioComposite.getShell(), materialeNoleggiato);
		if (noleggioMaterialeDialog.open() == Window.OK) {
		    iscrizioneActualObservable.getValue().getMaterialeNoleggiato()
			    .add(noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
		}
		noleggioComposite.getTableViewerNoleggio().refresh();
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {

	    }
	});

	noleggioComposite.getModificaNoleggio().addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {

		if (materialeNoleggiatoItemsObservable.getValue() != null) {
		    MaterialeNoleggiato materialeNoleggiatoOld = EcoreUtil
			    .copy(materialeNoleggiatoItemsObservable.getValue());
		    int index = EmfUtils.getIndexOfEObject(
			    iscrizioneActualObservable.getValue().getMaterialeNoleggiato(), materialeNoleggiatoOld);

		    MaterialeNoleggiato materialeNoleggiatoActual = EcoreUtil
			    .copy(materialeNoleggiatoItemsObservable.getValue());
		    @SuppressWarnings("unused")
		    NoleggioMaterialeDialog noleggioMaterialeDialog = new NoleggioMaterialeDialog(
			    noleggioComposite.getShell(), materialeNoleggiatoActual);
		    if (noleggioMaterialeDialog.open() == Window.OK) {
			// materialeNoleggiatoItemsObservable.setValue(noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
			iscrizioneActualObservable.getValue().getMaterialeNoleggiato().set(index,
				noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
		    }
		    noleggioComposite.getTableViewerNoleggio().refresh();
		} else {
		    MessageDialog.openError(noleggioComposite.getShell(), "Errore",
			    "Selezionare il materiale noleggiato da modificare");
		}
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {

	    }
	});

	noleggioComposite.getCancellaNoleggio().addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		if (materialeNoleggiatoItemsObservable.getValue() != null) {

		    if (MessageDialog.openConfirm(noleggioComposite.getShell(), "Errore",
			    "Confermi la cencellazione del noleggio '"
				    + materialeNoleggiatoItemsObservable.getValue().getMateriale().getNome() + "'?")) {
			iscrizioneActualObservable.getValue().getMaterialeNoleggiato()
				.remove(materialeNoleggiatoItemsObservable.getValue());
			noleggioComposite.getTableViewerNoleggio().refresh();
		    }

		} else {
		    MessageDialog.openError(noleggioComposite.getShell(), "Errore",
			    "Selezionare il materiale noleggiato da cancellare");
		}
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {

	    }
	});

	// quota noleggio Dovuta
	IObservableValue<Float> quotaNoleggioDovutaObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue quotaNoleggioDovutaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(noleggioComposite.getQuotaNoleggioDovuta());
	bindingContext.bindValue(quotaNoleggioDovutaTextObservable, quotaNoleggioDovutaObservable,
		target2modelQuotaStrategy, model2targetQuotaStrategy);

    }
}
