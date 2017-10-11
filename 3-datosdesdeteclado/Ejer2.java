/**
 * Ejercicio 2. Conversor de euros a pesetas
 *
 * @author Beatriz 
 */

public class Ejer2 {
  public static void main(String[] args) {

    System.out.println("Convertidor de euros a pesetas");
    System.out.print("Por favor, introduce euros para convertirlos pesetas: ");
    double euros = Double.parseDouble (System.console().readLine());
    int pesetas = (int)(euros * 166.386);
    
    System.out.println( (double) euros + " € " + "son " + (int) pesetas + "pts.");
  }
}

