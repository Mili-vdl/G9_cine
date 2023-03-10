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
public class Cine {

    private Sala sala;
    private Pelicula pelicula;
    private static double precioEntrada = 50;

    public Cine(Sala sala, Pelicula pelicula) {
        this.sala = sala;
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public static double getPrecioEntrada() {
        return precioEntrada;
    }

    public static void setPrecioEntrada(double precioEntrada) {
        Cine.precioEntrada = precioEntrada;
    }

}
