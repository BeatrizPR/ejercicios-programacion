/**Ejercicio 5.
 * 
 *  Escribe un programa que pida 10 números por teclado y que luego muestre
    los números introducidos junto con las palabras "máximo" y "mínimo" al lado
    del máximo y del mínimo respectivamente.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej5 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Mostramos un array con 10 números");
    System.out.println(" ");
      int []num= new int [10]; //para guardar 10 valores
      int i=0;
      int numMax=1;
      long numMin=999999999;
      
      System.out.println("Por favor, introduzca un número entero: ");
      System.out.println(" ");
      System.out.println("Pulsa intro cuando hayas metido cada número. ");
        for (i=0; i<10; i++) {
          num[i]=Integer.parseInt(s.nextLine()); //guardo los numeros introducidos
        
          if (num[i]<numMin){ // Saco el número más pequeño
                numMin = num[i];
                
              } else if (num[i] > numMax){  // Saco el máximo
                numMax=num[i];
              }
        }
        System.out.println(); //Salto de linea por estetica
        for (i=0; i<10;i++) {
          System.out.print(num[i]);
          
          if (num[i] == numMax) {
            System.out.print(" -> es el máximo");
          } else if (num[i]==numMin) {
            System.out.print(" -> es el mínimo");
          }
          System.out.println();
        }
  }
}
