/**Ejercicio 12.
 * 
 *  Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice
    (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
    "inicial" y "final". Se debe comprobar que inicial es menor que final y que
    ambos números están entre 0 y 9. El programa deberá colocar el número de
    la posición inicial en la posición final, rotando el resto de números para que no
    se pierda ninguno. Al final se debe mostrar el array resultante.
    Por ejemplo, para inicial = 3 y final = 7.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej12 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("El programa mueve numeros de las posiciones del array ");
    System.out.println(" ");
    System.out.print("Por favor, introduzca cada número y pulse intro  ");
    
    int []array= new int [10]; //para guardar 10 valores
    int i=0;
    int[] aux = new int[10]; //para ir guardando los valores primos
    int inicialNum=0;
    int finalNum=0;
    
    for (i=0; i<10; i++) { //guardo los numeros
      array[i]= Integer.parseInt(s.nextLine());
    }
    
    System.out.print("El número inicial tiene que ser más pequeño que el final y ambos entre el 0 y 9  ");
    
    do {
      System.out.print("Por favor, introduzca una posición inicial y pulse intro  ");
      inicialNum=Integer.parseInt(s.nextLine());
      System.out.print("Ahora introduzca una posición final y pulse intro  ");
      finalNum=Integer.parseInt(s.nextLine());
      if ((inicialNum> finalNum) || (inicialNum>9) || (finalNum>9)){
        System.out.println("Lo siento has introducido un numero incorrecto.");
        System.out.println(" Intentalo de nuevo ");
      }
    } while ((inicialNum> finalNum) || (inicialNum>9) || (finalNum>9));
    
    System.out.println();
    System.out.println();
    System.out.printf("Indice  "," %4d");
    
    for (i = 0; i < 10; i++) { //imprimo el indice
      System.out.printf(" |%7d ", i);
    }
    
    System.out.println();
    System.out.println();
    System.out.print("Array   ");
    
    for(i=0;i<array.length;i++){  //imprimo el array introducido por teclado
      System.out.printf(" |%7d ", array[i]);
    }
    System.out.println(" ");
    
    for (i=0;i<10;i++){  //guardo los valores del array en el array auxiliar
      aux[i]=array[i];
    }
    aux[finalNum]=array[inicialNum];
    
    for (i = finalNum + 1; i < 10; i++){
      aux[i] = array[i - 1];
    }
    aux[0] = array[9];
    
    for (i = 0; i < inicialNum; i++){
      aux[i + 1] = array[i];
    }
    System.out.println();
    System.out.print("Cambiado");
    
    for (i = 0; i < 10; i++) { //imprimo el array cambiado
      System.out.printf(" |%7d ", aux[i]);
    }
  }
}
