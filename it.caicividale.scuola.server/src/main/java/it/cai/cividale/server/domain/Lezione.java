package it.cai.cividale.server.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lezione", catalog = "scuolacai")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lezione implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "titolo", nullable = false)
    private String titolo;

    @Column(name = "data_svolgimento", length = 19)
    private Date dataSvolgimento;

    @Column(name = "luogo_svolgimento")
    private String luogoSvolgimento;

    @Column(name = "durata", precision = 12, scale = 0)
    private Float durata;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "presenzalezione_presenzalezione_id")
    private PresenzaLezione presenzaLezione;

    @Column(name = "argomenti_trattati", nullable = false)
    private String argomentiTrattati;

}
