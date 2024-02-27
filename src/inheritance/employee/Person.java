/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.employee;

/**
 *
 * @author mustapha
 */
// Superclass or parent class
class Person {

    protected String name;

    private String address;
    private int age;

    public Person(String name, String address, int age) {

        this.name = name;

        this.address = address;

        this.age = age;

    }

    public String getName() {

        return name;

    }

    public String getAddress() {

        return address;

    }

    public int getAge() {

        return age;

    }

    public void displayInfo() {

        System.out.println("Name: " + name);

        System.out.println("Address: " + address);

        System.out.println("Age: " + age);

    }

}
