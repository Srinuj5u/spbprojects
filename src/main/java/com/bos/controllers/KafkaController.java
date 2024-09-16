package com.bos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {


    //Read all messages
    @GetMapping("/")
    public String getAllMessages() {
       return "Welcome to application" ;
    }
    
    @GetMapping("/{msg}")
    public String welcome(@PathVariable("msg") String message) {
       return message+", welcome to application" ;
    }
}
