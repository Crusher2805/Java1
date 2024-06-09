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
public class Cuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Los numeros entre 20 y 30 son ");
        for (int i = 20; i <= 30; i++) {
            int cuadrado = i * i;
            System.out.println(i + " a la 2 es " + cuadrado);
        
    }
    
}
    
}