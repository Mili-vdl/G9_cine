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
public class Asiento {

    private int fila;
    private String columna;
    private boolean ocupado;
    private Espectador espectadorSentado;

    public Asiento(int fila, String columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Asiento() {
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Espectador getEspectadorSentado() {
        return espectadorSentado;
    }

    public void setEspectadorSentado(Espectador espectadorSentado) {
        this.espectadorSentado = espectadorSentado;
    }

    @Override
    public String toString() {
        if (ocupado) {
            return "{" + fila + columna + " X" + '}';
        } else {
            return "{" + fila + columna + "  " + '}';
        }
    }

}
