package com.voyager.testautomationpilotserver.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public enum PasCoreExceptionType implements Serializable {

    SERVICE_NOT_REACHABLE(1, HttpStatus.SERVICE_UNAVAILABLE, "service is not reachable!"),

    SERVER_ERROR(2, HttpStatus.INTERNAL_SERVER_ERROR, "something went wrong!"),

    DB_FAILURE(4, HttpStatus.SERVICE_UNAVAILABLE, "Database not reachable!"),

    TOKEN_EXPIRED(5, HttpStatus.UPGRADE_REQUIRED, "Access Token Expired.!"),

    INVALID_TOKEN(6, HttpStatus.UNAUTHORIZED, "Unauthorized or invalid token.!"),

    FORBIDDEN(7, HttpStatus.UNAUTHORIZED,
	    "You don't have sufficient privileges to perfrom this action.!"),

    BAD_CREDENTIALS(8, HttpStatus.UNAUTHORIZED, "Invalid credentials.!"),

    JSON_PARSING_ERROR(9, HttpStatus.NOT_ACCEPTABLE, "Error while parsing Json Object.!"),

    BAD_REQUEST_PARAM(10, HttpStatus.BAD_REQUEST, "Improper request parameter!"),

    RESOURCE_NOT_AVAILABLE(11, HttpStatus.NOT_FOUND, "Resource not available!"),

    KAFKA_PRODUCER_EXCEPTION(12, HttpStatus.INTERNAL_SERVER_ERROR, "Exception in kafka producer"),

    NO_IOR_FILE(13, HttpStatus.INTERNAL_SERVER_ERROR, "IOR file not found"),

    NO_SUCH_BEAN_FOUND(14, HttpStatus.OK, "No such bean found");

    private final int id;

    private final HttpStatus httpStatus;

    private final String reason;

    PasCoreExceptionType(int id, HttpStatus httpStatus, String reason) {
	this.id = id;
	this.httpStatus = httpStatus;
	this.reason = reason;
    }

    public int getId() {
	return id;
    }

    public HttpStatus getHttpStatus() {
	return httpStatus;
    }

    public String getReason() {
	return reason;
    }
}
