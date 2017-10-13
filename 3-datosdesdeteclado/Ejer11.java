/**
 *Ejercicio 11. Realizar un conversor de Kb a Mb.
 * 
 *
 * @author Beatriz 
 */

public class Ejer11 {
  public static void main(String[] args) {

    System.out.println("Conversor de Kb a Mb ");
    System.out.print("Por favor, introduce los Kilobytes: ");
    double kb = Double.parseDouble(System.console().readLine());
    
    double mb = kb / 1024;
    System.out.printf( kb + " Kb son " + mb + " Mb");
    
  }
}

