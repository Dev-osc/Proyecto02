package tarea02;

import java.util.Scanner;

/**
 * Ejercicio 3: Valor de un naipe en el juego del tute.
 *
 * @author Óscar Marín Moreno
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        int carta;  //Introducimos un int para carta
        // Variables de salida

        // Variables auxiliares
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VALOR DE UN NAIPE EN EL TUTE");
        System.out.println("----------------------------");
        System.out.print("Introduzca número (1-7,10-12): "); //Pedimos por consola que introduzcan un número.
        carta = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        switch (carta) {    //Creamos un switch para decir que (carta) que será un número dependiendo del número introducido dara el resultado.
            case 1:
                System.out.println("El valor del naipe con ese número es: 11 ");
                break;
            case 3:
                System.out.println("El valor del naipe con ese número es:  10 ");
                break;
            case 10:
                System.out.println("El valor del naipe con ese número es:  2 ");
                break;
            case 11:
                System.out.println("El valor del naipe con ese número es: 3 ");
                break;
            case 12:
                System.out.println("El valor del naipe con ese número es: 4 ");
                break;
            case 2:
                System.out.println("El valor del naipe con ese número es: 0 ");
                break;            
            case 4:
                System.out.println("El valor del naipe con ese número es: 0 ");
                break;
            case 5:
                System.out.println("El valor del naipe con ese número es: 0 ");
                break;
            case 6:
                System.out.println("El valor del naipe con ese número es: 0 ");
                break;
            case 7:
                System.out.println("El valor del naipe con ese número es: 0 ");
                break;
            default:
                System.out.println("El valor del naipe con ese número es: -1"); /*En default lo que hacemos es decirle que si no es ningún número de los CASE
                                                                                      entonces es -1*/  

        }

    }
}
