/**Ejercicio 4.
 * 
 *  Define tres arrays de 20 números enteros cada una, con nombres numero,
    cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
    array cuadrado se deben almacenar los cuadrados de los valores que hay en el
    array numero. En el array cubo se deben almacenar los cubos de los valores que
    hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
    en tres columnas.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej4 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Mostramos un array con 20 números, otro con cuadrados y otro con cubos");
    System.out.println(" ");
      //int aleatorio = (int)(Math.random()* 100);
      int []numero= new int[20]; // creamos un array con 20 numeros
      int []cuadrado= new int[20];
      int []cubo= new int[20];
      int i=0;
      
      System.out.println("Numero - Cuadrado -  Cubo");
      System.out.println("");
      for (i=0; i<20; i++) {
        numero[i]= (int)(Math.random()* 101);
        cuadrado[i]= numero[i] * numero[i];
        cubo [i]= cuadrado[i] * numero[i];
        
        System.out.printf("%4d  %8d      %5d\n", numero[i], cuadrado[i], cubo[i]);
      }
  }
}
