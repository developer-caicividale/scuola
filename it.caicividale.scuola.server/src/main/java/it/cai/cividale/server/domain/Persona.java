package it.cai.cividale.server.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import it.cai.cividale.server.domain.converters.TipoSessoConverter;
import it.cai.cividale.server.domain.enums.TipoSesso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "persona", catalog = "scuolacai")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cognome", nullable = false)
    private String cognome;

    @Column(name = "sesso")
    @Convert(converter = TipoSessoConverter.class)
    private TipoSesso sesso;

    @Column(name = "numero_cellulare")
    private String numeroCellulare;

    @Column(name = "email")
    private String email;

    @Column(name = "residenza_via", nullable = false)
    private String residenzaVia;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_comune_residenza")
    private DizComune comuneResidenza;

    @Column(name = "nascita_data", nullable = false, length = 19)
    private LocalDate nascitaData;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_comune_nascita")
    private DizComune comuneNascita;

    @Column(name = "sezione_cai_appartenenza", nullable = false)
    private String sezioneCaiAppartenenza;

    @Column(name = "is_staff_scuola", nullable = false)
    private boolean isStaffScuola;

}
