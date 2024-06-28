/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package proyectoprograbasica;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;


public class ProyectoPrograBasica {

 
    public static void main(String[] args) {
        // TODO code application logic here
        // Avance para el proyecto de progra, pls si algo esta mal lo corrigen y lo van subiendo a un directorio en git :)
        // Esta parte funciona para entrar al sistema :)
        String Lectura1;
        byte edad;
        Lectura1 = JOptionPane.showInputDialog("Bienvenido al Sistema De Registro del Zoologico UFIDE, cuál es su nombre?");
        edad = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite su edad"));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema!");
            byte opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "1.Registro de animales\n2.Registro de habitats\n3.Registro de eventos\n4.Registro de visitantes\n5.Gestión de alimentación\n6.Mapa del zoologico"
                    + "\n\nDigite el número de la opcion que desea ver:"));
            
        }else{
            JOptionPane.showMessageDialog(null, "No tiene acceso al sistema, intentelo mas tarde");
        }
    }       
 }                   
                
                
    
    

