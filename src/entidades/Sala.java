/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Milagros
 */
public class Sala {

    private Asiento[][] matrizAsientos = new Asiento[8][6];
    private ArrayList<Espectador> espectadores;

    public Sala() {
        this.espectadores = new ArrayList();
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Asiento[][] getMatrizAsientos() {
        return matrizAsientos;
    }

    public void setMatrizAsientos(Asiento[][] matrizAsientos) {
        this.matrizAsientos = matrizAsientos;
    }

    public void crearSala() {
        for (int fila = 0; fila < 8; fila++) {
            for (int colum = 0; colum < 6; colum++) {
                switch (colum) {
                    case 0:
                        this.matrizAsientos[fila][colum] = new Asiento(fila + 1, "A");
                        break;
                    case 1:
                        this.matrizAsientos[fila][colum] = new Asiento(fila + 1, "B");
                        break;
                    case 2:
                        this.matrizAsientos[fila][colum] = new Asiento(fila + 1, "C");
                        break;
                    case 3:
                        this.matrizAsientos[fila][colum] = new Asiento(fila + 1, "D");
                        break;
                    case 4:
                        this.matrizAsientos[fila][colum] = new Asiento(fila + 1, "E");
                        break;
                    case 5:
                        this.matrizAsientos[fila][colum] = new Asiento(fila + 1, "F");
                        break;
                }
            }
        }
    }

    public void mostrarSala() {
        for (Asiento[] aux : matrizAsientos) {
            System.out.println(Arrays.toString(aux));
        }
    }

}
