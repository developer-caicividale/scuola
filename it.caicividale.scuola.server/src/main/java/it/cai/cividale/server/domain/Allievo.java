package it.cai.cividale.server.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "allievo", catalog = "scuolacai")
@PrimaryKeyJoinColumn(name = "id")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Allievo extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "is_diploma")
    private Boolean isDipoma;

}
