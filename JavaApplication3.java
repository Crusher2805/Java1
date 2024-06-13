/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Hellou";
        String salir = JOptionPane.showInputDialog(null, " Ingresa salir para terminar el programa ");

        if (salir.equals("salir")){
            System.out.println(" Adios ");
        }else{
            System.out.println(" Hola ");   
        }
    }

}
