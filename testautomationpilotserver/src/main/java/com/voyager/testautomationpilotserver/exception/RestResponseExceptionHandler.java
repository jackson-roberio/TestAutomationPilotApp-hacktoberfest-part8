package com.voyager.testautomationpilotserver.exception;

/**
 * @author Prashant Mishra
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.voyager.testautomationpilotserver.model.ApiErrorResponse;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler({ PasCoreException.class })
    protected ResponseEntity<ApiErrorResponse> pasCoreException(PasCoreException ex,
	    WebRequest request) {
	ApiErrorResponse error = new ApiErrorResponse(ex);
	logError(ex);
	return new ResponseEntity<>(error, ex.getPasCoreExceptionType().getHttpStatus());
    }

    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
	PasCoreException pex = new PasCoreException(PasCoreExceptionType.SERVER_ERROR,
		ex.getStackTrace());
	ApiErrorResponse error = new ApiErrorResponse(pex);
	logError(pex);
	return new ResponseEntity<>(error, pex.getPasCoreExceptionType().getHttpStatus());
    }

    // ignore toString here i'll correct the structure ahead
    private void logError(PasCoreException ex) {
	logger.error("ERROR_CODE:" + ex.getErrorCode() + "::" + ex.getMessage(),
		ex.getTrace().toString());
    }

}
