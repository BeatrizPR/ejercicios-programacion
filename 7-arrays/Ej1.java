/**Ejercicio 1.
 * 
 *  Define un array de 12 números enteros con nombre num y asigna los valores
    según la tabla que se muestra a continuación. Muestra el contenido de todos
    los elementos del array. ¿Qué sucede con los valores de los elementos que no
    han sido inicializados?
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej1 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Definimos un array de 12 números enteros");
    System.out.println(" ");
      
      int []num= new int[12]; // creamos un array con nombre num y un indice de 12 numeros
      num[0]=39;
      num[1]=-2;
      //num[2]=
      //num[3]=
      num[4]=0;
      //num[5]=
      num[6]=14;
      //num[7]=
      num[8]=5;
      num[9]=120;
      //num[10]=
      //num[11]=
      
      
      for (int i = 0; i < 12; i++) {
        //System.out.println(num[i]);
        System.out.printf("num [%2d]: %d\n", i, num[i]);
      }
      System.out.println(  " ");
      
      /**PODEMOS VER QUE LOS ELEMENTOS NO INICIALIDADOS SE INICIALIZAN A 0*/
  }
}
