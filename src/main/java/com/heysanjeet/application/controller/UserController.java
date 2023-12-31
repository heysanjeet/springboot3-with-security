package com.heysanjeet.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user/v1", produces = "applicatio/json")
public class UserController {

    @GetMapping("/welcome")
    public ResponseEntity<String> sayHello() {
        String message = "Hello, Welcome...";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
