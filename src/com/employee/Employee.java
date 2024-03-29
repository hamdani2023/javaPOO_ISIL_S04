/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.employee;

import com.person.Person;

public class Employee extends Person {

  String company;

  String jobTitle;

  double salary;

  public Employee(String name, String address, int age, String company, String jobTitle, double salary) {

    super(name, address, age);

    this.company = company;

    this.jobTitle = jobTitle;

    this.salary = salary;

  }

  
  public String getCompany() {
    return company;
  }


  public String getJobTitle() {
    return jobTitle;
  }


  public double getSalary() {
    return salary;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public void setSalary(double salary) {
    this.salary = salary;
  }


  @Override
  public void displayInfo() {

    super.displayInfo();

    System.out.println("Company: " + company);

    System.out.println("Job Title: " + jobTitle);

    System.out.println("Salary: " + salary);

  }

}
