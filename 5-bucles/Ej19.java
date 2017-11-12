/** Ejercicio 19.
 *Realiza un programa que pinte una pirámide por pantalla. La altura se debe
  pedir por teclado. El carácter con el que se pinta la pirámide también se debe
  pedir por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
import java.util.Scanner;

public class Ej19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      System.out.print("Por favor introduzca una altura;");
      int alturaIntroducida=Integer.parseInt(s.nextLine());
      System.out.print("Introduzca el caracter con el que quiera dibujar:" );
      String c =s.nextLine();
      
        int altura=1; 
        int espacios = alturaIntroducida-1;
        int asteriscos=1;
        /** Espacios a dibujar antes del asterisco
         * son altura menos 1.*/
        
        while (altura<= alturaIntroducida){
          /**Pintamos espacios antes del primer asterisco con el for*/
          for (int i=1; i<= espacios;i++){
            System.out.print (" ");
          }
          /**Pintamos asteriscos*/
          for (int i=1; i<=asteriscos; i++){
            System.out.print (c);
          }
          /** Incrementamos la altura cuando vaya bajando de línea*/
          altura++;
          /** Con el system imprimimos el salto de lía */
          System.out.println(" ");
          /** Estos espacios que restamos, son al saltar de linea */
          espacios--;
          /** Los asteriscos  se suman dos al bajar de linea*/
          asteriscos+=2;
          
          
          
        }
        
  }
}
