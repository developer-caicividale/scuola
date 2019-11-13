package it.caicividale.scuola.rest.json.deserializer;

import java.io.IOException;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import it.caicividale.scuola.emf.model.valueobject.EMail;

public class EMailDeserializer extends JsonDeserializer<EMail> {

    @Override
    public EMail deserialize(JsonParser jsonParser, DeserializationContext ctxt)
	    throws IOException, JsonProcessingException {
	EMail vo = null;
	ObjectCodec oc = jsonParser.getCodec();

	JsonNode node = oc.readTree(jsonParser);

	if (node != null) {
	    JsonNode codice = node.findValue("codice");
	    if (codice != null) {
		String text = Optional.ofNullable(codice.asText()).orElse("");
		if (!text.trim().isEmpty()) {
		    vo = new EMail(text);
		}
	    }
	}
	return vo;
    }
}
