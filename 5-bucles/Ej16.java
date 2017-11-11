/**Ejercicio 16
 * 
    Escribe un programa que diga si un número introducido por teclado es o no
    primo. Un número primo es aquel que sólo es divisible entre él mismo y la
    unidad.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
        System.out.println("Por favor, introduce número para saber si es primo: ");
        int numero= Integer.parseInt(s.next());
        
        
        int contador=0;
        for (int n=1;n<=numero;n++){
          int numeroPrimo= numero%n;
          
          if (numeroPrimo==0){
          contador++;
          }
        }
      if (contador==2){
        System.out.println("Este numero  es primo ");
      } 
      else {
        System.out.println("Este numero no es primo ");} 

  }
}
