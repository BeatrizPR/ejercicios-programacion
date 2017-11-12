/**Ejercicio 29
 * 
    Escribe un programa que muestre por pantalla todos los números enteros
    positivos menores a uno leído por teclado que no sean divisibles entre otro
    también leído de igual forma.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     
      System.out.print("Introduce un número entero grande:  ");
      int numero1= Integer.parseInt(s.next());
      System.out.print("Introduce otro número entero más pequeño: ");
      int numero2= Integer.parseInt(s.next());
      
      System.out.println("------------------------------ ");
      System.out.println("Los números más pequeños que "+ numero1 + " que no son divisibles entre "+ numero2 +" son: ");
      
      for (int n=1; n<=numero1;n++){
        if ((n % numero2) != 0) {
        System.out.println(n);
        }
       
      }
  }
}
