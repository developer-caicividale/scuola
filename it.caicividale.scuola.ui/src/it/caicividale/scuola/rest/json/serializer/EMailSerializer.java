package it.caicividale.scuola.rest.json.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import it.caicividale.scuola.emf.model.valueobject.EMail;

public class EMailSerializer extends JsonSerializer<EMail> {

    @Override
    public void serialize(EMail object, JsonGenerator jsonGenerator, SerializerProvider ctxt) throws IOException {
	if (object != null) {
	    jsonGenerator.writeString(object.getValue());
	}

    }
}
