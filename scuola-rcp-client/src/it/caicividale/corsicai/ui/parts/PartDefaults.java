package it.caicividale.corsicai.ui.parts;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public interface PartDefaults {
    static final int MARGIN = 2;
    static final int MARGIN_GROUP = 1;
    static final int MARGIN_DATA = MARGIN + 5;

    static final int COMPOSITE_MARGIN = 8;
    static final int H_LABEL2CONTROL_OFFSET = 8;
    static final int V_LABEL2CONTROL_OFFSET = 4;
    static final int H_LABEL2LABEL_OFFSET = 20;
    static final int V_LABEL2LABEL_OFFSET = 10;
    static final int H_CONTROL2CONTROL_OFFSET = 20;
    static final int V_CONTROL2CONTROL_OFFSET = 10;
    static final int H_TEXT = 20;
    static final int H_DATA = H_TEXT + 6;
    static final int H_LABEL = 20;

    static final String CSS_CLASS_READONLY = "readonly";
    static final String CSS_CLASS_ASSISTITO = "assistito";
    static final String CSS_CLASS_NOSOLOGICO = "nosologico";

    static String nullSafeFormat(final DateTimeFormatter dateTimeFormatter, final TemporalAccessor temporalAccessor) {
	if (temporalAccessor != null) {
	    return dateTimeFormatter.format(temporalAccessor);
	} else {
	    return null;
	}
    }
}
