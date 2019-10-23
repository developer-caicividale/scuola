package it.caicividale.scuola.emf.model.beans;

import it.caicividale.scuola.emf.model.DizMateriale;
import lombok.Data;

@Data
public class RiepilogoNoleggioBean {
    private DizMateriale materiale;
    private Long numeroMateriale;
}
