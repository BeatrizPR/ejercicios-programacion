/*
 * Ejercicio 16
   Muestra los números capicúa que hay entre 1 y 99999
 */
package ejercicios;

/**
 *
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;
import matematicas.Varias;

public class Ej16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Este programa muestra los números capicúa que hay entre 1 y 1000. ");
    System.out.println(" ");

    int numero = 1;
    System.out.println("Los numeros capicua entre el 1 y el 1000 son: ");
    while (numero < 1000) {

      if (Varias.esCapicua((int) numero)) {
        System.out.print(numero + ", ");
      }
      numero++;
    }

  }

}
