package it.cai.cividale.server.domain.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.caicividale.scuola.emf.model.Allievo;

@Component
@SessionScope
public class AllievoMapper {
    private final ModelMapper modelMapper;

    public AllievoMapper() {
	modelMapper = new ModelMapper();

    }

    public it.cai.cividale.server.domain.Allievo model2domain(Allievo model) {
	return modelMapper.map(model, it.cai.cividale.server.domain.Allievo.class);
    }
}
