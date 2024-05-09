package com.example.onlineShop.services;

import com.example.onlineShop.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlineShop.Repositories.userRepositoryInt;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class userService {

    @Autowired
    private userRepositoryInt userRepositoryInt;
    public Optional<user> findUserById(Long id )
    {
        return userRepositoryInt.findById(id);
    }
    public  user addUser(user u)
    {
        return userRepositoryInt.save(u);
    }
    public user updateUser(Long id, user updateduser) {

//       System.out.println("i am an udated user="+ updateduser.getName()+updateduser.getEmail());
        user existinguser = userRepositoryInt.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        existinguser.setName(updateduser.getName());
        existinguser.setEmail(updateduser.getEmail());
        existinguser.setPassword(updateduser.getPassword());
        return userRepositoryInt.save(existinguser);
    }       // userService

    public user login(String userName , String password)
    {
        return userRepositoryInt.login(userName,password);
    }
}
