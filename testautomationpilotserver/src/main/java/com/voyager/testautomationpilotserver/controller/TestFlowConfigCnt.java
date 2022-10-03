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
@RequestMapping(value = { "/pas/config/testflow" })
public class TestFlowConfigCnt {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllTestFlows(HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{testFlowId}" }, method = RequestMethod.GET)
    public ResponseEntity<?> getTestFlowById(@PathVariable(required = true) String testFlowId,
            HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{testFlowId}" }, method = RequestMethod.POST)
    public ResponseEntity<?> addTestFlowById(@PathVariable(required = true) String testFlowId,
            HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{testFlowId}" }, method = RequestMethod.PUT)
    public ResponseEntity<?> modifyTestFlowById(
            @PathVariable(required = true) String testFlowId, HttpServletRequest request,
            HttpServletRequest reponse, @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{testFlowId}" }, method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTestFlowById(
            @PathVariable(required = true) String testFlowId, HttpServletRequest request,
            HttpServletRequest reponse, @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

}
