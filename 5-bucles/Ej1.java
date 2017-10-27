/**Ejercicio 1
    Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
public class Ej1 {
  public static void main(String[] args) {
        
    for (int n = 0; n<=100; n++) {
      if(n%5==0){
      System.out.println(n);
      }
    }
  }
}
