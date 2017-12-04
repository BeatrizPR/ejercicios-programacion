/**Ejercicio 2.
 * 
 *  Define un array de 10 caracteres con nombre simbolo y asigna valores a los
    elementos según la tabla que se muestra a continuación. Muestra el contenido
    de todos los elementos del array. ¿Qué sucede con los valores de los elementos
    que no han sido inicializados?
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej2 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Definimos un array de 10 caracteres");
    System.out.println(" ");
      
      char []carac= new char[12]; // creamos un array con nombre carac y un indice de 10 caracteres
      carac[0]='a';
      carac[1]='x';
      //carac[2]=
      //carac[3]=
      carac[4]='@';
      //carac[5]=
      carac[6]=' ';
      carac[7]='+';
      carac[8]='Q';
      //carac[9]=
      
      
      for (int i = 0; i < 10; i++) {
        //System.out.println(carac[i]);
        System.out.println(" Caracter "+i+ ":" + carac[i]);
      }
      System.out.println(  " ");
      
      /**PODEMOS VER QUE LOS ELEMENTOS NO INICIALIDADOS NO SE INICIALIZAN*/
  }
}
