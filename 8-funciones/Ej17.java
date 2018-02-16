/*
 * Ejercicio 17
   Escribe un programa que pase de binario a decimal.
 */
package ejercicios;

/**
 *
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    long decimal = 0;

    System.out.print("Introduzca un número binario: ");
    long binario = Long.parseLong(s.nextLine());

    int bits = matematicas.Varias.sacarDigito(binario);

    for (int i = 0; i < bits; i++) {
      decimal += matematicas.Varias.digitoNum(binario, bits - i - 1) * matematicas.Varias.potencia(2, i);
    }

    System.out.println(binario + " binario es en decimal " + decimal);

  }
}
