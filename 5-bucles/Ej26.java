/**Ejercicio26.
 * 
  Realiza un programa que pida primero un número y a continuación un dígito.
  El programa nos debe dar la posición (o posiciones) contando de izquierda a
  derecha que ocupa ese dígito en el número introducido.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
      System.out.println("Introduce un número  ");
      int numeroTeclado= Integer.parseInt(s.next());
      System.out.println("Introduce un digito para darte la posición en tu número ");
      int digito= Integer.parseInt(s.next());
      System.out.println("-------------------------------- ");
      
      
      
      int volteado=0;
      int numero= numeroTeclado;
      int ultimaCifra=0;
      int posicion =1;
      int longitudNumero =0;
      
        /** le doy la vuelta al n para sacar la ultima cifra*/
        
      while (numero >0){
        volteado = (volteado *10) + (numero%10);
        numero/=10;
        longitudNumero++;
      }
      
      while (volteado > 0) {
        if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
        }
        volteado /= 10;
        posicion++;
      }
          
      System.out.println(" es la posición del digito introducido de tu número");
  }
}
