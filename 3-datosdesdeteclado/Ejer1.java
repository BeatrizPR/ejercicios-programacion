public class Ejer1 {
  public static void main(String[] args) {

    String linea;

      /** podemos poner el nº con linea = System.console().readLine() 
      * o directamente en la linea de int
      * int primerNumero = Integer.parseInt(System.console().readLine()); */

    System.out.print("Por favor, introduce un número con o sin decimales: ");
    double primerNumero = Double.parseDouble( System.console().readLine());

    System.out.print("introduce otro, por favor: ");
    double segundoNumero = Double.parseDouble( System.console().readLine() );

    double total = primerNumero * segundoNumero;

    System.out.print("La multiplicación del primer número y el segundo número es " + total);
    
  } 
}
