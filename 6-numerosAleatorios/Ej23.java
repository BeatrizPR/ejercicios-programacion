/**Ejercicio 23.
 * 
 *  Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
    Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej23 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Lanzamos 5 dados de poker");
    System.out.println(" ");
      
      int dado=0;
      
      for (int i=0; i<5;i++){ //sacar 5 dados
        dado =(int)(Math.random()* 6);

          String figura=" ";
          switch(dado) { //para sacar la figura del dado
          case 0:
            figura = "As";
            break;
          case 1:
            figura = "K";
            break;
          case 2:
            figura = "Q";
            break;
          case 3:
            figura = "J";
            break;
          case 4:
            figura = "7";
            break;
          case 5:
            figura = "8";
            break;
          default:
          } //termina switch 
       
      System.out.print( figura + " ");
      } //termina el for
      System.out.println(  " ");
      
  }
}
