package com.heysanjeet.application.controller;

import com.heysanjeet.application.domain.UserInfo;
import com.heysanjeet.application.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user/v1", produces = "applicatio/json")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public ResponseEntity<UserInfo> saveUserInfo(@RequestBody UserInfo userInfo) {

        UserInfo user = userService.saveUser(userInfo);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/getUserById/{userId}")
    public ResponseEntity<UserInfo> getUserById(@PathVariable("userId") Integer userId) {
        UserInfo user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserInfo>> getAllUser(@RequestBody UserInfo userInfo) {
        List<UserInfo> allUsers = userService.getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @PutMapping("updateUserById/{userid}")
    public ResponseEntity<UserInfo> updateuser(@PathVariable("userId") Integer userId, @RequestBody UserInfo userInfo) {
        userInfo.setUserId(userId);
        UserInfo user = userService.updateUser(userInfo);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("deleteUser/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable("userId") Integer userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>("User has been deleted", HttpStatus.OK);
    }
}
