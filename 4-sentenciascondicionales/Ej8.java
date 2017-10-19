/**Ejericicio8.
 * Amplía el programa anterior (media de 3 notas)para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 * 
 */
 public class Ej8 {
  public static void main(String[] args) {
    System.out.println("Calcula la media de 3 exámenes.");
    System.out.println("Por favor, introduce la nota del primer examen: ");
    double primeraNota = Integer.parseInt( System.console().readLine() );
    System.out.println("Por favor, introduce la nota del segundo examen: ");
    double segundaNota = Integer.parseInt( System.console().readLine() );
    System.out.println("Por favor, introduce la nota del tercer examen: ");
    double terceraNota = Integer.parseInt( System.console().readLine() );
    double g = 9.81;
    if (primeraNota <= 3 || segundaNota <= 3 || terceraNota <= 3) { 
      System.out.printf( "Lo siento, no se puede hacer media con menos de un 4 en algún examen.");
    }   ///Suponiendo que el profesor no haga media con menos de un 4
    double media = ((primeraNota + segundaNota + terceraNota) /3);
    if ( media <= 4) {
      
      System.out.printf( "Tu media es de %.2f. Insuficiente", media);
    }
    if ( media == 5) {
      
      System.out.printf( "Tu media es de %.2f. Suficiente", media);
    }
    if ( media == 6) {
      
      System.out.printf( "Tu media es de %.2f. Bien", media);
    }
    if ( media ==7 | media ==8) {
      
      System.out.printf( "Tu media es de %.2f. Notable", media);
    }
    if ( media == 9 || media == 10) {
      
      System.out.printf( "Tu media es de %.2f. Sobresaliente", media);
    }

  }
}


