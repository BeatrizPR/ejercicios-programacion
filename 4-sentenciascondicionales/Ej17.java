/**Ejercicio 17
  Escribe un programa que diga cuál es la última cifra de un número entero
  introducido por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej17 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce un número entero : ");
    int numero = Integer.parseInt( System.console().readLine() );
    /** uso numero%10 para saber cual es la ultima cifra */
    int cifra = numero%10;
    System.out.printf( "La última cifra es  "+ cifra);
  }
}
