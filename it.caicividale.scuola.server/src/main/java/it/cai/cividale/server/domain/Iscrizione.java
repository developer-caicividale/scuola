package it.cai.cividale.server.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "iscrizione", catalog = "scuolacai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Iscrizione implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corso_id")
    private Corso corso;

    @Column(name = "is_modulo_iscrizione")
    private Boolean isModuloIscrizione;

    @Column(name = "is_consenso_informato")
    private Boolean isConsensoInformato;

    @Column(name = "is_nuovo_allievo")
    private Boolean isNuovoAllievo;

    @Column(name = "data_scadenza_certificato_medico")
    private LocalDate dataScadenzaCertificatoMedico;

    @Column(name = "is_bollino_anno_corso")
    private Boolean isBollinoAnnoCorso;

    @Column(name = "caparra", precision = 12, scale = 0)
    private Float caparra;

    @Column(name = "saldo", precision = 12, scale = 0)
    private Float saldo;

    @Column(name = "note")
    private String note;

    @Column(name = "quota_noleggio", precision = 12, scale = 0)
    private Float quotaNoleggio;

    @Column(name = "is_certificato_medico")
    private Boolean isCertificatoMedico;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "allievo_allievo_id", nullable = false)
    private Allievo allievo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<MaterialeNoleggiato> materialiNoleggiati = new ArrayList<>();

}
