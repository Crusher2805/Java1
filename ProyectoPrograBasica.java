/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package proyectoprograbasica;

import javax.swing.JOptionPane;



public class ProyectoPrograBasica {

 
    public static void main(String[] args) {
       int capacidad = 10;
        RegistroEventos registro = new RegistroEventos(capacidad);

        int cantidadEventos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de eventos a registrar:"));

        for (int i = 0; i < cantidadEventos; i++) {
            registro.agregarEvento();
        }

        registro.mostrarEventos();
    }
}