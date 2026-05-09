package com.example.scm2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
    @Id
    @GeneratedValue
    public String username;


    public String  email;


    public String  phone;


    public String nickname;

}
