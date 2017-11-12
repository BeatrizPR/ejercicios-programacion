/**Ejercicio 24
 * 
 Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
           1
          121
         12321
        1234321
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 * 
 * */

import java.util.Scanner;

public class Ej24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Voy a pintar una pirámide con el número de filas que uste introduzca y con ese mismo número");
    
    System.out.println("Introduzca un número: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
    
    System.out.println(" "); // Es un salto de línea, simplemente estético
    
    int altura = 1;
    int espacios= alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      
      for (int i = 1; i <= espacios; i++) {  //con este for añado losespacios
        System.out.print(" ");
      }
    
      for (int i = 1; i < altura; i++) { //con este for imprimo la línea de números
        System.out.print(i);
      }
      
      for (int i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      altura++;
      espacios--;
      
    } //while
  }
}
