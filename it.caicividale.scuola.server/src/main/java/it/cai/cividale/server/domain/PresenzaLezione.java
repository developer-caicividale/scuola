package it.cai.cividale.server.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "presenza_lezione", catalog = "scuolacai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PresenzaLezione implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Istruttore> istruttoriPresenti = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Allievo> allieviPresenti = new ArrayList<>();

}
