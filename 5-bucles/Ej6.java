/**Ejercicio 6
    Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle con do-while.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
public class Ej6 {
  public static void main(String[] args) {
        
    int n=320;
    do {
      n-=20;
      System.out.println(n);
    } while ((n<=320) && (n>=160));
  }
}
