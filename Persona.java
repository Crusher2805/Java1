/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */

public class Persona {
    public int cedula;
    public String nombre;
    public int anionacimiento;
    public int edad;
    public int estatura;
    
    public void trackear(){
        JOptionPane.showMessageDialog(null, nombre + " Esta ensamblando ");
    }
    
    public void realizar_pruebas(){
        JOptionPane.showMessageDialog(null, " La persona con el id " + cedula + " Esta realizando pruebas de conexion ");
    }      
    
}
