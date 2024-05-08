package com.userService.userService.controller;

import com.userService.userService.entity.User;
import com.userService.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public ResponseEntity<User>CreateUser(@RequestBody User user)
    {
      User user1=  userService.saveUsre(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @GetMapping("/all")
    public ResponseEntity<List<User>>getAll()
    {
       List<User>  user=userService.findUser();
        return ResponseEntity.ok(user);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User>getById(@PathVariable String id)
    {
        User user=userService.findUserById(id);
        return ResponseEntity.ok(user);
    }
}
