/**
 * Ejercicio 2
Realiza un programa que pida una hora por teclado y que muestre luego
buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.
 *
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */

public class Ej2 {
  public static void main(String[] args) {
    System.out.print("Introduce la hora en punto:");
    /**String linea = System.console().readLine();
    int n = Integer.parseInt( linea );
    * */
    int n = Integer.parseInt( System.console().readLine());

    if ((n >= 6) && (n <= 12)) {
      System.out.println("Buenos días");
    }   
  
    if ((n >= 13) && (n <= 20)) {
      System.out.println("Buenas tardes");
    } 
    if ((n >= 21) && (n <= 23)|| (n <= 5)) {
      System.out.println("Buenas noches");
    }else {
        System.out.println("El número introducido no es correcto.");
        System.out.println("El número introducido debe estar entre el 0 y el 23");
    }
  }
}
