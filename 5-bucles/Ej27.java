/**Ejercicio27.
 * 
  Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
  entre 1 y un número leído por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
      System.out.println("Introduce un número  ");
      int numeroTeclado= Integer.parseInt(s.next());
      
      int numero= numeroTeclado;
      int contador=0;
      int suma=0;
      int multiplo=0;
      int n=1;
      
      System.out.println("Los números multiplos de 3, desde el que has introducido son ");
      
      if (numero%3==0){
	  while (multiplo<numero){
	  multiplo=n*3;
	
	  System.out.println(multiplo);
	  n++;
	} 
      
        
      }
      
     
  }
}
