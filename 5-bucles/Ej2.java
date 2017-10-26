/**Ejercicio 2
    Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
public class Ej2 {
  public static void main(String[] args) {
        
    
    System.out.println("Este programa imprime los multiplos de 5 del 0 al 100");
    int n = 0;
     while (n <=100){
      if (n%5==0){
      System.out.println(n);
      }
      n++;
      }
  }
}
