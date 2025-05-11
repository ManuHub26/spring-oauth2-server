package com.security.authorizationserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @GetMapping(value = "/error")
    public String errorPage() {
        return "error";
    }
}
