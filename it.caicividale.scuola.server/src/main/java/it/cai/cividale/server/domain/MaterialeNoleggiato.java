package it.cai.cividale.server.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "materiale_noleggiato", catalog = "scuolacai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialeNoleggiato implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dizmateriale_materiale_id")
    private DizMateriale materiale;

    @Column(name = "quantita", nullable = false)
    private short quantita;

    @Column(name = "datanoleggio", nullable = false, length = 19)
    private LocalDate datanoleggio;

}
