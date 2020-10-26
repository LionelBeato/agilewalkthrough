package com.example.demo.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastNameadaf;

    public User(){}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastNameadaf = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastNameadaf;
    }

    public void setLastName(String lastName) {
        this.lastNameadaf = lastName;
    }
}
