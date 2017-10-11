public class Ejer1 {
  public static void main(String[] args) {

    String linea;

      /** podemos poner el nº con linea = System.console().readLine() 
      * o directamente en la linea de int
      * int primerNumero = Integer.parseInt(System.console().readLine()); */

    System.out.print("Por favor, introduce un número con o sin decimales: ");
    linea = System.console().readLine();
    double primerNumero = Double.parseDouble( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    double segundoNumero = Double.parseDouble( linea );

    double total = (2 * primerNumero) + segundoNumero;

    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El doble del primer número más el segundo es " + total);
    
  } 
}
