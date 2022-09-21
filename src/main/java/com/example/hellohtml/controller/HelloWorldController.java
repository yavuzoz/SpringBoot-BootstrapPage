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

    @RequestMapping(path = "/about", method = RequestMethod.GET)
    public String about() {

        log.info("HelloWorldController::about()");
        return "about.html";
    }
}
