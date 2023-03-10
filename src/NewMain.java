
import entidades.Asiento;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Milagros
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sala s = new Sala();
        s.crearSala();
        s.mostrarSala();

        //arraylist de sentados
        ArrayList<Espectador> sentados = new ArrayList();

        //crear pelicula
        Pelicula p = new Pelicula("Lilo y Stitch", 3, 5, "Disney");

        //guardar la matriz de asientos en una variable nueva
        Asiento[][] matrizAsientos = s.getMatrizAsientos();

        // generar espectadores
        for (int i = 0; i < 100; i++) {
            String nombre = "Espectador " + i;
            int edad = (int) ((Math.random() * 100) + 1);
            double dinero = Math.random() * 100;
            s.getEspectadores().add(new Espectador(nombre, edad, dinero));
        }

        // ubicar espectadores en asientos de la matriz sala
        System.out.println("Ubicando espectadores...");
        for (Espectador aux : s.getEspectadores()) {
            // verificar si la sala esta llena
            if (sentados.size() == 48) {              
                System.out.println("Lo sentimos, la sala está llena. No ingresaran más espectadores");
                break;
            }
            if (aux.getDinero() >= Cine.getPrecioEntrada() && aux.getEdad() > p.getEdadMin()) {
                Asiento asientoRandom;
                //generar asiento random
                asientoRandom = matrizAsientos[(int) ((Math.random() * 8))][(int) ((Math.random() * 6))];
                boolean sentado = false;
                //verificar si el asiento esta desocupado y asignar
                do {
                    if (asientoRandom.isOcupado()) { //si el asiento random esta ocupado generar un nuevo asiento random
                        asientoRandom = matrizAsientos[(int) ((Math.random() * 8))][(int) ((Math.random() * 6))];
                    } else {
                        asientoRandom.setOcupado(true);
                        asientoRandom.setEspectadorSentado(aux);
                        aux.setSentado(asientoRandom);
                        sentados.add(aux);
                        sentado = true;
                    }
                } while (!sentado);
            }
        }

        //mostrar sala otra vez
        System.out.println("");
        s.mostrarSala();

        //mostrar espectadores 
        /*
        System.out.println("");
        for (Espectador aux : s.getEspectadores()) {
            System.out.println(aux.toString());
        } */

        //mostrar array de sentados
        System.out.println("Los sentados son " + sentados.size());
        for (Espectador aux : sentados) {
            System.out.println(aux);
        }
    }

}
