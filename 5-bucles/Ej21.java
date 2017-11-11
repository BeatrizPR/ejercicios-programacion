/**Ejercicio 21
    Realiza un programa que vaya pidiendo números hasta que se introduzca un
    numero negativo y nos diga cuantos números se han introducido, la media de
    los impares y el mayor de los pares. El número negativo sólo se utiliza para
    indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
      int numero=0;
      int contadorImpar =0;
      int sumaImpar=0;
      int mayorPar=0;
      int totalNumeros=0;
        
      while (numero >=0){
        System.out.println("Por favor, introduce un número: ");
        numero= Integer.parseInt(s.next());
        int par= numero%2;
        totalNumeros++;
        if (par!=0){
          contadorImpar++;
          sumaImpar+=numero;
          System.out.println("La media de los números impares introducidos es " + (sumaImpar/contadorImpar) );
        } else if (numero>mayorPar){
            mayorPar=numero;
            
          }
        System.out.println("El total de números introducidos es "+ totalNumeros );
        System.out.println("El número más grande de los pares es " + mayorPar );
          
        } 
        
  }
}
