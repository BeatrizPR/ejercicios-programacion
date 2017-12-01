/**Ejercicio 21.
 * 
 *  Realiza un programa que genere una secuencia de cinco monedas de curso
    legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
    5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
    posiciones posibles son cara y cruz.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej21 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Mostramos una secuencia de 5 monedas lanzadas al aire");
    System.out.println(" ");
      
      int moneda=0;
      
      for (int i=0; i<5;i++){ //sacar 5 monedas
        moneda =(int)(Math.random()* 15);

          String centEur=" ";
          switch(moneda) { //para la cara y cruz
          case 0:
            centEur = "1 céntimo - cara";
            break;
          case 1:
            centEur = " 2 céntimos - cara";
            break;
          case 2:
            centEur = "5 céntimos - cara";
            break;
          case 3:
            centEur = "10 céntimos - cara";
            break;
          case 4:
            centEur = "20 céntimos - cara";
            break;
          case 5:
            centEur = "50 céntimos - cara";
            break;
          case 6:
            centEur = "1 euro - cara";
            break;
          case 7:
            centEur = "2 euros - cara";
            break;
          case 8:
            centEur = "1 céntimo - cruz";
            break;
          case 9:
            centEur = " 2 céntimos - cruz";
            break;
          case 10:
            centEur = "5 céntimos - cruz";
            break;
          case 11:
            centEur = "10 céntimos - cruz";
            break;
          case 12:
            centEur = "20 céntimos - cruz";
            break;
          case 13:
            centEur = "50 céntimos - cruz";
            break;
          case 14:
            centEur = "1 euro - cruz";
            break;
          case 15:
            centEur = "2 euros - cruz";
            break;
          default:
          } //termina switch para sacar cara o cruz
       
      System.out.println( centEur + " ");
      } //termina el for
      System.out.println(  " ");
      
          
          
  }
}
