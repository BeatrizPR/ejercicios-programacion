/**Ejercicio 13
    Escribe un programa que lea una lista de diez números y determine cuántos
    son positivos, y cuántos son negativos.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Qué números son positivos y cuáles negativos?");
    int n = 0;
     while (n <10){
        System.out.println("Por favor, introduce un número: ");
        int cifra= Integer.parseInt(s.next());
          if (cifra<0){
          System.out.println("El número "+ cifra + " es negativo");
          } else {
            System.out.println("El número "+ cifra + " es positivo");
            }
        n++;
          }
  }
}
