package it.cai.cividale.server.exceptions;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Eccezione utilizzata per catturare i fault di tipo server
 * 
 * @author 913725
 *
 */
public class ServerException extends RuntimeException {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerException.class);
    private static final long serialVersionUID = 7161820059403907368L;

    public ServerException() {
	super();
    }

    public ServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	LOGGER.error(message);
	LOGGER.error(cause.getMessage());
    }

    public ServerException(String message, Throwable cause) {

	super(message, cause);
	LOGGER.error(message);
	LOGGER.error(cause.getMessage());
    }

    public ServerException(String message) {
	super(message);
	LOGGER.error(message);
    }

    public ServerException(String message, Object[] objects) {
	super((new MessageFormat(message).format(objects)));
	LOGGER.error((new MessageFormat(message).format(objects)));
    }

    public ServerException(String message, Object[] objects, Throwable cause) {
	super((new MessageFormat(message).format(objects)));
	LOGGER.error((new MessageFormat(message).format(objects)));
	LOGGER.error(cause.getMessage());

    }

    public ServerException(Throwable cause) {
	super(cause);
	LOGGER.error(cause.getMessage());
    }

    public ServerException(ECodiceErrore codiceErrore, Throwable cause) {
	this(codiceErrore.getDescrizioneErrore(), cause);

    }

    public ServerException(ECodiceErrore codiceErrore, Object[] objects, Throwable cause) {
	this(new MessageFormat(codiceErrore.getDescrizioneErrore()).format(objects), objects, cause);
    }

    public ServerException(ECodiceErrore codiceErrore) {
	this(codiceErrore.getDescrizioneErrore());

    }

    public ServerException(ECodiceErrore codiceErrore, Object[] objects) {
	this(new MessageFormat(codiceErrore.getDescrizioneErrore()).format(objects), objects);
    }

}
