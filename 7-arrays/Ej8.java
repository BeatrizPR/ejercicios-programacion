/**Ejercicio 8.
 * 
 *  Realiza un programa que pida la temperatura media que ha hecho en cada mes
    de un determinado año y que muestre a continuación un diagrama de barras
    horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
    de asteriscos o cualquier otro carácter.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej8 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Programa que genera un diagrama de barras ");
    System.out.print("con las media de temperaturas del año");
    System.out.println(" ");
    System.out.println(" ");
    
    String[] mes = new String[12];
    
    mes[0] = "enero";
    mes[1] = "febrero";
    mes[2] = "marzo";
    mes[3] = "abril";
    mes[4] = "mayo";
    mes[5] = "junio";
    mes[6] = "julio";
    mes[7] = "agosto";
    mes[8] = "septiembre";
    mes[9] = "octubre";
    mes[10] = "noviembre";
    mes[11] = "diciembre";
    
    int[] temperatura = new int[12];
    
    for (int i = 0; i < 12; i++) { // for para guardar la temperatura de cada mes
      
      System.out.println("Introduzca la temperatura media de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(s.nextLine());
    }
    
    for (int i = 0; i < 12; i++) { // for para cada mes mes
        for (int j = 1; j <= temperatura[i]; j++) { //dibuja asteriscos para cada mes
          System.out.print("*");
        }
    System.out.println(); // hace el salto de linea de un mes a otro
      }
    
    
    
  }
}
