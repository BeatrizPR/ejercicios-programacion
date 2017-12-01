/**Ejercicio 16.
 * 
 *  Realiza un simulador de máquina tragaperras simplificada que cumpla los
    siguientes requisitos:
    a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
    figuras posibles: corazón, diamante, herradura, campana y limón.
    b) Si las tres figuras son diferentes se debe mostrar el mensaje "Lo siento,
    ha perdido".
    c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje "Bien,
    ha recuperado su moneda".
    d) Si las tres figuras son iguales se debe mostrar "Enhorabuena, ha ganado
    10 monedas".
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej16 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Máquina tragaperras");
    System.out.println(" ");
      
      int tirada =0;
      int figura1=0;
      int figura2=0;
      int figura3=0;
      
      for (int i=0; i<3;i++){ //pintar 3 figuras
        tirada =(int)(Math.random()* 5);

          String figura=" ";
          switch(tirada) {
          case 0:
            figura = "corazón ";
            break;
          case 1:
            figura = "diamante ";
            break;
          case 2:
            figura = "herradura ";
            break;
          case 3:
            figura = "campana ";
            break;
          case 4:
            figura = "limón ";
            break;
          default:
          } //termina switch tirada figura
          
          switch(i) {
          case 0:
            figura1=tirada;
            break;
          case 1:
            figura2=tirada;
            break;
          case 2:
            figura3=tirada;
            break;
            default:
          } //termina switch de las 3 figuras
          System.out.print(figura);
          System.out.print("");
          
      } //termina eel for de la tirada
      System.out.println();
      System.out.println(" ");
      if ( (figura1!=figura2) && (figura2!=figura3) && (figura1!=figura3)){
        System.out.println("Lo siento, ha perdido");
      } else if ( (figura1==figura2) && (figura2==figura3)){
        System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else {
             System.out.println("Bien, ha recuperado su moneda");
          }
     
  }
}
