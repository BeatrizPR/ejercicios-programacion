/**Ejercicio 14
    Escribe un programa que pida una base y un exponente (entero positivo) y
    que calcule la potencia.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calcula la potencia de un numero");
    System.out.println("¿Cuántas potencias quieres calcular?");
    int potencia= Integer.parseInt(s.next());
    int n = 0;
     while (n <potencia){
        System.out.println("Por favor, introduce la base: ");
        int base= Integer.parseInt(s.next());
        System.out.println("Por favor, introduce el exponente:");
          int exponente= Integer.parseInt(s.next());
          
            System.out.println("La potencia es " + Math.pow(base, exponente));
        n++;
          }
  }
}
