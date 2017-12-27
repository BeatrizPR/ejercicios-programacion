/**Ejercicio 11.
 * 
 *  Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice
    (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
    primos a las primeras posiciones, desplazando el resto de números (los que
    no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
    el array resultante.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej11 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("El programa mueve los números primos a las primeras posiciones del array ");
    System.out.println(" ");
    System.out.print("Por favor, introduzca cada número y pulse intro  ");
    
    int []array= new int [10]; //para guardar 10 valores
    int i=0;
    int[] aux = new int[10]; //para ir guardando los valores primos
    boolean esPrimo=true;
    int izquierda=0;
    int derecha=9;
    
    for (i=0; i<10; i++) { //guardo los numeros
      array[i]= Integer.parseInt(s.nextLine());
    }
    System.out.printf("Indice "," %4d");
    
    for (i = 0; i < 10; i++) {
      System.out.printf(" |%7d ", i);
    }
    System.out.println();
    System.out.println();
    System.out.println("Introducido por teclado:");
    System.out.println();
    System.out.print("Array  ");
    for (i = 0; i < 10; i++) {
      System.out.printf(" |%7d ", array[i]);
    }
    System.out.printf("\n ");
    for (i = 0; i < 10; i++) { //este for ordena los números
       
       for (int j = 2; j < array[i]; j++) { //comprueba que numeros son primos.
         if (array[i] % j == 0) {
           esPrimo = false;
         }
       } 
      if (esPrimo) {
        aux[izquierda] = array[i];
        izquierda++;
      } else {
        aux[derecha] = array[i];
        derecha--;
      } 
      esPrimo = true;
    } //Termina el for que engloba a los primos y no primos

    System.out.println();
    System.out.print("Primos ");

  for (i=0;i<array.length;i++){  //imprimo el array con los primos delante delante
      array[i]=aux[i];
      System.out.printf(" |%7d ",array[i]);
    }
  }
}
