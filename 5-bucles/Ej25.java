/**Ejercicio25.
 * 
  Realiza un programa que pida un número por teclado y que luego muestre ese
  número al revés.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
        System.out.println("Introduce un número para darle la vuelta ");
        int numeroTeclado= Integer.parseInt(s.next());
        
        int volteado=0;
        int numero= numeroTeclado;
        
        do{
        volteado = (volteado*10)+ (numero%10);
        numero /= 10; 
        
        } while (numero >0); 
        
      System.out.println("El número " + numeroTeclado + " volteado es " + volteado);
  }
}
