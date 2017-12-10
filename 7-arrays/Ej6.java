/**Ejercicio 6.
 * 
 *  Escribe un programa que lea 15 números por teclado y que los almacene en un
    array. Rota los elementos de ese array, es decir, el elemento de la posición 0
    debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
    la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
    del array.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej6 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Mostramos un array con 15 números");
    System.out.println(" ");
    
    int numeroIntroducido=0;
    int []array= new int [15]; 
    int i=0;
    int aux=0;
    int a = 0;
    int b = 1;
    
    System.out.println("Por favor, introduzca un número entero: ");
    System.out.println(" ");
    System.out.println("Pulsa intro cuando hayas metido cada número. ");
      for (i=0; i<15; i++) {  
        numeroIntroducido=Integer.parseInt(s.nextLine());
        array[i]=numeroIntroducido;
      }
      
      System.out.println();
      System.out.println("Este es el array introducido:");
      
      for (i=0; i<15;i++){ //Imprimo el array introducido por teclado
        System.out.println("[" + i + "]" + " = " + array[i] + " " );
      }
      System.out.println();
      
      System.out.println("Este es el nuevo array:");
      
      for (i = 0; i < 14; i++) {
        aux = array[b];
        array[b] = array[a];
        b++;
        array[a] = aux;
      }
      array[0] = aux;
      for (i=0; i<array.length;i++){
        System.out.println("[" + i + "]" + " = " + array[i]);
      }
  }
}
