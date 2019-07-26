package it.caicividale.corsicai.ui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.ModelFactory;
import it.caicividale.corsicai.model.ModelPackage;

public class TitoloCorsoViewPart {

	public TitoloCorsoViewPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		// TITOLO DEL CORSO
		Label lblTitoloCorso = new Label(parent, SWT.NONE);
		lblTitoloCorso.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
		lblTitoloCorso.setBounds(0, 0, 448, 39);
		// lblTitoloCorso.setText("Nome corso");

		// ModelManager modelManager = ModelManager.getInstance();

		Corso corso = ModelFactory.eINSTANCE.createCorso();

		corso.setTesto("32 corso sci alpinismo");

		DataBindingContext bindingContext = new DataBindingContext();
		bindingContext.bindValue(WidgetProperties.text().observe(lblTitoloCorso),
				EMFProperties.value(ModelPackage.Literals.CORSO__TESTO).observe(corso));

	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO Set the focus to control
	}

}
