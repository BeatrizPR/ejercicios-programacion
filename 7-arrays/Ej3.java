/**Ejercicio 3.
 * 
 *  Escribe un programa que lea 10 números por teclado y que luego los muestre
    en orden inverso, es decir, el primero que se introduce es el último en
    mostrarse y viceversa.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej3 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Programa que muestra el número que introduzcas a la inversa");
    System.out.println(" ");
      
      int []num= new int [10]; //para guardar 10 valores
      int i=0;
      System.out.println("Por favor, introduzca un número entero: ");
      System.out.println(" ");
      System.out.println("Pulsa intro cuando hayas metido cada número. ");
        for (i = 0; i < 10; i++) {
          num[i]=Integer.parseInt(s.nextLine()); //guardo los numeros introducidos
        }
    
        System.out.println("Ahora le damos la vuelta, e introducimos los números en orden inverso ");
        System.out.println(" ");
        for (i=9; i >= 0; i--) { //con el bucle de 9 a 0, voy mostrando los numeros al reves
          System.out.println(num[i]); 
        }
        System.out.println(" ");
  }
}
