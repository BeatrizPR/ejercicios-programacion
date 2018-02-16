/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;
import matematicas.Varias;

public class Ej18 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número decimal (\"en base diez\") para pasarlo a binario: ");
    int decimal = Integer.parseInt(s.next());
    System.out.println("el número decimal" + decimal + " en binario es " + Varias.decimalBinario(decimal));

  }

}
