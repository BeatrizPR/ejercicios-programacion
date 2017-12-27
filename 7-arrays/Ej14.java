/**Ejercicio 14.
 * 
 *  Escribe un programa que pida 8 palabras y las almacene en un array. A
    continuación, las palabras correspondientes a colores se deben almacenar al
    comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
    auxiliares como quieras. Los colores que conoce el programa deben estar en
    otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
    blanco y morado.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej14 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que ordena los colores y palabras en un array ");
    System.out.println("Solo tiene en cuenta estos colores:verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado");
    System.out.println(" ");
    System.out.println(" ");
    
    System.out.print("Introduzca una palabra (algún color) y pulse intro:");
    String[] palabra=new String [9];
    String[] color = new String[9];
    String[] aux= new String[9];
    int comprobar=0;  //para comprobar
    int posicion = 0; //la posicion vaya incrementando y no se quede nada atras
    
    color[0] = "verde";
    color[1] = "rojo";
    color[2] = "azul";
    color[3] = "amarillo";
    color[4] = "naranja";
    color[5] = "rosa";
    color[6] = "negro";
    color[7] = "blanco";
    color[8] = "morado";
    
    for (int i=0; i<9;i++){
        palabra[i]=(s.nextLine());
    }
    
    for (int i = 0; i < 9; i++) {
      
      for (int r = 0; r < 9; r++) {
        
        if ((palabra[i]).equals(color[r])) {
          aux[posicion] = (palabra[i]);
          posicion++;
        }
      }
    }
    
    for (int i = 0; i < 9; i++) {
      comprobar = 0;
      for (int r = 0; r < 9; r++) {
        if ((palabra[i]).equals(color[r])) {
          comprobar++;
        }
      } 
      
      if (comprobar == 0) {
        aux[posicion] = (palabra[i]);
        posicion++;
      }
    }
    System.out.printf("\n Indice  "," %4d");
    
    for (int i = 0; i < 9; i++) { //imprimo el indice
      System.out.printf(" |%7s ", i);
    }
    System.out.print("\n Array   ");
    
    for(int i=0;i<palabra.length;i++){  //imprimo el array introducido por teclado
      System.out.printf(" |%7s ", palabra[i]);
    }
    System.out.print("\n Cambiado");
    
    for (int i = 0; i <aux.length; i++) { //imprimo el array cambiado
      System.out.printf(" |%7s ", aux[i]);
    }
    
    
    System.out.println();
      
      
      
    
    
    
    
  }
}
