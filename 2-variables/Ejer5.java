/**
 * Ejercicio 5. Conversor de pesetas a euros
 *
 * @author Beatriz 
 */

public class Ejer5 {
  public static void main(String[] args) {

    double pesetas;
    pesetas = 273;
    double euros = (pesetas / 166.386);
  
    System.out.print(pesetas);
    System.out.print(" pesetas son ");
    System.out.printf("%.2f€\n", euros);
  }
}

