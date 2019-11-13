package it.caicividale.scuola.emf.model.valueobject;

import java.util.regex.Pattern;

import lombok.Value;

@Value
public class EMail implements ValueObject {

    private static final long serialVersionUID = -991120825882438852L;

    private static final Pattern PATTERN = Pattern
	    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    private final String codice;

    public EMail(String eMail) {
	if (eMail == null) {
	    throw new RuntimeException("EMail nullo");
	}
	if (!PATTERN.matcher(eMail.trim()).matches()) {
	    throw new RuntimeException("Email formalmente non corretta (xxxx@yyyy.zz)");
	}
	this.codice = eMail.trim();
    }

    @Override
    public String getValue() {
	return codice;
    }

}
