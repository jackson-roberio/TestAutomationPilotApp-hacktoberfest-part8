package com.voyager.testautomationpilotserver.model;

/**
 * @author Prashant Mishra
 */
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.voyager.testautomationpilotserver.exception.PasCoreException;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiErrorResponse implements Serializable {

    private String timestamp;

    private String errorCode;

    private Integer id;

    private String message;

    private ApiErrorResponse() {
	this.timestamp = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
    }

    public ApiErrorResponse(String errorCode, Integer id, String message) {
	this();
	this.errorCode = errorCode;
	this.id = id;
	this.message = message;
    }

    public ApiErrorResponse(PasCoreException ex) {
	this();
	this.errorCode = ex.getErrorCode();
	this.id = ex.getPasCoreExceptionType().getId();
	this.message = ex.getPasCoreExceptionType().getReason();
    }

    public String getTimestamp() {
	return timestamp;
    }

    public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getErrorCode() {
	return errorCode;
    }

    public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
    }

}
