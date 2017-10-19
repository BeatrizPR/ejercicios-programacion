/**Ejercicio 7 programa que calcula la media de tres notas
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 * 
 */
 public class Ej7 {
  public static void main(String[] args) {
    System.out.println("Calcula la media de 3 exámenes.");
    System.out.println("Por favor, introduce la nota del primer examen: ");
    double primeraNota = Integer.parseInt( System.console().readLine() );
    System.out.println("Por favor, introduce la nota del segundo examen: ");
    double segundaNota = Integer.parseInt( System.console().readLine() );
    System.out.println("Por favor, introduce la nota del tercer examen: ");
    double terceraNota = Integer.parseInt( System.console().readLine() );
    if (primeraNota <= 3 || segundaNota <= 3 || terceraNota <= 3) { 
      System.out.printf( "Lo siento, no se puede hacer media con menos de un 4 en algún examen.");
    }   ///Suponiendo que el profesor no haga media con menos de un 4
  
    else {
      double media = ((primeraNota + segundaNota + terceraNota) /3); 
      System.out.printf( "Tu media es de %.2f", media);
    }

  }
}


