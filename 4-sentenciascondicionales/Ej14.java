/**Ejercicio 14
  Escribe un programa que dada una hora determinada (horas y minutos),
  calcule los segundos que faltan para llegar a la medianoche.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej14 {
  public static void main(String[] args) {
    
    System.out.println("¿Qué quieres calcular?");
    System.out.println(" ----------------------");
    System.out.println(" 1. Si el número es par o impar");
    System.out.println(" 2. Si el número es divisible entre 5");
    System.out.print("\n Elija una opción (1 o 2): ");
    int opcion = Integer.parseInt(System.console().readLine());
     switch (opcion) {
      case 1:
        System.out.println("¿El número es par o impar ?");
        System.out.println("Por favor, introduce un número entero: ");
        int parImpar = Integer.parseInt( System.console().readLine() );
        if (parImpar %2==0) {
          System.out.println(parImpar + " es par.");
        } else {
          System.out.println(parImpar + " es impar.");
        }
        break;
    
      case 2:
        System.out.println("¿El número es o no divisible entre 5? ");
        System.out.println("Por favor, introduce un número entero: ");
        int divisible = Integer.parseInt( System.console().readLine() );
        if (divisible %5==0) {
          System.out.println(divisible + " es divisible entre 5.");
        } else {
          System.out.println(divisible + " no es divisible entre cinco.");
        }
        break;
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }

  }
}
