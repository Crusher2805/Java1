/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Aulas Heredia
 */



public class Secretario {

    public String placa;
    public String modelo;
    public int aniocreacion;

    public void calc(int anioactual) {
        int resultado = 0;
        resultado = anioactual - aniocreacion;
        System.out.println("Antiguedad del vehiculo " + resultado);
    }
    public int calcresult(int anioactual){
        return 0;
    }
}