package it.caicividale.scuola.ui.lov;

/**
 * Command specifico per le LOV, viene settata la LOV di partenza per avere a
 * disposizione gli eventuali dati della Lov stessa (filtro, lista, etc)
 * 
 * @author 913725
 * 
 */
public interface ILovCommand<T> extends ICommand {

    // /**
    // * Setta la LOV che ha generato il comando
    // *
    // * @param lov
    // */
    // void setLov(Lov<T> lov);
    //
    // /**
    // * recupera la LOV che ha generato il comando
    // *
    // * @param lov
    // */
    // Lov<T> getLov();
    //
    // /**
    // * qual'ora l'azione introdotta abbia generato un'aggiunta alla lista che ha
    // popolato la lov, l'elemento aggiunto viene riportato
    // *
    // * @return
    // */
    // IObservableValue getResult();
    //
    // /**
    // * Qualora siano state appartate modifiche alla lista della lov, viene
    // restituita la lista aggiornata
    // *
    // * @return
    // */
    // IObservableList getObservableListUpdated();
    //
    // /**
    // * indica se alla fine dell'esecuzione del comando deve essere chiusa la lov
    // *
    // * @return
    // */
    // boolean isLovToClose();

    void doCommand();

}
