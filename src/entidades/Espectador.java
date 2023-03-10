/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Milagros
 */
public class Espectador {

    private String nombre;
    private int edad;
    private double dinero;
    private Asiento sentado;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public Espectador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Asiento getSentado() {
        return sentado;
    }

    public void setSentado(Asiento sentado) {
        this.sentado = sentado;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", sentado=" + sentado + '}';
    }

}
