package it.cai.cividale.server.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import it.cai.cividale.server.domain.enums.TipoVoceDiSpesa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "voce_di_spesa", catalog = "scuolacai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoceDiSpesa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "titolo", nullable = false)
    private String titolo;

    @Column(name = "valore", nullable = false, precision = 12, scale = 0)
    private float valore;

    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoVoceDiSpesa tipo;

    @Column(name = "nota")
    private String nota;

    @Column(name = "data", nullable = false)
    private LocalDate data;

}
