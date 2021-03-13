package com.prac.covid19.healthcheck.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/api/hello", produces = "application/json")
    public Response hello() {
        return new Response("Hello, World!");
    }

    @Value
    static class Response {
        @JsonProperty("message")
        String message;
    }
}
