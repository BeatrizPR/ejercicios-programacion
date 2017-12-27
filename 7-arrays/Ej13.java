/**Ejercicio 13.
 * 
 *  Escribe un programa que rellene un array de 100 elementos con números enteros
    aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
    el programa mostrará el array y preguntará si el usuario quiere destacar el
    máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
    el número destacado entre dobles asteriscos.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej13 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("El programa destaca el máximo o el minimo del array ");
    System.out.println(" ");
    System.out.println(" ");
    
    int []num= new int [100]; //para guardar 100 valores
    int i=0;
    int maximo=1;
    long minimo=999999999;
    int respuesta=0;
    int ponerAsterisco=0;
    
    for (i=0; i<100; i++) { //imprimo los numeros aleatorios
      num[i]= (int)(Math.random()* 501);
      System.out.print(num[i]+ " ");
      
      if(num[i] > maximo){  // Saco el máximo
        maximo=num[i];
      } else if(num[i]<minimo){ // Saco el minimo
          minimo = num[i];
        }
    }
    System.out.println();
    System.out.println("¿Qué quieres destacar? ( Escribe '1' para el máximo y '2' para el mínimo)");
    System.out.println("Y pulsa intro");
    respuesta=Integer.parseInt(s.nextLine());
    
    if (respuesta==1){
      ponerAsterisco=maximo;
    } else {
        ponerAsterisco= (int)minimo;
      }
    for (i=0; i<100;i++) {
      if (num[i] == ponerAsterisco) {
        System.out.print(" *" + num[i] + "* ");
      } else {
        System.out.print(num[i] + " ");
      }
      
    }
  }
}
