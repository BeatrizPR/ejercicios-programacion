/**Ejercicio 3
    Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
public class Ej3 {
  public static void main(String[] args) {
        
    int n = 0;
    System.out.println("Este programa imprime los multiplos de 5 del 0 al 100");
    do {
      if (n%5==0){
      System.out.println(n);
      }
      n++;
    } while (n <=100);
  }
}
