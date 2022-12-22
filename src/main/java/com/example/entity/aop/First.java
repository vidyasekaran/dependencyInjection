package com.example.entity.aop;

public class First {

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public First(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
