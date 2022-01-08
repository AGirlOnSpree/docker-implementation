package com.learn.myApplication.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class UserDetails {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;

    public UserDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserDetails() {

    }
}
