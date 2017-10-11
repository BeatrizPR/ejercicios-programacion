/**
 * Ejercicio 3. Conversor de pesetas a euros
 *
 * @author Beatriz 
 */

public class Ejer3 {
  public static void main(String[] args) {

    System.out.println("Convertidor de pesetas a euros");
    System.out.print("Por favor, introduce pesetas para convertirlas a euros: ");
    double pesetas = Double.parseDouble (System.console().readLine());
    double euros = (pesetas / 166.386);
  
    System.out.print(pesetas);
    System.out.print(" pesetas son ");
    System.out.printf("%.2f€\n", euros);
  }
}

