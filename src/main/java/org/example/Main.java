package org.example;

import org.example.controlador.ControladorEstaciones;
import org.example.vista.VentanaEstaciones;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        VentanaEstaciones view = new VentanaEstaciones("Proyecto Final: ESTACIONES DEL METRO DE LA CDMX");
        ControladorEstaciones controller = new ControladorEstaciones(view);

        /*URL Prueba
        *NEZA:  http://lh5.ggpht.com/_XXpvlSXUPdU/TQ2J9fZqr4I/AAAAAAAAArY/-K_r6t7lc3w/s400/neza.png
        *OBSERVATORIO: https://images.squarespace-cdn.com/content/v1/568e71dba12f44a30efa33f4/b8bfc8cd-977f-49ed-9a30-14a773eb209a/observatorio.png?format=500w
        *18 MARZO: https://images.squarespace-cdn.com/content/v1/568e71dba12f44a30efa33f4/84f32823-40f4-479e-8ce8-86778d43245d/18marzo.png?format=500w
        *CHAPULTEPEC: https://images.squarespace-cdn.com/content/v1/568e71dba12f44a30efa33f4/1664568500762-2YM5JY8U6RCD4G2M58OA/chapultepec.png?format=500w
        *
        * */
    }
}