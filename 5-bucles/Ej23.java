/**Ejercicio 23
    Escribe un programa que permita ir introduciendo una serie indeterminada
    de números mientras su suma no supere el valor 10000. Cuando esto último
    ocurra, se debe mostrar el total acumulado, el contador de los números
    introducidos y la media.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
        /**System.out.println("Introduce un número negativo para parar el programa");
        System.out.println("Por favor, introduce un número: ");
        int numero1= Integer.parseInt(s.next());*/
        int numero=0;
        int contador =0;
        int suma=0;
        int mayorPar=0;
        int totalNumeros=0;
        
        System.out.println("Introduzca hasta que la suma de 10000 ");
        
        
        while (suma <10000){
          System.out.println("Por favor, introduce un número: ");
          numero= Integer.parseInt(s.next());
        
          totalNumeros++;
          contador++;
          suma+=numero;
        } 
        
        System.out.println("El total de números introducidos es "+ totalNumeros );
        System.out.println("El total acumulado es " + suma );
        System.out.println("La media de los números introducidos es " + (suma/contador) );
  }
}
