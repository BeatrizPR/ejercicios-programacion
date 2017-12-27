/**Ejercicio 7.
 * 
 *  Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
    muestre por pantalla separados por espacios. El programa pedirá entonces
    por teclado dos valores y a continuación cambiará todas las ocurrencias del
    primer valor por el segundo en la lista generada anteriormente. Los números
    que se han cambiado deben aparecer entrecomillados.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej7 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("El programa cambiará el número que elijas de la lista ");
    System.out.print("generada al azar y lo cambiara por el numero que indiques");
    System.out.println(" ");
    System.out.println(" ");
    
    int []array= new int [100]; //para guardar 100 valores
    int i=0;
    int cambioNum=0; //El num que vamos a cambiar del array
    int nuevoNum=0; //El num nuevo que sustituye al que había
    
    for (i=0; i<100; i++) { //guardo los numeros introducidos
      array[i]= (int)(Math.random()* 21);
    }
    
    for (i=0; i<array.length; i++){
      System.out.print(array[i] +" ");
    }
    System.out.println(" ");
    System.out.print("Por favor, introduzca un número de la lista para sustituirlo y pulse intro  ");
    cambioNum=Integer.parseInt(s.nextLine());
    System.out.print("¿Por qué número quieres cambiarlo? Pulsa intro  ");
    nuevoNum=Integer.parseInt(s.nextLine());
    
    for (i = 0; i < 100; i++) {
    
    if (array[i] == cambioNum) {
      System.out.print("'"+nuevoNum + "'" + " ");
    } else {
      System.out.print(array[i] + " ");
      }
    }
    
    
    
  }
}
