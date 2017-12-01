/**Ejercicio 18.
 * 
 *  Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
    sustituir el color blanco por colores más alegres. Realiza un programa que
    genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
    cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
    que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
    violeta y naranja.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej18 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" Sacamos colores al azar, sin que se repitan");
    System.out.println(" ");
      
      int pintarColor =0;
      int habitacion1=0;
      int habitacion2=0;
      int habitacion3=0;
      
      for (int i=0; i<3;i++){ //sacar 3 colores
        pintarColor =(int)(Math.random()* 5);

          String color=" ";
          switch(pintarColor) {
          case 0:
            color = "rojo";
            break;
          case 1:
            color = "azul";
            break;
          case 2:
            color = "verde";
            break;
          case 3:
            color = "amarillo";
            break;
          case 4:
            color = "violeta";
            break;
          case 5:
            color = "naranja";
            break;
          default:
          } //termina switch para sacar los colores
          
          switch(i) {
          case 0:
            habitacion1=pintarColor;
            break;
          case 1:
            habitacion2=pintarColor;
            break;
          case 2:
            habitacion3=pintarColor;
            break;
            default:
          } //termina switch de las 3 habitaciones
          //System.out.print(color);                                NO ESTÁ TERMINADO !!!!!!!!!
          System.out.println("");
          
          if ( (habitacion1!=habitacion2) && (habitacion2!=habitacion3) && (habitacion1!=habitacion3)){
            
            System.out.println(color);
            
          }
          
      } //termina el for de la tirada
      System.out.println();
      System.out.println(" ");
      
      /**if ( (habitacion1!=habitacion2) && (habitacion2!=habitacion3) && (habitacion1!=habitacion3)){
        System.out.println("Pinta la habitación 1 "+ color);
      } else{
        System.out.println("Pinta la habitación 2" + color);
        System.out.println("Pinta la habitación 3" + color);
          }
     */
  }
}
