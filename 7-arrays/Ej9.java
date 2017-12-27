/**Ejercicio 9.
 * 
 *  Realiza un programa que pida 8 números enteros y que luego muestre esos
    números junto con la palabra "par" o "impar" según proceda.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej9 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("El programa muestra si el número es par o impar ");
    System.out.println(" ");
    System.out.print("Por favor, introduzca cada número y pulse intro  ");
    
    int []num= new int [8]; //para guardar 8 numeros
    int par=0; 
    
    for (int i=0; i<num.length; i++) { //guardo los numeros introducidos
      num[i]= Integer.parseInt(s.nextLine());
    }
    
    for (int i=0; i<num.length; i++){
      if (num[i]%2==0){ //Compruebo si es par
        System.out.println(" "+ num[i]+" "+ " es par");
      } else {
        System.out.println(" "+ num[i] +" "+ "es impar");
        }
    }
    System.out.println(" ");
  }
}
