package it.cai.cividale.server.domain.mappers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.domain.mappers.converters.EmailConverterDomain2Model;
import it.cai.cividale.server.domain.mappers.converters.EmailConverterModel2Domain;
import it.cai.cividale.server.domain.mappers.converters.NumeroCellulareConverterDomain2Model;
import it.cai.cividale.server.domain.mappers.converters.NumeroCellulareConverterModel2Domain;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelFactory;

@Component
@SessionScope
public class PersonaMapper {
    private final ModelMapper modelMapper;

    public PersonaMapper() {
	modelMapper = new ModelMapper();
	modelMapper.addConverter(new NumeroCellulareConverterModel2Domain());
	modelMapper.addConverter(new NumeroCellulareConverterDomain2Model());

	modelMapper.addConverter(new EmailConverterModel2Domain());
	modelMapper.addConverter(new EmailConverterDomain2Model());

    }

    public List<Istruttore> domain2model(List<it.cai.cividale.server.domain.Istruttore> istruttoriDomain) {
	List<Istruttore> istruttoriModel = new ArrayList<>();
	for (it.cai.cividale.server.domain.Istruttore istruttoreDomain : istruttoriDomain) {
	    Istruttore istruttoreModel = ModelFactory.eINSTANCE.createIstruttore();
	    modelMapper.map(istruttoreDomain, istruttoreModel);
	    istruttoriModel.add(istruttoreModel);
	}
//	modelMapper.map(materialiDomain, new TypeToken<List<DizMateriale>>() {
//	}.getType());
	return istruttoriModel;
    }
}
