/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_employee;

/**
 *
 * @author mustapha
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(" \n********** Person **********");

        // Create a Person object
        Person pers = new Person("Person Name", "Person adress", 30);

        // Introduce the person
        pers.displayInfo();

        // Create an Employee object, inheriting from Person
        Employee emp = new Employee("Employee Name", "Employee adress", 25, "Acme Corp", "Software Engineer", 80000.0);

        System.out.println(" \n********** Employee **********");

        // Introduce the employee using both Person and Employee methods
        emp.displayInfo();// Calls Person's introduce()
        System.out.println("Additionally, I work as a " + emp.getJobTitle() + " at " + emp.getCompany() + ".");

        System.out.println(" \n ********** Test methods ********** ");

        System.out.println("call Method - getAge() - from class  Person --> " + emp.getAge());

        
        System.out.println(" \n ********** Test Access to variable ********** ");
       // System.out.println("person.name " + pers.name);
        System.out.println();
        
    }
}
