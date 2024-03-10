/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.person;

/**
 *
 * @author mustapha
 */
// Superclass or parent class
public class Person {

    private String firstName;
    private String lastName;

    private int age;

    public Person(String FirstName, String lastName, int age) {
        this.firstName = FirstName;
        this.lastName = lastName;
        this.age = age;
    }

     protected  String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

     protected String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {

        System.out.println("First Name: " + firstName);
        System.out.println("First Name: " + lastName);

        System.out.println("Age: " + age);

    }

}
