package com.voyager.testautomationpilotserver.exception;

/**
 * @author Prashant Mishra
 */
import java.time.LocalDateTime;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import lombok.Getter;

public class PasCoreException extends Exception {

    private static final long serialVersionUID = 8146124648181104043L;

    @Getter
    private transient LocalDateTime timestamp;

    @Getter
    private String errorCode;

    @Getter
    private String customMessage;

    @Getter
    private PasCoreExceptionType pasCoreExceptionType;

    @Getter
    private StackTraceElement[] trace;

    public PasCoreException(PasCoreExceptionType pasCoreExceptionType, StackTraceElement[] trace) {
	super(pasCoreExceptionType.getReason());
	this.errorCode = RandomStringUtils.randomAlphanumeric(10);
	this.customMessage = pasCoreExceptionType.getReason();
	this.pasCoreExceptionType = pasCoreExceptionType;
	this.trace = trace;
	this.timestamp = LocalDateTime.now();
    }

    public PasCoreException(String customMessage, PasCoreExceptionType pasCoreExceptionType,
	    StackTraceElement[] trace) {
	super(StringUtils.isNotBlank(customMessage) ? customMessage
		: pasCoreExceptionType.getReason());
	this.errorCode = RandomStringUtils.randomAlphanumeric(10);
	this.customMessage = customMessage;
	this.pasCoreExceptionType = pasCoreExceptionType;
	this.trace = trace;
	this.timestamp = LocalDateTime.now();
    }

    public PasCoreException(String customMessage, PasCoreExceptionType pasCoreExceptionType) {
	super(StringUtils.isNotBlank(customMessage) ? customMessage
		: pasCoreExceptionType.getReason());
	this.errorCode = RandomStringUtils.randomAlphanumeric(10);
	this.customMessage = customMessage;
	this.pasCoreExceptionType = pasCoreExceptionType;
	this.timestamp = LocalDateTime.now();
    }

    public LocalDateTime getTimestamp() {
	return timestamp;
    }

    public String getCustomMessage() {
	return customMessage;
    }

    public PasCoreExceptionType getPasCoreExceptionType() {
	return pasCoreExceptionType;
    }

    public StackTraceElement[] getTrace() {
	return trace;
    }

    public String getErrorCode() {
	return errorCode;
    }

}
