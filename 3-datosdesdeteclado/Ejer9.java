/**
 *Ejercicio 9. Calcular el volumen de un cono según la fórmula V = 1/3 pi r2h
 * 
 *
 * @author Beatriz 
 */

public class Ejer9 {
  public static void main(String[] args) {

    System.out.println("Calcula el volumen de un cono ");
    System.out.print("Por favor, introduce h: ");
    double r = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce r: ");
    double h = Double.parseDouble(System.console().readLine());
    
    Math PI;
  
    
    /**mirar lo de math PI a ver como es para poner el numero pi*/
    
    
    double volumen = (1/3)* PI*r elevado a 2 *h;
    System.out.printf( "El volumen es " + volumen);
    
  }
}

