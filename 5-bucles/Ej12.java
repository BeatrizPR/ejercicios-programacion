/**Ejercicio 12
  Escribe un programa que muestre los n primeros términos de la serie de
  Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
  y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
  los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
  debe introducir por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

 public class Ej12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, introduce una cifra para los números que quieres que muestre de la serie Fibonacci: ");
    int cifra= Integer.parseInt(s.next());
    System.out.println("-----");
      int primerN=0;
      int segundoN=1;
      int n=0;
      System.out.println(primerN);
      System.out.println(segundoN);
        while (n<=cifra-3){
          int fibonacci = primerN + segundoN;
          System.out.println(fibonacci);
          primerN=segundoN;
          segundoN=fibonacci;
          n++;
          }
  }
}
