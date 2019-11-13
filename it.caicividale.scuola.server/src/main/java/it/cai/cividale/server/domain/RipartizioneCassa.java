package it.cai.cividale.server.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ripartizione_cassa", catalog = "scuolacai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RipartizioneCassa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "sede", nullable = false)
    private String sede;

    @Column(name = "quota", nullable = false, precision = 12, scale = 0)
    private float quota;

}
