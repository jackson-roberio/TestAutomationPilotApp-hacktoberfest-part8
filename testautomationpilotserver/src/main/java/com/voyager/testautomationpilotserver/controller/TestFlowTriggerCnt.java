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
@RequestMapping(value = { "/pas/trigger/testflow" })
public class TestFlowTriggerCnt {

    @RequestMapping(value = { "/{testFlowId}/status" }, method = RequestMethod.POST)
    public ResponseEntity<?> statusTestFlowById(@PathVariable(required = true) String testFlowId,
            HttpServletRequest request, HttpServletRequest reponse, @RequestBody String requestBody)
            throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{testFlowId}/start" }, method = RequestMethod.POST)
    public ResponseEntity<?> startTestFlowById(@PathVariable(required = true) String testFlowId,
            HttpServletRequest request, HttpServletRequest reponse, @RequestBody String requestBody)
            throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{testFlowId}/pause" }, method = RequestMethod.POST)
    public ResponseEntity<?> pauseTestFlowById(@PathVariable(required = true) String testFlowId,
            HttpServletRequest request, HttpServletRequest reponse, @RequestBody String requestBody)
            throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{testFlowId}/stop" }, method = RequestMethod.POST)
    public ResponseEntity<?> stopTestFlowById(@PathVariable(required = true) String testFlowId,
            HttpServletRequest request, HttpServletRequest reponse, @RequestBody String requestBody)
            throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{testFlowId}/schedule" }, method = RequestMethod.POST)
    public ResponseEntity<?> scheduleTestFlowById(@PathVariable(required = true) String testFlowId,
            HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

}
