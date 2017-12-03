/**Ejercicio 24.
 * 
 *  Escribe un programa que, dado un número introducido por teclado, elija al azar
    uno de sus dígitos
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej24 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Vamos a sacar un dígito aleatorio del número que introduzcas");
    System.out.println(" ");
      
       System.out.print("Por favor, introduzca un número entero: ");
      int numIntroducido=Integer.parseInt(s.nextLine());
      int numero = numIntroducido; // para guardar el numero introducido
      int contador = 0; 
      int posicion = 0; 
    
    while (numIntroducido > 0) { //averiguamos la longitud del número
      numIntroducido /= 10;
      contador++; //cuantos digitos tiene el numero
    }
    posicion = (int)(Math.random()*contador) + 1;
    
    for (int i = 1; i < posicion; i++) {
      numero /= 10;
    }
    System.out.println( numero % 10);

  }
}
