/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo_isil_s04;

import javax.swing.JOptionPane;

/**
 *
 * @author mustapha Hamdani
 */
public class Point {

    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x coordinate
    public double getX() {
        return x;
    }

    // Setter for x coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y coordinate
    public double getY() {
        return y;
    }

    // Setter for y coordinate
    public void setY(double y) {
        this.y = y;
    }

    // Method to get the point coordinates
    public double[] getPoint() {
        return new double[]{x, y};
    }

    // Method to set the point coordinates
    public void setPoint(double newX, double newY) {
        this.x = newX;
        this.y = newY;
        
        /*
     public void setPointWithScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();
        this.x = x;
        this.y = y;
        scanner.close();
    }
        */
    }

    // Method to calculate distance between two points
    public double distanceTo(Point other) {
        double deltaX = other.x - this.x;
        double deltaY = other.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Method to print the point
    public void printPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        // Example usage
        Point point1 = new Point(3.0, 4.0);
        Point point2 = new Point(6.0, 8.0);

        System.out.print("Point 1: ");
        point1.printPoint();
        System.out.print("Point 2: ");
        point2.printPoint();

        double distance = point1.distanceTo(point2);
        System.out.println("Distance between point1 and point2: " + distance);

        // Example usage of setPoint
        point1.setPoint(10.0, 12.0);
        System.out.print("New coordinates of Point 1: ");
        point1.printPoint();
        
        JOptionPane.showMessageDialog(null, "point 1 : " + point1.x + " , " + point1.y); 
    }
}