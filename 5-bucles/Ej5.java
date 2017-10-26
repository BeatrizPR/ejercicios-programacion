/**Ejercicio 5
    Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
    utilizando un bucle while.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
public class Ej5 {
  public static void main(String[] args) {
        
    int n=320;
    while ((n<=320) && (n>160)){
      n-=20;
      System.out.println(n);
    }
  }
}
