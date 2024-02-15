/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_Student;

/**
 *
 * @author mustapha
 */
// Person class
class Person {
    protected String name;
    protected int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // Method to update information
    public void update(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Information updated successfully.");
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
}
