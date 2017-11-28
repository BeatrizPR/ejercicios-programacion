/**Ejercicio 12.
 * 
 *  Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
    con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
    convertir un entero en un carácter.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/

public class Ej12 {
    
  public static void main(String[] args) throws InterruptedException {
      /** Con throws InterruptedException podemos hacer que vaya imprimiendo más lento*/
    //Tiene que ser un número entre el 0 y 255
    //Este número se puede convertir en caracter con char
    /** cuando se pone un char, que es un solo caracter, se ponen comillas simples y no doble
     * cuando se hace un casting con un entero, se busca en la tabla ASCII*/
    String verde = "\033[32m";
     int i=0;
    while (true){
      //System.out.println (i+ "  : "+(char)i);
      i= (int)(Math.random()*126)+1;
      System.out.print(verde + "  "+(char)i + "  ");
      Thread.sleep (4);
      // Dejo que el valor de i sea hasta el 127, para que salga un bucle infinito y salga una pantalla a lo matrix
    }
    
  }
}
