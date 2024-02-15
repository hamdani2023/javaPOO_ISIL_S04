/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_Student;

/**
 *
 * @author mustapha
 */
// Student class inheriting from Person
class Student extends Person {
    private int studentId;
    
    // Constructor
    public Student(String name, int age, int studentId) {
        super(name, age); // Calling constructor of superclass (Person)
        this.studentId = studentId;
    }
    
    // Method to display information
    @Override
    public void display() {
        super.display(); // Call display method of superclass (Person)
        System.out.println("Student ID: " + studentId);
    }
    
    // Method to update information
    public void update(String name, int age, int studentId) {
        super.update(name, age); // Call update method of superclass (Person)
        this.studentId = studentId;
        System.out.println("Student ID updated successfully.");
    }
    
    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }
}


