/**
 * ejercicio 4. Realizar calculos de números como +,-,* y /.
 *
 * @author Beatriz
 */
 
public class Ejer4 {
  public static void main(String[] args) {
    
    
   System.out.print("Por favor, introduce un número entero para x: ");
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce un número entero para y: ");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    
    
    double suma = primerNumero+segundoNumero;
    double resta = primerNumero-segundoNumero;
    double multiplicacion =primerNumero*segundoNumero;
    double division =primerNumero/segundoNumero;

    System.out.println("El valor de x es " + primerNumero);
    System.out.println("El valor de y es " + segundoNumero);
    System.out.println("x + y es " + suma);
    System.out.println("x - y es " + resta);
    System.out.println("x * y es " + multiplicacion);
    System.out.println("x / y es " + division);

  }
}
