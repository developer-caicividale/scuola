package it.cai.cividale.server.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import it.cai.cividale.server.domain.converters.TitoloIstruttoreConverter;
import it.cai.cividale.server.domain.enums.TitoloIstruttore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "istruttore", catalog = "scuolacai")
@PrimaryKeyJoinColumn(name = "id")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Istruttore extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "titolo", nullable = false)
    @Convert(converter = TitoloIstruttoreConverter.class)
    private TitoloIstruttore titolo;

    @Column(name = "is_attivo", nullable = false)
    private boolean isAttivo;

}
