/**Ejercicio 2.
 * 
 *  Escribe un programa que pida 20 números enteros. Estos números se deben
    introducir en un array de 4 filas por 5 columnas. El programa mostrará las
    sumas parciales de filas y columnas igual que si de una hoja de cálculo se
    tratara. La suma total debe aparecer en la esquina inferior derecha.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej2 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Array de 4 filas por 5 columnas.  ");
    System.out.print("Muestras los numeros introducidos en un array en tabla");
    System.out.println(" ");
    System.out.println(" ");
    
    int[][] num = new int[4][5]; //array de 4 filas y 5 columnas
    int fila=0;
    int columna=0;
    int total=0;
    int sumaFila=0;
    int sumaColumna=0;
    
    //vamos guardando los numeros en el array
    for (int x=0; x < num.length; x++) {
      for (int y=0; y < num[x].length; y++) {
        System.out.println("Introduzca el número que quiere insertar [" + x + "," + y + "]");
        num[x][y] = s.nextInt();
      }
    }
    System.out.println();
    
    // imprimimos los números en columnas y filas
    
    for (fila=0; fila <4; fila++) { 
      System.out.print("Fila: "+ fila + " | ");
      sumaFila=0;
      for (columna=0; columna<5; columna++){
        System.out.printf("%7d | ", num[fila][columna]);
        sumaFila+=num[fila][columna];
      }
      System.out.printf("%10d", sumaFila);
      System.out.println( );
    }
    
    for (fila=0; fila <4; fila++) { 
      for (columna=0; columna<5; columna++){
        sumaColumna+=num[fila][columna];
      }
      System.out.printf("%10s", sumaColumna);
      total += sumaColumna;
      sumaColumna = 0;
    }
    System.out.printf("%20s", total);
    
    
    
  }
}
