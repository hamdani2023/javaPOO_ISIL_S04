/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.student;

/**
 *
 * @author mustapha
 */
// Person class
class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display information
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
    
    // Method to update information
    public void update(String name, int age) {
        this.setName(name);
        this.setAge(age);
        System.out.println("Information updated successfully.");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
     
}
