/**Ejercicio 9.
 * 
 *  Realiza un programa que vaya generando números aleatorios pares entre 0
    y 100 y que no termine de generar números hasta que no saque el 24. El
    programa deberá decir al final cuántos números se han generado.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej9 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Generación de números aleatorios pares entre el 0 y el 100");
    
    /**Me FALTA QUE SEAN PARES LOS NUMEROs**/
    
    int numero =(int)(Math.random()* 101);
    int contador=0;
      while (numero!=24){
        System.out.println(numero);
        numero =(int)(Math.random()* 101);
        contador++;
      }
      System.out.println("Se han introducido " + contador + " números.");
  }
}
