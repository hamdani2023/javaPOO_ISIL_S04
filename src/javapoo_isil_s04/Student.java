/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo_isil_s04;

/**
 *
 * @author mustapha
 */
public class Student {

    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] listStudents = new Student[3];

        // Initialize the Student objects and add them to the array
        listStudents[0] = new Student(1, "Alice");
        listStudents[1] = new Student(2, "Bob");
        listStudents[2] = new Student(3, "Charlie");

        // Print the details of each student
        //Using For-each loop
        System.out.println("Student details:");
        for (Student stud : listStudents) {
            System.out.println("ID: " + stud.getId() + ", Name: " + stud.getName());
        }
    }
}
