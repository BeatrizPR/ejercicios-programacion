/**
 * Ejercicio 7. Calcular el total de una factura a partir de la base imponible.
 *
 * @author Beatriz 
 */
    public class Ejer7 {
  public static void main(String[] args) {

    System.out.println("Calcula el IVA de una factura ");
    System.out.print("Por favor, introduce el total de la factura sin IVA: ");
    double baseImpo = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce el IVA: ");
    double iva = Double.parseDouble(System.console().readLine());
    
    double sacarIva = baseImpo * iva /100;
    double total = baseImpo + sacarIva;
    
    System.out.printf( "El total + IVA es " + total + "€");

  }
}

