/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp1;

import javax.swing.JOptionPane;

/**
 *
 * @author David Hernandez
 */
public class JavaApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, " Digita el numero de filas deseadas "));
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
