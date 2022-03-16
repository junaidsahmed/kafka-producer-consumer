package com.kafka.service.producer.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {

    @GetMapping(value = "/check",produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloWorld checkStatus(){return new HelloWorld("Java app is running");
    }
}
class HelloWorld{
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}