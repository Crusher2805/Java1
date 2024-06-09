/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp1;

import javax.swing.JOptionPane;

/**
 *
 * @author Armando_Hernandez_Mo
 */
public class Tablas_multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tablas = Integer.parseInt(JOptionPane.showInputDialog(null, " Digita el numero que deseas su tabla de multiplicar "));
        for (int i = 1; i <= 10; i++) {
            int resultado = tablas * i;
            JOptionPane.showMessageDialog(null, " El resultado de " + tablas + " * " + i + " es " + resultado);
        }

    }
    
}

