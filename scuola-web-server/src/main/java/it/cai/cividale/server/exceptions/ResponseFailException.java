package it.cai.cividale.server.exceptions;

/**
 * Eccezione utilizzata qualora la resonse di un servizio da KO invece di OK
 * 
 * @author 913725
 *
 */
public class ResponseFailException extends ServerException {

    private static final long serialVersionUID = 2247673515605742374L;

    public ResponseFailException(ECodiceErrore codiceErrore, Object[] objects, Throwable cause) {
	super(codiceErrore, objects, cause);

    }

    public ResponseFailException(ECodiceErrore codiceErrore) {
	super(codiceErrore);

    }

    public ResponseFailException(ECodiceErrore codiceErrore, Object[] objects) {
	super(codiceErrore, objects);
    }

}
