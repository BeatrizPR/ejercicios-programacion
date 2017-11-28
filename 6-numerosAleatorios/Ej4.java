/**Ejercicio 4.
 * 
 *  Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
    por espacios.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/

public class Ej4 {
    
  public static void main(String[] args) {

    System.out.println("Programa que imprime 20 números aleatorios entre el 0 y el 10");
    for (int i=1; i<=20; i++){
      System.out.print((int)(Math.random()* 11) + " ");
    }
  }
}
