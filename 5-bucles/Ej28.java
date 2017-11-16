/**Ejercicio28.
 * 
  Escribe un programa que calcule el factorial de un número entero leído por
  teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
      System.out.print("Introduce un número:  ");
      int numero= Integer.parseInt(s.next());
      
      int factorial=1;
      int n=1;
      
      System.out.print("El numero factorial de "+ numero + " es:  ");
      
        while (n<= numero){
        factorial= factorial*n;
        n++;
        }
        System.out.println(factorial);
     
  }
}
