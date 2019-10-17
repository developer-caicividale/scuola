package it.cai.cividale.server.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import it.cai.cividale.server.domain.enums.SiglaCorso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "corso", catalog = "scuolacai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Corso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "quota_iscrizione", nullable = false, precision = 12, scale = 0)
    private float quotaIscrizione;

    @Column(name = "quota_caparra", nullable = false, precision = 12, scale = 0)
    private float quotaCaparra;

    @Column(name = "is_modulo", nullable = false)
    private boolean isModulo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "istruttore_direttore_id")
    private Istruttore direttore;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "istruttore_vicedirettore_id")
    private Istruttore viceDirettore;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_segretario_id")
    private Persona segretario;

    @Column(name = "testo")
    private String testo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bilancio_bilancio_id")
    private Bilancio bilancio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cassa_cassa_id")
    private Cassa cassa;

    @Column(name = "data_inizio", nullable = false, length = 19)
    private LocalDate dataInizio;

    @Column(name = "data_fine", nullable = false, length = 19)
    private LocalDate dataFine;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sigla", nullable = false)
    @Enumerated(EnumType.STRING)
    private SiglaCorso sigla;

    @Column(name = "equipaggiamento")
    private String equipaggiamento;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Iscrizione> iscrizioni = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Istruttore> staffIstruttori = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Corso> moduli = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<LezionePratica> lezioniPratiche = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<LezioneTeorica> lezioniTeoriche = new ArrayList<>();

}
