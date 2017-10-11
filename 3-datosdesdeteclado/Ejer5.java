/**
 * Ejercicio 5. Realizar el área de un rectángulo.
 *
 * @author Beatriz
 */
 
public class Ejer5 {
  public static void main(String[] args) {
    
    System.out.println("Calcular el área de un rectángulo ");
    
   System.out.print("Por favor, introduce la base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce la altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    
    double areaRectangulo = base*altura;

    System.out.println("El área del rectangulo es " + areaRectangulo);

  }
}
