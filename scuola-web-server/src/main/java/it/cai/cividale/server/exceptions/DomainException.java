package it.cai.cividale.server.exceptions;

/**
 * Eccezione utilizzata per catturare i fault del dominio.
 * 
 * @author 913725
 *
 */
public class DomainException extends ServerException {

    private static final long serialVersionUID = 2247673515605742374L;

    public DomainException(ECodiceErrore codiceErrore, Object[] objects, Throwable cause) {
	super(codiceErrore, objects, cause);

    }

    public DomainException(ECodiceErrore codiceErrore) {
	super(codiceErrore);

    }

    public DomainException(ECodiceErrore codiceErrore, Object[] objects) {
	super(codiceErrore, objects);
    }

}
