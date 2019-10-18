package it.cai.cividale.server.domain.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import it.cai.cividale.server.domain.Corso;

@Mapper
public interface CorsoMapper {
    CorsoMapper INSTANCE = Mappers.getMapper(CorsoMapper.class);

    Corso corsoDomainToCorsoModel(it.caicividale.corsicai.model.Corso corsoModel);

    it.caicividale.corsicai.model.Corso corsoModelToCorsoDomain(Corso corsoModel);
}
