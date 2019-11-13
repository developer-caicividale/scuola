/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.caicividale.scuola.emf.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelFactory eINSTANCE = it.caicividale.scuola.emf.model.impl.ModelFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Persona</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Persona</em>'.
     * @generated
     */
    Persona createPersona();

    /**
     * Returns a new object of class '<em>Allievo</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Allievo</em>'.
     * @generated
     */
    Allievo createAllievo();

    /**
     * Returns a new object of class '<em>Corso</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Corso</em>'.
     * @generated
     */
    Corso createCorso();

    /**
     * Returns a new object of class '<em>Iscrizione</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Iscrizione</em>'.
     * @generated
     */
    Iscrizione createIscrizione();

    /**
     * Returns a new object of class '<em>Lezione</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lezione</em>'.
     * @generated
     */
    Lezione createLezione();

    /**
     * Returns a new object of class '<em>Lezione Teorica</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lezione Teorica</em>'.
     * @generated
     */
    LezioneTeorica createLezioneTeorica();

    /**
     * Returns a new object of class '<em>Lezione Pratica</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lezione Pratica</em>'.
     * @generated
     */
    LezionePratica createLezionePratica();

    /**
     * Returns a new object of class '<em>Istruttore</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Istruttore</em>'.
     * @generated
     */
    Istruttore createIstruttore();

    /**
     * Returns a new object of class '<em>Squadra</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Squadra</em>'.
     * @generated
     */
    Squadra createSquadra();

    /**
     * Returns a new object of class '<em>Bilancio</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bilancio</em>'.
     * @generated
     */
    Bilancio createBilancio();

    /**
     * Returns a new object of class '<em>Cassa</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cassa</em>'.
     * @generated
     */
    Cassa createCassa();

    /**
     * Returns a new object of class '<em>Ripartizione Cassa</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ripartizione Cassa</em>'.
     * @generated
     */
    RipartizioneCassa createRipartizioneCassa();

    /**
     * Returns a new object of class '<em>Presenza Lezione</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Presenza Lezione</em>'.
     * @generated
     */
    PresenzaLezione createPresenzaLezione();

    /**
     * Returns a new object of class '<em>Diz Materiale</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diz Materiale</em>'.
     * @generated
     */
    DizMateriale createDizMateriale();

    /**
     * Returns a new object of class '<em>Materiale Noleggiato</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Materiale Noleggiato</em>'.
     * @generated
     */
    MaterialeNoleggiato createMaterialeNoleggiato();

    /**
     * Returns a new object of class '<em>Voce Di Spesa</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voce Di Spesa</em>'.
     * @generated
     */
    VoceDiSpesa createVoceDiSpesa();

    /**
     * Returns a new object of class '<em>Elenco Corsi</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Elenco Corsi</em>'.
     * @generated
     */
    ElencoCorsi createElencoCorsi();

    /**
     * Returns a new object of class '<em>Elenco Iscrizioni</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Elenco Iscrizioni</em>'.
     * @generated
     */
    ElencoIscrizioni createElencoIscrizioni();

    /**
     * Returns a new object of class '<em>Elenco Materiali</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Elenco Materiali</em>'.
     * @generated
     */
    ElencoMateriali createElencoMateriali();

    /**
     * Returns a new object of class '<em>Elenco Istruttori</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Elenco Istruttori</em>'.
     * @generated
     */
    ElencoIstruttori createElencoIstruttori();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ModelPackage getModelPackage();

} //ModelFactory
