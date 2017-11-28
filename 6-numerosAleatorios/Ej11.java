/**Ejercicio 11.
 * 
 *  Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
    aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
    final aparecerá el número de suspensos, el número de suficientes, el número
    de bienes, etc.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej11 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Generación de líneas con carácteres elegidos al azar");
      int contadorSuspenso=0;
      int contadorAprobado=0;
      int contadorBien=0;
      int contadorNotable=0;
      int contadorSobresaliente=0;
        
      for (int i=1; i<=20;i++){ //Para imprimir las 20 notas
        
        int notaNum =(int)(Math.random()* 11);

          String nota=" ";
          switch(notaNum) {
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
            nota = "Suspenso ";
            contadorSuspenso++;
            break;
          case 5:
            nota = "Aprobado ";
            contadorAprobado++;
            break;
          case 6:
            nota = "Bien ";
            contadorBien++;
            break;
          case 7:
          case 8:
            nota = "Notable ";
            contadorNotable++;
            break;
          case 9:
          case 10:
            nota = "Sobresaliente ";
            contadorSobresaliente++;
            break;
          default:
          }
          System.out.println(nota);
        
      }
      System.out.println(" ");
      System.out.println("El total de Suspensos es " + contadorSuspenso);
      System.out.println("El total de Aprobados es " + contadorAprobado);
      System.out.println("El total de Bien es " + contadorBien);
      System.out.println("El total de Notables es " + contadorNotable);
      System.out.println("El total de Sobresaliente es " + contadorSobresaliente);
  }
}
