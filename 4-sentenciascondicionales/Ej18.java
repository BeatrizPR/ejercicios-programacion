/**Ejercicio 18
  Escribe un programa que diga cuál es la primera cifra de un número entero
  introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
import java.util.Scanner;
 public class Ej18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduce un número entero (que no tenga más de 5 cifras): ");
    int numero = Math.abs (Integer.parseInt( s.nextLine() ));
    
    if (numero <10){
      System.out.print(numero);
    } else if (numero <100){ 
      System.out.print(numero /10);
    } else if (numero <1000) {
      System.out.print(numero /100);
    } else if (numero <10000) {
      System.out.print(numero /1000);
    } else if (numero <100000){
      System.out.println(numero /10000);
    }

  }
}
