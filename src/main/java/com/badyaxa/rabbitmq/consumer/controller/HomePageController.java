package com.badyaxa.rabbitmq.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomePageController {
    @GetMapping
    public String home() {
        return "<h1>rabbitmq.consumer:8082</h1>"
                + "<h3>publisher POST localhost:8081/message</h3>"
                + "<h3>consumer POST localhost:8082/message</h3>"
                + "<h3>rabbitmq <a href=\"http://localhost:15672\">localhost:15672</a></h3>";
    }
}
