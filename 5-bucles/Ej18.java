/**Ejercicio 18
 * 
    Escribe un programa que obtenga los números enteros comprendidos entre
    dos números introducidos por teclado y validados como distintos, el programa
    debe empezar por el menor de los enteros introducidos e ir incrementando de
    7 en 7.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra los números comprendidos entre dos números, sumando de 7 en 7. ");
    System.out.println("Por favor, introduce un número: ");
    int numeroPrimero= Integer.parseInt(s.next());
    System.out.println("Por favor, introduce un número distinto: ");
    int numeroSegundo= Integer.parseInt(s.next());
    System.out.println("---------------------------------------------- ");
      
      if (numeroPrimero < numeroSegundo){
        while (numeroPrimero<=numeroSegundo) {
          System.out.println(numeroPrimero);
          numeroPrimero+=7;
        }
        System.out.println(numeroSegundo);
      } else {
        while (numeroSegundo< numeroPrimero) {
          System.out.println(numeroSegundo);
          numeroSegundo+=7;
        }
        System.out.println(numeroPrimero);
        }
  }
}

