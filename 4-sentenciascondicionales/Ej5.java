/**Ejercicio 5
  Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+ b = 0).
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej5 {
  public static void main(String[] args) {
    System.out.println("Resuelve una ecuación de primer grado del tipo ax+b=0");
    System.out.println("Por favor, introduce un valor para a: ");
    double a = Integer.parseInt( System.console().readLine() );
    System.out.println("Por favor, introduce un valor para b: ");
    double b = Integer.parseInt( System.console().readLine() );
    if (a == 0 || b == 0) {
      System.out.printf( "Lo siento, está operación no es posible.");
    }   
  
    else {
      double total = -b / a; 
      System.out.printf( "El resultado de la ecuación es" + total);
    }

  }
}
