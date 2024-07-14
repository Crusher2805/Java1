/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograbasica;

import javax.swing.JOptionPane;


public class RegistroEventos {
    public String[] nombre;
    public String[] fecha;
    public int[] id;
    public String[] descripcion;
    public int contador;

    public RegistroEventos(int capacidad) {
        nombre = new String[capacidad];
        fecha = new String[capacidad];
        id = new int[capacidad];
        descripcion = new String[capacidad];
        contador = 0;
    }

    public void agregarEvento() {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del evento:");
        String fecha1 = JOptionPane.showInputDialog("Ingrese la fecha del evento:");
        int id1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento:"));
        String descripcion1 = JOptionPane.showInputDialog("Ingrese una descripcion para el evento:");

        nombre[contador] = nombre1;
        fecha[contador] = fecha1;
        id[contador] = id1;
        descripcion[contador] = descripcion1;
        contador++;
    }

    public void mostrarEventos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Evento " + (i + 1) + ":");
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Fecha: " + fecha[i]);
            System.out.println("ID: " + id[i]);
            System.out.println("Descripcion: " + descripcion[i]);
            System.out.println();
        }
    }
}