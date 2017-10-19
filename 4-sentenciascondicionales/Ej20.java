/**Ejercicio 20
  Escribe un programa que diga cuál es la primera cifra de un número entero
  introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej20 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce un número entero (que no tenga más de 5 cifras): ");
    int numero = Integer.parseInt( System.console().readLine() );
    
    
    int unidad;
    int decena;
    int centena;
    int unidadMillar;
    int decenaMillar;
    
    
    /** NO FUNCIONA 
     * 
     * 
     * 
    centena =(numero / 100);
    decena =(numero %100) /10;
    unidad =(numero %100) /10;
    
    if (centena == unidad);{
      System.out.println("El número es capicua");
    }
    
    decenaMillar = numero /10000;
    unidadMillar = (numero %10000) /10;
    centena =(numero % 10000) %10;
    decena =(numero %10000) /10;
    unidad =(numero %10000) /10;
    
    if ((unidad == decenaMillar) && (decena ==unidadMillar)){
      System.out.println("El número es capicua");
    } else {
      System.out.println("El número no es capicua");
      }
    **/
  }
}
