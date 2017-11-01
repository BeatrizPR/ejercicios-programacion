/**Ejercicio 15
    Escribe un programa que dados dos números, uno real (base) y un entero
    positivo (exponente), saque por pantalla todas las potencias con base el
    numero dado y exponentes entre uno y el exponente introducido. No se deben
    utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
    se deberán mostrar 21, 22, 23, 24 y 25.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
        System.out.println("Por favor, introduce la base: ");
        int base= Integer.parseInt(s.next());
        System.out.println("Por favor, introduce el exponente:");
        int exponente= Integer.parseInt(s.next());
        
        int numerosExpo =0;
     while (numerosExpo <= exponente){
          
          
            System.out.println(base + "^"+numerosExpo + "= "+ Math.pow(base, numerosExpo));
        numerosExpo++;
          }

  }
}
