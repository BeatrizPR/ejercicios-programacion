/**
 * Ejercicio 4. Conversor de euros a pesetas
 *
 * @author Beatriz 
 */

public class Ejer4 {
  public static void main(String[] args) {

    double euros;
    euros = 22.30;
    int pesetas = (int)(euros * 166.386);
    
    System.out.println( (double) euros + " € " + "son " + (int) pesetas + "pts.");
  }
}

