package it.cai.cividale.server.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.MaterialeNoleggiatoDao;
import it.cai.cividale.server.domain.mappers.MaterialeNoleggaitoMapper;
import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import lombok.RequiredArgsConstructor;

@Service
@SessionScope
@RequiredArgsConstructor
public class MaterialeNoleggiatoService {

    private final MaterialeNoleggaitoMapper materialeNoleggaitoMapper;
    private final MaterialeNoleggiatoDao materialeNoleggiatoDao;

    public Long nuovoMaterialeNoleggiato(Long idIscrizione, MaterialeNoleggiato materialeNoleggiatoModel) {
	return materialeNoleggiatoDao.save(materialeNoleggaitoMapper.model2Domain(materialeNoleggiatoModel),
		idIscrizione);
    }

    public void aggiornaMaterialeNoleggiato(MaterialeNoleggiato materialeNoleggiatoModel) {

	materialeNoleggiatoDao.update(materialeNoleggaitoMapper.model2Domain(materialeNoleggiatoModel));

    }

    public void cancellaMaterialeNoleggiato(MaterialeNoleggiato materialeNoleggiatoModel) {
	materialeNoleggiatoDao.delete(materialeNoleggaitoMapper.model2Domain(materialeNoleggiatoModel));

    }
}
