package com.heysanjeet.application.controller;

import com.heysanjeet.application.domain.UserInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user/v1", produces = "applicatio/json")
public class UserController {

    @GetMapping("/welcome")
    public ResponseEntity<String> sayHello() {
        String message = "Hello, Welcome...";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("/saveUser")
    public ResponseEntity<UserInfo> saveUser(@RequestBody UserInfo userInfo) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/updateUser")
    public ResponseEntity<UserInfo> updateUser(@RequestBody UserInfo userInfo) {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
