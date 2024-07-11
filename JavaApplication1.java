/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las filas que deseas "));
        int columna = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa las columnas que columnas "));
        int matriz[][] = new int [filas][columna];
        solicitarDatos(matriz, filas, columna);
        imprimeDatos(matriz, filas, columna);
        sumarDatos(matriz, filas, columna);
        
        
    }

   public static void solicitarDatos (int matriz[][], int filas, int columnas ){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a usar " + i + " columna " + j));
            }
        }
    }
    
    public static void imprimeDatos(int matriz[][], int filas, int columnas){
        String resultado = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado = resultado + matriz[i][j] + " ";
            }
            resultado = resultado + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    public static void sumarDatos(int matriz[][], int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                
            }
            
        }
    
    
    
    }
    
}
