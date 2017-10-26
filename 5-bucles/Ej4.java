/**Ejercicio 4
    Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
    utilizando un bucle for.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
public class Ej4 {
  public static void main(String[] args) {
        
    for (int n = 320; ((n>160)); n=n) {
       n-=20;
      System.out.println(n);
    }
  }
}
