package com.example.ameyashanbhag.retreive;


/**
 * Created by ameya.shanbhag on 22/01/17.
 */

public class User {

    //name and address string
    private String name;
    private String number;
    private String last;
    private String email;

    public User() {
      /*Blank default constructor essential for Firebase*/
    }
    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber(String number) {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString(){
        return name+"  "+email;

    }

}
