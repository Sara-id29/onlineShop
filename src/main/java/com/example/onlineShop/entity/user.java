package com.example.onlineShop.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class user {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id ;

    private String userName ;
    private String password;

    private String  name;
    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
