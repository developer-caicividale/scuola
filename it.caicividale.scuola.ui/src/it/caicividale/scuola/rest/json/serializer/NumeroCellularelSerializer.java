package it.caicividale.scuola.rest.json.serializer;

import java.io.IOException;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import it.caicividale.scuola.emf.model.valueobject.NumeroCellulare;

public class NumeroCellularelSerializer extends JsonSerializer<NumeroCellulare> {

    @Override
    public void serialize(NumeroCellulare object, JsonGenerator jsonGenerator, SerializerProvider ctxt) throws IOException {
	if (object != null) {
	    jsonGenerator.writeString(object.getValue());
	}

    }
}
