/**
 *Ejercicio 10. Realizar un conversor de Mb a Kb.
 * 
 *
 * @author Beatriz 
 */

public class Ejer10 {
  public static void main(String[] args) {

    System.out.println("Conversor de Mb a Kb ");
    System.out.print("Por favor, introduce los Megabytes: ");
    double mg = Double.parseDouble(System.console().readLine());
    
    double kb = mg * 1024;
    System.out.printf( mg + " Mg son " + kb + " Kb");
    
  }
}

