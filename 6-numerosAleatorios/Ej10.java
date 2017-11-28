/**Ejercicio 10.
 * 
 *  Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
    El carácter con el que se pinta cada línea se elige de forma aleatoria
    entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
    aleatoria entre 1 y 40 caracteres.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej10 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Generación de líneas con carácteres elegidos al azar");
    
      for (int i=1; i<=10;i++){ //Para pintar las 10 lineas
        
        int caracter =(int)(Math.random()* 5);
        int pintar =(int)(Math.random()* 40)+1; //saco de 1 a 40 caracteres
        
        for (int j=0; j<=pintar;j++){ //para imprimir el numero de caracter
          
          String c=" ";
          switch(caracter) {
          case 0:
            c = " * ";
            break;
          case 1:
            c = " - ";
            break;
          case 2:
            c = " - ";
            break;
          case 3:
            c = " . ";
            break;
          case 4:
            c = " | ";
            break;
          case 5:
            c = " @ ";
            break;
          default:
          }
          System.out.print(c);
          
        }
        System.out.println();
      }
      
  }
}
