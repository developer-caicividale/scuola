package it.caicividale.corsicai.model.valueobject;

import java.util.regex.Pattern;

public class NumeroCellulare implements ValueObject {

    private static final long serialVersionUID = -991120825882438852L;

    private static final Pattern PATTERN = Pattern.compile("^(\\+|\\d)[0-9]{7,16}$");

    private final String codice;

    public NumeroCellulare(String numeroCellulare) {
	if (numeroCellulare == null) {
	    throw new RuntimeException("Numero cellulare nullo");
	}
	if (!PATTERN.matcher(numeroCellulare.trim()).matches()) {
	    throw new RuntimeException("Numero cellulare formalmente non corretto");
	}
	this.codice = numeroCellulare.trim();
    }

    @Override
    public String getValue() {
	return codice;
    }

}
