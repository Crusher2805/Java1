/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp1;
import java.util.Random;

/**
 *
 * @author Armando_Hernandez_Mo
 */
public class Vehiculo {

    private String VIN;
    private int placa;
    private Combustible combustible;
    private float consumo;

    public Vehiculo(Combustible combustible) {
        this.VIN = generarVIN();
        this.placa = generarPlaca();
        this.combustible = combustible;
        this.consumo = 9.5f;
    }

    private String generarVIN() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        return sb.toString();
    }

    private int generarPlaca() {
        return (int) (Math.random() * (999999 - 100000 + 1) + 100000);
    }

    public String getVIN() {
        return VIN;
    }

    public int getPlaca() {
        return placa;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String estatusConsumo() {
        if (consumo < 10) {
            return "Bajo";
        } else if (consumo >= 10 && consumo <= 12) {
            return "Medio";
        } else {
            return "Alto";
        }
    }

    public String diaRestriccion() {
        if (combustible == Combustible.ELECTRICO) {
            return "No tiene restricción";
        } else {
            // Lógica para determinar el día de restricción
            return "Lunes";
        }
    }

    public String aString() {
        return "Vehículo{"
                + "VIN='" + VIN + '\''
                + ", placa=" + placa
                + ", combustible=" + combustible
                + ", consumo=" + consumo
                + '}';
    }
}

enum Combustible {
    ELECTRICO,
    DIESEL,
    GASOLINA
}
