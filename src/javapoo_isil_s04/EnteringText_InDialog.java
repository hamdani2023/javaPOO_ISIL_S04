/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo_isil_s04;

import javax.swing.JOptionPane;

/**
 *
 * @author mustapha
 */
public class EnteringText_InDialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        // display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, "Welecom " + name);

    }
}
