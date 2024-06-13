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
public class Fabrica {
    
    public int Id_fabrica;
    public String nombre;
    public int aniocreacion;
    public String tipo_fabrica;
    
    public void producir(){
        JOptionPane.showMessageDialog(null, " La empresa " + nombre + " esta produciendo ");
    }
    
    public void calc(int anti_fabrica){
        int result = 0;
        result = aniocreacion - anti_fabrica;
        JOptionPane.showMessageDialog(null, " La fabrica " + nombre + " tiene " + result + " años de antiguedad ");
    }      
    
}
