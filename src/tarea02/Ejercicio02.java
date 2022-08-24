package tarea02;

import java.util.Scanner;

/**
 *
 * Ejercicio 2: Análisis del año.
 *
 * @author Óscar Marín Moreno
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        int año;   // Numero entero para la variable de entrada año.
        // Variables de salida

        // Variables auxiliares
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in); // Para que podamos introducir el numero a través del teclado.

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ANÁLISIS DEL AÑO");
        System.out.println("----------------");
        System.out.println("Introduzca un año (entre 1801-2100): "); // Texto para que aparezca en consola y poder introducir un número
        año = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento y Salida de resultados
        //----------------------------------------------  
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        // Iniciamos un if para tener la condición de que año es mayor o igual a 1801 y que año es menor o igual que 2100, para realizar un else debajo y poner que si no esta en esos números salga error.
        if (año >= 1801 && año <= 2100) {

            //Dentro de la condición añadimos una nueva sentencia, con otro if-else.
            if (año <= 1900) {                                          //Si el año es menor o igual a 1900 entonces sera del siglo XIX
                System.out.println("El año pertenece al siglo XIX");
            } else if(año <= 2000) {                      // Si el año es mayor o igual a 1901 y menor o igual a 2000 sera del siglo XX
                System.out.println("El año pertenece al siglo XX");
            } else {                                                 //Entonces si no es ninguna de las anteriores sabemos que es del siglo XXI
                System.out.println("El año pertenece al siglo XXI");
            }

            if (año < 2021) {                                              // Si año es menor que 2021 define si es anterior y cuantos años han pasado.
                System.out.println("El año introducido es anterior al actual. Han pasado: " + (2021 - año) + " años ");
            } else if (año == 2021) {                                  //Si año es igual que 2021 define que es igual que el actual.
                System.out.println("El año introducido coincide con el actual.");
            } else {                                                //Entonces si no es ninguna de las anteriores, sabemos que es posterior y cuantos años faltan.
                System.out.println("El año introducido es posterior al actual. Faltan: " + (año - 2021) + " años ");
            }

        } else {
            System.out.println("El año introducido no es válido."); // Da error si no metemos los valores correctos en consola (año>=1801 && año<=2100)
        }
    }
}

//----------------------------------------------
//              Salida de resultados 
//----------------------------------------------

