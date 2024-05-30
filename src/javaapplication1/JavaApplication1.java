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
        double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite su nota del curso anterior:")); 
        if (nota >= 70) {
                JOptionPane.showMessageDialog(null, "SI aprobo el curso ");
            }else 
           JOptionPane.showMessageDialog(null, "Reprobo el curso ");
       
        
        }
    }
   