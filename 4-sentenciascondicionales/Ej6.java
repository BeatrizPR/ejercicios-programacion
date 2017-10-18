/** Ejercicio 6
  Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
  una altura h. Aplica la fórmula t =√2h/g siendo g = 9,81m/s²"
 *
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 * 
 */
 public class Ej6 {
  public static void main(String[] args) {
    System.out.println("Resuelve cuanto tarda en caer un objeto, siendo g=9,81m/s²");
    System.out.println("Por favor, introduce la altura: ");
    double h = Integer.parseInt( System.console().readLine() );
    double g = 9.81;
    if (h <= 4) {
      System.out.printf( "Lo siento, está operación no es posible, ya que no se pueden realizar una raiz cuadrada de un número negativo.");
    }   
  
    else {
      double raiz = ((2 * h)/ 9.81); 
      double total = (Math.sqrt (raiz));
      System.out.printf( "El tiempo que tardará en caer es %.2fs", total);
    }

  }
}

