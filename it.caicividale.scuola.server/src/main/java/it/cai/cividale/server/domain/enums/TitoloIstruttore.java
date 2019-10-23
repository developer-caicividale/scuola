/**
 */
package it.cai.cividale.server.domain.enums;

import lombok.Getter;

@Getter
public enum TitoloIstruttore {

    ISTRUTTORE_SEZIONALE("IS"), //

    ISTRUTTORE_ALPINISMO("IA"), //

    ISTRUTTORE_SCIALPINISMO("ISA"), //

    ISTRUTTORE_SCI_FONDO_ESCURSIONISMO("ISFE"), //

    ISTRUTTORE_NAZIONALE_ALPINISMO("INA"), //

    ISTRUTTORE_NAZIONALE_SCIALPINISMO("INSA"), //

    ASPIRANTE_ISTRUTTORE("ASP"), //

    ISTRUTORE_ARRAMPICATA_LIBERA("IAL"), //

    ISTRUTORE_NAZIONALE_ARRAMPICATA_LIBERA("INAL");

    private final String sigla;

    private TitoloIstruttore(String sigla) {
	this.sigla = sigla;
    }

}
