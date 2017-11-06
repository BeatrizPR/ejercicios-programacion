/**Ejercicio 22
 * 
    Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     
     boolean NumeroPrimo = true;

    for (int numero = 2; numero <= 100; numero++) {
      
      NumeroPrimo = true;
      for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
          /** Divimos un numero por i, que siempre es mayor que este y vemos, que el numero no es primo*/
          NumeroPrimo = false;
        }
      }
          /**Si el número es primo, lo imprimimos por pantalla*/
      if (NumeroPrimo) {
        System.out.println(numero);
      }
    }

  }
}
