/**Ejercicio 14.
 * 
 *  Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
    El programa intentará adivinar el número que estás pensando - un número
    entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
    programa debe preguntar si el número que estás pensando es mayor o menor
    que el que te acaba de decir.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej14 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Voy a adivinar el número que estás pensando. Tienes que pensar un número entre el 0 y el 100");
    System.out.println(" ");
      
      int numero=0;
      int totalIntentos=5;
      int mayor=100;
      int menor=0;
      int numDistinto=0;
      boolean adivinanza=false;
      
      
      do {
        adivinanza=false;
        numero =(int)(Math.random()* (mayor-menor)+menor);
        System.out.println("¿El número que estás pensando es " + numero + "?");
        System.out.println(" ");
        System.out.println("¿El número que estás pensando es (1)mayor, (2) menor, (3) o igual?  Escribe 1, 2 o 3 en cada caso" );
        numDistinto =Integer.parseInt(s.next());
        if ((numDistinto==1) &&(totalIntentos>0)){
          menor=numero+ 1;
        } 
        if ((numDistinto==2) &&(totalIntentos>0)){
          mayor=numero-1;
        } 
        if (numDistinto==3) {
            adivinanza=true;
            System.out.println("¡He adivinado el número! ¡Tiremos confeti! " );
            }
          
        totalIntentos--;
      } while ((!adivinanza) && (totalIntentos>0));
    
        if (!adivinanza){
          System.out.println("¡Esta vez has ganado! No he acertado el número, pero la próxima vez lo adivinaré");
        }
  }
}
