/**Ejercicio 19.
 * 
 *  Escribe un programa que muestre 50 números enteros aleatorios comprendidos
    entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
    luego el máximo de los pares el mínimo de los impares y la media de todos los
    números generados.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej19 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Mostramos 50 numeros aleatorios comprendidos entre el -100 y el 200");
    System.out.println(" ");
      
      int numAleatorio =0;
      int mayorPar=0;
      int totalNumeros=0;
      int minimoImpar=0;
      
      System.out.print("50 números aletorio: ");
      for (int i=0; i<50;i++){ //sacar 50 numeros
        numAleatorio =(int)(Math.random()* 200)-100;
        int par= numAleatorio%2;
        totalNumeros+=numAleatorio;
        if (par!=0){
          if (numAleatorio<minimoImpar)
          minimoImpar=numAleatorio;
          
        } else if (numAleatorio>mayorPar){
            mayorPar=numAleatorio;
            
          }
      System.out.print( numAleatorio + " ");
      }
      System.out.println(  " ");
      System.out.println("La media de los números generados es "+ (totalNumeros/50) );
      System.out.println("El número más grande de los pares es " + mayorPar );
      System.out.println("La número más pequeño de los impares es " + minimoImpar );
          
          
          
  }
}
