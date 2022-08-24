package tarea02;

import java.util.Scanner;

/**
 * Ejercicio 4: puntuación de un texto.
 *
 * @author Óscar Marín Moreno
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes

        // Variables de entrada
        String cadena = "";
        int multi = 0;      
        int puntuacion = 0; 
        char letra;
        // Variables de salida

        // Variables auxiliares
        // Clase Scanner para petición de datos
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VALOR DE UN TEXTO");
        System.out.println("------------------");
        System.out.println("Introduzca un texto con al menos 5 caracteres: "); //Se muestra en pantalla que introduzca un carcater con al menos 5 letras.
        cadena = teclado.nextLine();
        while (cadena.length() < 5) {   //Aqui se dice que el texto tiene que ser menor que 5 para entrar en el bucle y volver a pedir que introduzca el texto.
            System.out.println("Cadena erronea. Introduzca un texto con al menos 5 caracteres: ");
            cadena = teclado.nextLine();

        }
        System.out.println("Introduzca el valor del multiplicador (entre 1-3): "); // Se imprime en consola para pedir un número entre 1-3
        multi = teclado.nextInt();
        while (multi < 1 || multi > 3) {    /*Se utiliza el while y que el numero multi sea menor y mayor que 3 para que si se cumple esa condición entrar al bucle
                                               de pedir de nuevo el numero entre 1-3*/
            System.out.println("Cadena erronea. Introduzca un texto con al menos 5 caracteres: ");
            multi = teclado.nextInt();

        }

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        for (int i = 0; i < cadena.length(); i++) { //Utilizamos for para identificar la cadena de .lenght y que vaya incrementando en 1
            letra = cadena.charAt(i);
            switch (letra) { /*Utilizamos un switch con la variable letra. para analizar cada una de ellas y darle un valor siempre
                                y cuando se cumplan dichas condiciones en los CASE
                                sumando la puntuación para recoger los datos. Si no fuera así estariamos sobreescribiendo*/
                case 'a':
                    puntuacion = puntuacion + 1;
                    break;
                case 'e':
                    puntuacion = puntuacion + 1;
                    break;
                case 'i':
                    puntuacion = puntuacion + 1;
                    break;
                case 'o':
                    puntuacion = puntuacion + 1;
                    break;
                case 'u':
                    puntuacion = puntuacion + 1;
                    break;
                case 'A':
                    puntuacion = puntuacion + 1;
                    break;
                case 'E':
                    puntuacion = puntuacion + 1;
                    break;
                case 'I':
                    puntuacion = puntuacion + 1;
                    break;
                case 'O':
                    puntuacion = puntuacion + 1;
                    break;
                case 'U':
                    puntuacion = puntuacion + 1;
                    break;
                case 'x':
                    puntuacion = puntuacion + 2;
                    break;
                case 'y':
                    puntuacion = puntuacion + 2;
                    break;
                case 'z':
                    puntuacion = puntuacion + 2;
                    break;
                case 'X':
                    puntuacion = puntuacion + 5;
                    break;
                default:
                    puntuacion = puntuacion - 1; /*El default lo utilizamos para decirle que todo lo que no este en CASE y se introduzca en el programa
                                                    el programa lo detectará y restará 1*/

            }

        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println(multi * puntuacion); // Multiplicamos el valor introducido en multi por la puntuación que nos da al analizar el texto.

    }
}
