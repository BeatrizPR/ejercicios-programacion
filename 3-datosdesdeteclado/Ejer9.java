/**
 *Ejercicio 9. Calcular el volumen de un cono según la fórmula V = 1/3 pi r2h
 * 
 *
 * @author Beatriz 
 */

public class Ejer9 {
  public static void main(String[] args) {

    System.out.println("Calcula el volumen de un cono ");
    System.out.print("Por favor, introduce la altura en cm: ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce el radio en cm: ");
    double r = Double.parseDouble(System.console().readLine());
  
      /** uso Math.PI para representar pi y Math.pow para elevar un nº a otro
       * en este caso elevando r a 2*/
    
    double volumen = ((Math.PI * Math.pow (r, 2) *h) /3);
    System.out.printf( "El volumen es %.2fcm³; ", volumen);
    
    /**utilizo %.2f para que imprima solo dos decimales*/
  }
}

