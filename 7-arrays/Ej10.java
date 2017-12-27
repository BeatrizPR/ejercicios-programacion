/**Ejercicio 10.
 * 
 *  Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
    y que los almacene en un array. El programa debe ser capaz de pasar todos
    los números pares a las primeras posiciones del array (del 0 en adelante) y
    todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
    es necesario.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej10 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("El programa mueve los números pares a las primeras posiciones del array ");
    System.out.println(" ");
    System.out.println(" ");
    
    int []array= new int [20]; //para guardar 20 valores
    int i=0;
    int[] aux = new int[20]; //para ir guardando los valores pares e impares
    int posicion=0;
    
    for (i=0; i<20; i++) { //imprimo los numeros aleatorios
      array[i]= (int)(Math.random()* 101);
      System.out.print(array[i]+ " ");
    }

    for (i = 0; i < 20; i++) {
      if (array[i] % 2 == 0) {  //compruebo los numeros q son PARES
        aux[posicion] = array[i];    //guardo los numeros pares en un array auxiliar
        posicion++;
      }
    } //termina for par
    for (i = 0; i < 20; i++) {
      if (array[i] % 2 != 0) {    //Compruebo los IMPARES y los almaceno en el array aux, sigue por donde se quedó
        aux[posicion] = array[i];
        posicion++;
      }
    } //termina for impar
    System.out.println();
    System.out.println();
    System.out.println("El array con los pares delante es así:");
    System.out.println();
    
    for (i=0;i<array.length;i++){  //imprimo el array con los pares delante
      array[i]=aux[i];
      System.out.print(array[i]+ " ");
    }
    
  }
}
