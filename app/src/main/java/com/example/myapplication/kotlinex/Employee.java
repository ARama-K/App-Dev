package com.example.myapplication.kotlinex;

public class Employee {
    String name;
    int image;
    String mail;
    public Employee(String name, String mail,int image){
        this.name=name;
        this.image=image;
        this.mail=mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return image;
    }

    public void setAge(int age) {
        this.image = age;
    }

    public String getPostalAddress() {
        return mail;
    }

    public void setPostalAddress(String postalAddress) {
        this.mail = postalAddress;
    }
}
