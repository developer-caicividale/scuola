package it.caicividale.scuola.ui.dialogs;

import java.time.LocalDate;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.ui.databinding.converters.Short2StringConverter;
import it.caicividale.scuola.ui.databinding.converters.String2ShortConverter;
import it.caicividale.scuola.ui.updatevaluestrategy.ConverterUpdateValueStrategy;
import it.caicividale.scuola.ui.validators.ObjectNotNullValidator;
import it.caicividale.scuola.ui.widgetvalueproperty.LocalDateSelectionProperty;

public class NoleggioMaterialeDialog extends TitleAreaDialog {
    private Label lblMateriale;
    private ComboViewer materialeComboViewer;

    private Label lblDataNoleggio;
    private CDateTime dataNoleggio;

    private Label lblQuantita;
    private Text quantita;

    private final ModelManager modelManager = ModelManager.getInstance();
    private final IObservableValue<MaterialeNoleggiato> materialeNoleggiatoObservableValue = WritableValue
	    .withValueType(MaterialeNoleggiato.class);
    private MaterialeNoleggiato materialeNoleggiato;

    public NoleggioMaterialeDialog(Shell parentShell, MaterialeNoleggiato materialeNoleggiato) {
	super(parentShell);
	this.materialeNoleggiato = materialeNoleggiato;

    }

    @Override
    public void create() {
	super.create();
	setTitle("Materiale noleggiato");

	// metto il binding qui in modo che venga fatto dopo la create della super
	bindToModel();
    }

    @Override
    protected Control createDialogArea(Composite parent) {
	Composite area = (Composite) super.createDialogArea(parent);
	Composite container = new Composite(area, SWT.NONE);
	container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

	GridLayout layout = new GridLayout(2, false);
	container.setLayout(layout);

	lblDataNoleggio = new Label(container, SWT.NONE);
	lblDataNoleggio.setText("Data Noleggio");
	GridData dataGridData = new GridData();
	dataGridData.grabExcessHorizontalSpace = true;
	dataGridData.horizontalAlignment = GridData.FILL;
	dataNoleggio = new CDateTime(container, CDT.BORDER | CDT.COMPACT | CDT.DROP_DOWN);
	dataNoleggio.setPattern("dd/MM/yyyy");
	dataNoleggio.setLayoutData(dataGridData);

	lblMateriale = new Label(container, SWT.NONE);
	lblMateriale.setText("Materiale");
	GridData materialeGridData = new GridData();
	materialeGridData.grabExcessHorizontalSpace = true;
	materialeGridData.horizontalAlignment = GridData.FILL;
	materialeComboViewer = new ComboViewer(container, SWT.NONE);
	materialeComboViewer.getCombo().setLayoutData(materialeGridData);

	lblQuantita = new Label(container, SWT.NONE);
	lblQuantita.setText("Quantità");
	GridData quantitaGridData = new GridData();
	quantitaGridData.grabExcessHorizontalSpace = true;
	quantitaGridData.horizontalAlignment = GridData.FILL;
	quantita = new Text(container, SWT.BORDER);
	quantita.setLayoutData(quantitaGridData);

	return area;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void bindToModel() {
	DataBindingContext bindingContext = new DataBindingContext();

	UpdateValueStrategy target2modelObjectNotNullStrategy = new UpdateValueStrategy(
		UpdateValueStrategy.POLICY_UPDATE);
	target2modelObjectNotNullStrategy.setBeforeSetValidator(new ObjectNotNullValidator());
	UpdateValueStrategy model2targetObjectNotNullStrategy = new UpdateValueStrategy(
		UpdateValueStrategy.POLICY_UPDATE);

	UpdateValueStrategy terget2ModelDizMaterialeNotNullStrategy = new UpdateValueStrategy(
		UpdateValueStrategy.POLICY_UPDATE);
	// = new ConverterUpdateValueStrategy(new String2DizMaterialeConverter());
	terget2ModelDizMaterialeNotNullStrategy.setBeforeSetValidator(new ObjectNotNullValidator());
	UpdateValueStrategy model2targetDizMaterialeNotNullStrategy = new UpdateValueStrategy(
		UpdateValueStrategy.POLICY_UPDATE);
	// new ConverterUpdateValueStrategy(new DizMateriale2StringConverter());

	UpdateValueStrategy target2modelIntegerStrategy = new ConverterUpdateValueStrategy(new String2ShortConverter());
	target2modelIntegerStrategy.setBeforeSetValidator(new ObjectNotNullValidator());
	UpdateValueStrategy model2targetIntegerStrategy = new ConverterUpdateValueStrategy(new Short2StringConverter());

	// data noleggio
	LocalDateSelectionProperty localDateSelectionDataNascitaProperty = new LocalDateSelectionProperty();
	IObservableValue<LocalDate> dataNoleggioObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.MATERIALE_NOLEGGIATO__DATA_NOLEGGIO))
		.observeDetail(materialeNoleggiatoObservableValue);
	ISWTObservableValue dataNoleggioDateTimeObservable = localDateSelectionDataNascitaProperty
		.observe(dataNoleggio);
	Binding dataNoleggioBinding = bindingContext.bindValue(dataNoleggioDateTimeObservable, dataNoleggioObservable,
		target2modelObjectNotNullStrategy, null);
	ControlDecorationSupport.create(dataNoleggioBinding, SWT.TOP | SWT.LEFT);

	// materiale noleggiato (da dizionario)
	ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
	materialeComboViewer.setContentProvider(listContentProvider);
	materialeComboViewer.setInput(modelManager.getElencoDizMaterialeObservableList());
	materialeComboViewer.setLabelProvider(new LabelProvider() {
	    public Image getImage(Object element) {
		return null;
	    }

	    public String getText(Object element) {
		String text = null;
		if (element != null && element instanceof DizMateriale) {
		    DizMateriale dizMateriale = (DizMateriale) element;
		    text = dizMateriale.getNome();
		    if (dizMateriale.getNota() != null) {
			if (!dizMateriale.getNota().isEmpty()) {
			    if (!dizMateriale.getNota().equals("null")) {
				text += " (" + dizMateriale.getNota() + ")";
			    }
			}
		    }

		}
		return text;
	    }
	});

	IObservableValue<DizMateriale> dizMaterialeObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.MATERIALE_NOLEGGIATO__MATERIALE))
		.observeDetail(materialeNoleggiatoObservableValue);
	IViewerObservableValue targetObservable = ViewerProperties.singleSelection().observe(materialeComboViewer);
	Binding materialeNoleggiatoBinding = bindingContext.bindValue(targetObservable, dizMaterialeObservable,
		terget2ModelDizMaterialeNotNullStrategy, model2targetDizMaterialeNotNullStrategy);
	ControlDecorationSupport.create(materialeNoleggiatoBinding, SWT.TOP | SWT.LEFT);

	// quantità
	IObservableValue<Integer> quantitaObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.MATERIALE_NOLEGGIATO__QUANTITA))
		.observeDetail(materialeNoleggiatoObservableValue);
	ISWTObservableValue caparraTextObservable = WidgetProperties.text(SWT.Modify).observe(quantita);
	Binding caparraBinding = bindingContext.bindValue(caparraTextObservable, quantitaObservable,
		target2modelIntegerStrategy, model2targetIntegerStrategy);
	ControlDecorationSupport.create(caparraBinding, SWT.TOP | SWT.LEFT);

	// inibisco il bottene di ok se le validazioni falliscono
	AggregateValidationStatus aggregateValidationStatus = new AggregateValidationStatus(
		bindingContext.getBindings(), AggregateValidationStatus.MAX_SEVERITY);
	IObservableValue<Boolean> isValidationOk = ComputedValue
		.create(() -> (aggregateValidationStatus.getValue().getSeverity() < 4));
	ISWTObservableValue buttonEnabledObservable = WidgetProperties.enabled()
		.observe(getButton(IDialogConstants.OK_ID));
	bindingContext.bindValue(buttonEnabledObservable, isValidationOk);

	materialeNoleggiatoObservableValue.setValue(materialeNoleggiato);
//	materialeComboViewer.setSelection(new StructuredSelection(materialeNoleggiato));
    }

    public IObservableValue<MaterialeNoleggiato> getMaterialeNoleggiatoObservableValue() {
	return materialeNoleggiatoObservableValue;
    }
}
