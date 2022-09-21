package com.example.hellohtml.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class HelloWorldController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {

        log.info("HelloWorldController::index()");
        return "index.html";
    }

    @RequestMapping(path = "/device", method = RequestMethod.GET)
    public String device() {

        log.info("HelloWorldController::device()");
        return "device.html";
    }
    @RequestMapping(path = "/components", method = RequestMethod.GET)
    public String components() {

        log.info("HelloWorldController::components()");
        return "components.html";
    }
    @RequestMapping(path = "/contact", method = RequestMethod.GET)
    public String contact() {

        log.info("HelloWorldController::contact()");
        return "contact.html";
    }
    @RequestMapping(path = "/form", method = RequestMethod.GET)
    public String form() {

        log.info("HelloWorldController::form()");
        return "form.html";
    }
}
