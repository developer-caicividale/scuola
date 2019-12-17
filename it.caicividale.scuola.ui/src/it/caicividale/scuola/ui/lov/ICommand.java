package it.caicividale.scuola.ui.lov;

import javax.naming.NamingException;

/**
 * Interfaccia che modella un'azione compiuta dall'operatore.<br>
 * 
 * 
 * 
 * @author 913725
 * 
 */
public interface ICommand {
    /**
     * esegue l'azione da intraprendere, tipicamente il metodo &egrave; invocato da
     * un widget (bottone).<br>
     * 
     * @throws NamingException
     */
    void execute();

    /**
     * restituisce e identifica il nome dell'azione da intraprendere
     * 
     * @return
     */
    String getCommandName();

}
