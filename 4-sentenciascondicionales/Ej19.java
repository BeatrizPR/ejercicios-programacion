/**Ejercicio 19
  Realiza un programa que nos diga cuántos dígitos tiene un número entero que
  puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej19 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce un número entero (que no tenga más de 5 cifras): ");
    int numero = Integer.parseInt( System.console().readLine() );
    
    System.out.println("El número " + numero + " tiene " + Integer.toString(numero).length() + " dígitos");
    
  }
}
