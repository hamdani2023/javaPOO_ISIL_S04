/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student;

import com.person.Person;


/**
 *
 * @author mustapha
 */
// Student class inheriting from Person
public class Student extends Person {
private int id;
      private  String speciaality;

    public Student(String FirstName, String lastName, int age, int id, String Speciaality) {
        super(FirstName, lastName, age);
        this.id = id;
        this.speciaality = Speciaality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     public String getSpeciaality() {
        return speciaality;
    }

    public void setSpeciaality(String Speciaality) {
        this.speciaality = Speciaality;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
          System.out.println("Id: " + this.id);
          System.out.println("Speciality: : " + speciaality);
        
        
              //System.out.println("***********************" );
         // System.out.println(" ------- Test: : " + super.);
        
    }
    }

 class Constants{
      public static final double   PI = 3.14; 
      
      public static double inchToCm(double f){
          return f*2.54;
      }
    }
