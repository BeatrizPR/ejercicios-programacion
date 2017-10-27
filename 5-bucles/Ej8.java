/**Ejercicio 8
    Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número para multiplicarlo");
    int n = Integer.parseInt(s.next());
    
    int tabla ;
    int multiplicacion = 0;
    System.out.println("Tabla de multiplicar");
    do {
      tabla= n * multiplicacion;
      System.out.println(" " + n + "*"+ multiplicacion + "= " + tabla + " ");
      
      multiplicacion++;
    } while (multiplicacion <=10);
  }
}
