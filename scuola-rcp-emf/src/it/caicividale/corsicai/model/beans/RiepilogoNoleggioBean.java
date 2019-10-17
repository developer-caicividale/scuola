package it.caicividale.corsicai.model.beans;

import it.caicividale.corsicai.model.DizMateriale;
import lombok.Data;

@Data
public class RiepilogoNoleggioBean {
    private DizMateriale materiale;
    private Long numeroMateriale;
}
