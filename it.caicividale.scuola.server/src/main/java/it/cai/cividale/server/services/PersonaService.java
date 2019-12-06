package it.cai.cividale.server.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.IstruttoreDao;
import it.cai.cividale.server.domain.mappers.IstruttoreMapper;
import it.caicividale.scuola.emf.model.ElencoIstruttori;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelFactory;
import lombok.RequiredArgsConstructor;

@Service
@SessionScope
@RequiredArgsConstructor
public class PersonaService {

    private final IstruttoreDao istruttoreDao;
    private final IstruttoreMapper mapper;

    public ElencoIstruttori getElencoIstruttori() {
	List<it.cai.cividale.server.domain.Istruttore> istruttoriDomain = istruttoreDao.list();

	List<Istruttore> istruttoriModel = mapper.domain2model(istruttoriDomain);

	ElencoIstruttori elencoIstruttore = ModelFactory.eINSTANCE.createElencoIstruttori();
	elencoIstruttore.getElencoIstruttori().addAll(istruttoriModel);

	return elencoIstruttore;

    }
}
