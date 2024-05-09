package com.example.onlineShop.controller;

import com.example.onlineShop.entity.user;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import com.example.onlineShop.services.userService;

import java.util.Optional;

@RestController
public class userController {

    @Autowired
    private userService userService;

    @PostMapping("users/addUser")
    public @ResponseBody user addUser(@RequestBody user u )
    {
        return userService.addUser(u);
    }

    @GetMapping("user/findUserId/{id}")
    public @ResponseBody Optional<user> findUserById(@PathVariable("id") Long id )
    {
        return this.userService.findUserById(id);
    }
    @PutMapping("/update/{id}")
    public user updateUser(@PathVariable("id") Long id, @RequestBody user updatedUser) {
        System.out.println("i am an udated user control="+ updatedUser.getName()+updatedUser.getEmail());

        return  userService.updateUser(id, updatedUser);
    }
    @PostMapping("/users/login/")
    public @ResponseBody user login(@RequestBody user u)
    {
        return userService.login(u.getUserName(),u.getPassword());
    }
// controllers
}
