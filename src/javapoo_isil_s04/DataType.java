/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo_isil_s04;

/**
 *
 * @author mustapha Hamdani
 */
public class DataType {

    public static void main(String[] args) {
        // Primitive Data Types
        int intValue = 10;

        double doubleValue = 3.14;
        float floatValue = 2.5f; // Note the 'f' suffix for float literals
        char charValue = 'A';
        boolean booleanValue = true;

        // Reference Data Types
        String stringValue = "Hello, World!";
        Integer integerValue = 20; // Integer is a wrapper class for int
        Double doubleObject = 6.28; // Double is a wrapper class for double

        // Explicit Type Conversion (Casting)
        int intValueFromDouble = (int) doubleValue;
        float floatValueFromInt = (float) intValue;

        // Implicit Type Conversion
        int intValueFromChar = charValue; // Implicitly converts char to int

        // Output values
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
        System.out.println("Integer: " + integerValue);
        System.out.println("Double: " + doubleObject);
        System.out.println("int from double (Explicit): " + intValueFromDouble);
        System.out.println("float from int (Explicit): " + floatValueFromInt);
        System.out.println("int from char (Implicit): " + intValueFromChar);
    }
}
