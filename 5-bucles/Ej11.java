/**Ejercicio 11
  Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
  los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

 public class Ej11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduce un número: ");
    
      int n= Integer.parseInt(s.next());
      
      System.out.println("  Número         Cuadrado       Cubo");
      System.out.println("-----------------------------------------");
      
        for (int intento = 0; intento<5; intento++) {
        System.out.printf("%-10s      %8.2f      %6.2f\n", n, Math.pow(n,2), Math.pow(n,3));
        n++;
        } 
  }
}
