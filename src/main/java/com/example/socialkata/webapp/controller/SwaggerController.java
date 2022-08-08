package com.example.socialkata.webapp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    private final Logger logger = LogManager.getLogger(SwaggerController.class); // configured by INFO level

    @RequestMapping(value = "/custom", method = RequestMethod.POST)
    public String custom() {
        return "custom";
    }


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user() {
        logger.info("Info Message");
        logger.debug("Debug Message"); // not tracked
        logger.warn("Warn message");
        logger.error("Error message");
        return "user";
    }
}
