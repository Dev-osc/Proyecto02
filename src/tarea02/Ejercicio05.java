package tarea02;

import java.util.Scanner;

/**
 * Ejercicio 5: construcción de cajas.
 *
 * @author Óscar Marín Moreno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        int fila;
        int columna;
        boolean relleno;
        String sn;
        String acumulador;

        // Variables de salida
        // Variables auxiliares
        // Clase Scanner para petición de datos
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CONSTRUCCIÓN DE CAJAS");
        System.out.println("---------------------");
        do {
            System.out.println("introduzca el numero : "); //Pide el número en consola 
            fila = teclado.nextInt();
        } while (fila < 2 || fila > 10); //Se asegura de que el número introducido sea valido
        do {
            System.out.println("introduzca el numero : ");
            columna = teclado.nextInt();
        } while (columna < 2 || columna > 10); //Se asegura de que el número introducido sea valido

        do {
            System.out.println("quere relleno (s/n) :  ");
            sn = teclado.nextLine();
        } while (!sn.toLowerCase().equals("s") && !sn.toLowerCase().equals("n")); //Se asegura de que el carácteres introducidos sean validos

        relleno = sn.toLowerCase().equals("s"); //Comprobamos si se desea o no relleno

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        for (int y = 0; y < columna; y++) {    //Recorre las filas
            acumulador = "";                    // Resetea el acumulador
            for (int x = 0; x < fila; x++) {  //Recorre las columnas
                if ((x == 0 || x == columna - 2) && (y == 0 || y == fila)) {  //Comprueba si se trata de una esquina "+"
                    acumulador += "+";
                } else if (x == 0 || x == columna - 2) {    //Comprueba si se trata de un borde vertical "|"
                    acumulador += "|";
                } else if (y == 0 || y == fila) {              //Comprueba si se trata de un borde horizontal "-"
                    acumulador += "-";
                } else {
                    acumulador += (relleno) ? y : " ";         //Si no coincide en ningún caso anterior incluimos el relleno
                }

            }
            System.out.println(acumulador); // Imprimimos el acumulador por consola

        }

    }

}
