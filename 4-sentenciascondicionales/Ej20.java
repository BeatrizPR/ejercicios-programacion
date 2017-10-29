/**Ejercicio 20
  Escribe un programa que diga cuál es la primera cifra de un número entero
  introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
import java.util.Scanner;
 public class Ej20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("¿Es este número capicúa? ");
    System.out.println("Por favor, introduce un número entero (que no tenga más de 5 cifras): ");
    int numero = Integer.parseInt( s.nextLine() );
    
    int resto;
    int numeroInver =0;
    int n=numero;
    while (n!=0){
      resto=n%10;
      n=n/10;
      numeroInver= numeroInver* 10 + resto;
    }
    if (numero==numeroInver){
      System.out.println("El número "+ numero + " es capicúa");
      } else { 
          System.out.println("El número "+ numero + " no es capicúa");
        }
  }
}
