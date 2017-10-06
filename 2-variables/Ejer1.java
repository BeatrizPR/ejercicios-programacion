/**
 * ejercicio 1. variables
 *
 * @author Beatriz
 */
 
public class Ejer1 {
  public static void main(String[] args) {
    int x = 144; // Se declara la variable x como entera
    int y = 999;
    
    int suma = x+y;
    int resta = x-y;
    int multiplicacion =x*y;
    /** no lo usamos porque no hace correctamente la division - (double division = x/y;) */

    System.out.println("El valor de x es " + x);
    System.out.println("El valor de y es " + y);
    System.out.println("x + y es " + suma);
    System.out.println("x-y es " + resta);
    System.out.println("x*y es " + multiplicacion);
    System.out.println("x/y es " + ( (double)x/ (double)y));

  }
}
