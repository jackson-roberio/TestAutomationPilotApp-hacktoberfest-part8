package com.voyager.testautomationpilotserver.controller;

/**
 * @author Prashant Mishra
 */
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.voyager.testautomationpilotserver.exception.PasCoreException;

@RestController
@RequestMapping(value = { "/pas/config/resource" })
public class ResourceCofigCnt {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllResources(HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    /*--------------------------------------------------------------------------------------------*/

    @RequestMapping(value = { "/{resourceType}" }, method = RequestMethod.GET)
    public ResponseEntity<?> getResourceByType(@PathVariable(required = true) String resourceType,
            HttpServletRequest request, HttpServletRequest reponse,
	    @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{resourceType}" }, method = RequestMethod.POST)
    public ResponseEntity<?> addResourceByType(@PathVariable(required = true) String resourceType,
            HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    /*--------------------------------------------------------------------------------------------*/

    @RequestMapping(value = { "/{resourceType}/resourceId" }, method = RequestMethod.GET)
    public ResponseEntity<?> getResourceByTypeAndId(
            @PathVariable(required = true) String resourceType,
            @PathVariable(required = true) String resourceId, HttpServletRequest request,
            HttpServletRequest reponse, @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{resourceType}/resourceId" }, method = RequestMethod.PUT)
    public ResponseEntity<?> modifyResourceByTypeAndId(
            @PathVariable(required = true) String resourceType,
            @PathVariable(required = true) String resourceId, HttpServletRequest request,
            HttpServletRequest reponse, @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{resourceType}/resourceId" }, method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteResourceByTypeAndId(
            @PathVariable(required = true) String resourceType,
            @PathVariable(required = true) String resourceId, HttpServletRequest request,
            HttpServletRequest reponse, @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

}
