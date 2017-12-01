/**Ejercicio 15.
 * 
 *  Realiza un generador de melodía con las siguientes condiciones:
    a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
    sol, la y si.
    b) Una melodía está formada por un número aleatorio de notas mayor o igual
    a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
    c) Cada grupo de 4 notas será un compás y estará separado del siguiente
    compás mediante la barra vertical "|" (Alt + 1). El final de la melodía se marca
    con dos barras.
    d) La última nota de la melodía debe coincidir con la primera.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej15 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Generador de una melodía");
    System.out.println(" ");
      
      int notasMusicales =(int)(Math.random()* 6);
      int melodia=(int)(Math.random()* 4);
      int multiplo=(int)(Math.random()*28);
      multiplo=multiplo%4;
     // while (multiplo==0){                              !!!!! NO FUNCIONA EL WHILE 
      for (int i=0; i<4;i++){ //pintar 4 notas -melodia
        
      String nota=" ";
       switch(notasMusicales) {
          case 0:
            nota = " Do ";
            break;
          case 1:
            nota = " Re ";
            break;
          case 2:
            nota = " Mi ";
            break;
          case 3:
            nota = " Fa ";
            break;
          case 4:
            nota = " Sol ";
            break;
          case 5:
            nota = " La ";
            break;
          case 6:
            nota = " Si ";
            break;
          default:
          }
          System.out.print(nota);
      } //termina el for de la melodia para que salgan 4 notas
          System.out.println("|");
     // } //termina el while
      

  }
}
