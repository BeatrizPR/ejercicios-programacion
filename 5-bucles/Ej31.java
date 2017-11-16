/** Ejercicio 31.
 *
       Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
      programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
      mitad (división entera entre 2) de la altura más uno.
      Ejemplo:
      Introduzca la altura de la L: 5
      *
      *
      *
      *
      * * *
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
import java.util.Scanner;

public class Ej31 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      System.out.print("Por favor introduzca una altura:");
      int alturaIntroducida=Integer.parseInt(s.nextLine());
      
        int altura=1; 
        int anchura= (alturaIntroducida/2)+1;
        
        /** Espacios a dibujar antes del asterisco
         * son altura menos 1.*/
        
        while (altura< alturaIntroducida){
          System.out.println ("*");
          altura++;
        }
        for (int i=1; i<=anchura; i++){
          System.out.print ("*");
                }
        
  }
}
