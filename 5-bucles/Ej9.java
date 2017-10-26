/**Ejercicio 9
  Realiza un programa que nos diga cuántos dígitos tiene un número introducido
  por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
 public class Ej9 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce un número entero: ");
    System.out.println("Introduce un número negativo para cerrar el programa");
    int numero = Integer.parseInt( System.console().readLine() );
    do {
      Integer.toString(numero).length();
      System.out.println("El número " + numero + " tiene " + Integer.toString(numero).length() + " dígitos");
      System.out.println("Si quieres cerrar el programa escribe un numero negativo, sino introduce un número entero: ");
      numero= Integer.parseInt( System.console().readLine() );
    } while (numero > 0);
      
    
    
  }
}
