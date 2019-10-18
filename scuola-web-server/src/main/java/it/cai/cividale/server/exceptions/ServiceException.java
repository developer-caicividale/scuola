package it.cai.cividale.server.exceptions;

/**
 * Eccezione utilizzata per catturare i fault dei servizi.
 * 
 * @author 913725
 *
 */
public class ServiceException extends ServerException {

    private static final long serialVersionUID = 2247673515605742374L;

    public ServiceException(ECodiceErrore codiceErrore, Object[] objects, Throwable cause) {
	super(codiceErrore, objects, cause);

    }

    public ServiceException(ECodiceErrore codiceErrore) {
	super(codiceErrore);

    }

    public ServiceException(ECodiceErrore codiceErrore, Object[] objects) {
	super(codiceErrore, objects);
    }

}
