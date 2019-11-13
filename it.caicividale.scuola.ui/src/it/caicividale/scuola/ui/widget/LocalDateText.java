package it.caicividale.scuola.ui.widget;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.DateValidator;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Text;

class LocalDateText extends Text {
    private static final long serialVersionUID = -8761503965482021697L;

    private static final Image ERROR_IMAGE = getDecorationImage(FieldDecorationRegistry.DEC_ERROR);
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateValidator DATE_VALIDATOR = DateValidator.getInstance();

    private ControlDecoration decoration;

    private static Image getDecorationImage(String id) {
	FieldDecorationRegistry registry = FieldDecorationRegistry.getDefault();
	FieldDecoration decoration = registry.getFieldDecoration(id);
	return decoration.getImage();
    }

    public LocalDateText(Composite parent, int style) {
	super(parent, style);
	this.setTextLimit(10);
	this.setMessage("00/00/0000");

	// Decoration
	decoration = new ControlDecoration(this, SWT.TOP | SWT.LEFT);
	decoration.setImage(ERROR_IMAGE);
	decoration.setDescriptionText("Data non valida");
	decoration.hide();

	// Blocco i caratteri non consentiti
	this.addVerifyListener(new VerifyListener() {
	    private static final long serialVersionUID = 3664461796548423110L;

	    @Override
	    public void verifyText(VerifyEvent e) {
		String text = StringUtils.trimToEmpty(e.text.replaceAll("(?:-|/|\\s|\\.)", ""));
		e.doit = StringUtils.isNumeric(text) | StringUtils.isEmpty(text);
	    }
	});

	// Per qualche motivo uscendo dal campo col TAB non scatta l'evento di
	// FocusOut...
	this.addKeyListener(new KeyAdapter() {
	    private static final long serialVersionUID = 1680802522826044028L;

	    @Override
	    public void keyReleased(KeyEvent e) {
		if (e.keyCode == SWT.TAB) {
		    LocalDateText.this.notifyListeners(SWT.FocusOut, new Event());
		}
	    }
	});

	// Le verifiche e la formattazione avvengono all'uscita dal campo
	this.addFocusListener(new FocusAdapter() {
	    private static final long serialVersionUID = 7543560657163789349L;

	    @Override
	    public void focusGained(FocusEvent event) {
		LocalDateText.this.selectAll();
	    }

	    @Override
	    public void focusLost(FocusEvent event) {
		String date = null;
		String text = StringUtils.trimToEmpty(LocalDateText.this.getText().replaceAll("(?:-|/|\\s+|\\.)", "/"));
		if (StringUtils.isNotEmpty(text)) {
		    String regEx = "(\\d{1,2})/?(\\d{1,2})/?(\\d{1,4})";
		    Pattern pattern = Pattern.compile(regEx);
		    Matcher matcher = pattern.matcher(text);
		    if (matcher.matches()) {
			String year = matcher.group(3);
			int paddedYear = Integer.valueOf(StringUtils.join("2", StringUtils.leftPad(year, 3, '0')));
			int currentYear = LocalDate.now().getYear();
			if (currentYear < paddedYear) {
			    year = StringUtils.leftPad(StringUtils.leftPad(StringUtils.leftPad(year, 2, '0'), 3, '9'),
				    4, '1');
			} else {
			    year = StringUtils.join("2", StringUtils.leftPad(year, 3, '0'));
			}
			date = StringUtils.joinWith("/", StringUtils.leftPad(matcher.group(1), 2, '0'),
				StringUtils.leftPad(matcher.group(2), 2, '0'), year);
		    }

		    if (isValidDate(date)) {
			LocalDateText.this.setText(date);
			decoration.hide();
		    } else {
			LocalDateText.this.forceFocus();
			decoration.show();
		    }
		} else {
		    decoration.hide();
		}
	    };
	});
    }

    private boolean isValidDate(final String text) {
	return DATE_VALIDATOR.validate(text) != null;
    }

    public LocalDate getLocalDate() {
	LocalDate localDate = null;
	try {
	    localDate = LocalDate.parse(this.getText(), DATE_FORMATTER);
	} catch (Exception e) {
	}
	return localDate;
    }

    public void setLocalDate(final LocalDate localDate) {
	if (localDate != null) {
	    this.setText(DATE_FORMATTER.format(localDate));
	} else {
	    this.setText(StringUtils.EMPTY);
	}
	decoration.hide();
    }
}
