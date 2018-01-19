/**Ejercicio 1 al 14.
* 
*  Este es el main de todas las funciones que he creado del ejercicio 1 al 14.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;
import matematicas.Varias;

public class Ej15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Este programa muestra los números primos que hay entre 1 y 1000. ");
    System.out.println(" ");
    
    int numero=1;
    while (numero<1000){
      numero= matematicas.Varias.esPrimoNum((int)numero);
      System.out.println("Los numeros primos entre el 1 y el 1000 son: " + numero);
      numero++;
    }
    
    

  }  // cierra el public static
} // cierra el public class
