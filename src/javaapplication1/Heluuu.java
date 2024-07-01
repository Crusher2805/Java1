/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp1;

/**
 *
 * @author Armando_Hernandez_Mo
 */
public class Heluuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo(Combustible.GASOLINA);
        Vehiculo vehiculo2 = new Vehiculo(Combustible.DIESEL);
        Vehiculo vehiculo3 = new Vehiculo(Combustible.ELECTRICO);

        System.out.println(vehiculo1.aString());
        System.out.println(vehiculo2.aString());
        System.out.println(vehiculo3.aString());

        System.out.println("Estatus de consumo del vehículo 1: " + vehiculo1.estatusConsumo());
        System.out.println("Día de restricción del vehículo 1: " + vehiculo1.diaRestriccion());
    }
}
