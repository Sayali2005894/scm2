package com.example.scm2.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Contact")
public class Contact {
    //primary key
    @Id
    // id auto genrate serialwise
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public String username;


    public String  email;


    public String  phone;


    public String nickname;

    // GETTER SETTER



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

