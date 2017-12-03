/**Ejercicio 25.
 * 
 *  Escribe un programa que muestre por pantalla 100 números enteros separados
    por un espacio. Los números deben estar generados de forma aleatoria
    en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
    almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej25 {
    
  public static void
   main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Este programa muestra 100 numeros aleatorios entre el 10 y el 200");
    System.out.println(" ");
      
      int numAleatorio=0;
      boolean esPrimo=true;
      
      while (esPrimo){
        for (int i=0; i<100; i++){
          numAleatorio =(int)(Math.random()* 200)+10;
            
            for (int j=2; j<numAleatorio; j++){
              if (numAleatorio%j==0){
                esPrimo=false;
              }
            }
              if(esPrimo){
                esPrimo=false; // es primo  imprimo por pantalla el primo
                System.out.print("#" + numAleatorio + "#");
                System.out.print("  ");
              } else { //cuando no he metido un primo
                esPrimo=true;
                
                if (numAleatorio%5==0){
                  System.out.print("["+ numAleatorio+"]");
                  System.out.print("  ");
                }
              }
            
        } // termina for de los 100 numeros
      } // termina el while

  }
}
