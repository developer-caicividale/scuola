package it.cai.cividale.server.domain;
// Generated 15-ott-2019 11.50.50 by Hibernate Tools 5.2.12.Final

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Squadra generated by hbm2java
 */
@Entity
@Table(name = "squadra", catalog = "scuolacai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Squadra implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "istruttore_caposquadra_id")
    private Istruttore capoSquadra;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Istruttore> staffSquadra = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Allievo> allievi = new ArrayList<>();

}
