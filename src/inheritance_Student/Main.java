/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_Student;

/**
 *
 * @author mustapha
 */
// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John", 30);
        System.out.println("Person Information:");
        person.display();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println();
        
        // Updating Person information
        person.update("Jane", 35);
        System.out.println("Updated Person Information:");
        person.display();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println();
        
        // Creating a Student object
        Student student = new Student("Alice", 20, 1234);
        System.out.println("Student Information:");
        student.display();
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println();
        
        // Updating Student information
        student.update("Bob", 22, 5678);
        System.out.println("Updated Student Information:");
        student.display();
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
    }
}