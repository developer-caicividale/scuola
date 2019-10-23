package it.cai.cividale.server.domain.enums;

import lombok.Getter;

@Getter
public enum TipoSesso {
    MASCHIO("M"), //
    FEMMINA("f");

    private final String sigla;

    private TipoSesso(String sigla) {
	this.sigla = sigla;
    }

}
