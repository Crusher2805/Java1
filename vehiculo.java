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
public class vehiculo {

    public int placa;
    public String modelo;
    public String transmision;
    public int amodelo;
    
    public void andar() {
        JOptionPane.showMessageDialog(null, " El vehiculo con la placa " + placa + " andando ");
    }
}
