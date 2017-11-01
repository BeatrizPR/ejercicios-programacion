/**Ejercicio 17
 * 
    Realiza un programa que sume los 100 números siguientes a un número entero
    y positivo introducido por teclado. Se debe comprobar que el dato introducido
    es correcto (que es un número positivo).
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
        System.out.println("Por favor, introduce un número: ");
        int numero= Integer.parseInt(s.next());
        int contador= numero +100;
        int suma=0;
        if (numero >0) {
          do {
            suma= numero+1;
            System.out.println(suma);
            numero++;
            
          } while (numero < contador);
        } else { System.out.println("Lo siento ese número es negativo");
          }
  }
}
