package com.example.banquesecurity.controller;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController("/api/")
public class UserController {
    @PostMapping("users")
    public void  addUser(){
        UserDetails user = User.builder()
                .username("user1")
                .password("AZER")
                .roles("USER")
                .build();
    }

    @PutMapping("users")
    public void  updateUser(){
        UserDetails user = User.builder()
                .username("user1")
                .password("AZER")
                .roles("USER")
                .build();
    }
    @DeleteMapping("users")
    public void  deleteUser(){
        UserDetails user = User.builder()
                .username("user1")
                .password("AZER")
                .roles("USER")
                .build();
    }
    @GetMapping("users")
    public void  getUser(){
        UserDetails user = User.builder()
                .username("user1")
                .password("AZER")
                .roles("USER")
                .build();
    }


}
