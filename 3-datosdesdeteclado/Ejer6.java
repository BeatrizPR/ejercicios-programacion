/**
 * Ejercicio 6. Realizar el área de un triángulo.
 *
 * @author Beatriz
 */
 
public class Ejer6 {
  public static void main(String[] args) {
    
    System.out.println("Calcular el área de un triángulo ");
    System.out.println("(b*a)/2 ");
    
   System.out.print("Por favor, introduce la base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce la altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    
    double areaTriangulo = base*altura/2;

    System.out.println("El área del triángulo es " + areaTriangulo);

  }
}
