/**Ejercicio 23
    Escribe un programa que calcule el precio final de un producto según su
    base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
    reducido o superreducido) y el código promocional. Los tipos de IVA general,
    reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
    promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
    respectivamente que no se aplica promoción, el precio se reduce a la mitad,
    se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
    muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
import java.util.Scanner;
 public class Ej23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calcula el IVA de una factura ");
    System.out.print("Por favor, introduce el total de la factura sin IVA: ");
    double baseImpo = Double.parseDouble(s.nextLine());
    System.out.print("Por favor, introduce el IVA (general,reducido o superreducido) ");
    String iva = s.nextLine().toLowerCase();
    
    int tipoIva = 0;
    
    switch(iva) {
      case "general":
        tipoIva = 21;
        break;
      case "reducido":
        tipoIva = 10;
        break;
      case "superreducido":
        tipoIva = 4;
        break;

    }
    System.out.print("Por favor, introduce que código promocional tiene (nopro, mitad, menos5 o 5porc):");
    String promo = s.nextLine().toLowerCase();
    int tipoPromo = 0;
    
    double sacarIva = baseImpo * tipoIva /100;
    double totalIva = baseImpo + sacarIva;
    
    double descuento = 0;
    switch(promo) {
      case "nopro":
        tipoPromo = 0;
        break;
      case "mitad":
        tipoPromo = 2;
        descuento= totalIva/2;
        break;
      case "menos5":
        tipoPromo= -5;
        descuento= totalIva -5;
        break;
      case "5porc":
        tipoPromo = 5;
        descuento= (totalIva*5)/100;
        break;

    }
    
    System.out.println( "Base imponible " + baseImpo + "€");
    System.out.println( "El IVA es " + tipoIva + "%");
    System.out.println( "El precio con IVA es " + totalIva + "€");
    System.out.println( "El código promocional es " +promo +": -"+ descuento +"€");
    System.out.println( "El total es " + descuento + "€");
  }
}
