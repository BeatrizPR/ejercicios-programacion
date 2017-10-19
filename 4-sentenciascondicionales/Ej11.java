/**Ejercicio 11
  Escribe un programa que dada una hora determinada (horas y minutos),
  calcule los segundos que faltan para llegar a la medianoche.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej11 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce la hora y los minutos entre 1 de la mañana y las 23:59 : ");
    double hora = Double.parseDouble( System.console().readLine() );
    if ((hora > 0) && ( hora <=23)) {
      double resta = (int)24 - hora;
      double segundos = (int)resta * 60 *60;
      
      System.out.printf( "Faltan "+ segundos + " segundos para medianoche.");
    } else {
      System.out.printf( "Lo siento, eso no es una hora correcta.");
    }

  }
}
