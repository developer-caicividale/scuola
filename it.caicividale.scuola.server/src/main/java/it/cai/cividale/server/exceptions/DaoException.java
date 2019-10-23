package it.cai.cividale.server.exceptions;

/**
 * Eccezione utilizzata per catturare i fault dei DAO.
 * 
 * @author 913725
 *
 */
public class DaoException extends ServerException {

    private static final long serialVersionUID = 2247673515605742374L;

    public DaoException(ECodiceErrore codiceErrore, Object[] objects, Throwable cause) {
	super(codiceErrore, objects, cause);

    }

    public DaoException(ECodiceErrore codiceErrore) {
	super(codiceErrore);

    }

    public DaoException(ECodiceErrore codiceErrore, Object[] objects) {
	super(codiceErrore, objects);
    }

}
