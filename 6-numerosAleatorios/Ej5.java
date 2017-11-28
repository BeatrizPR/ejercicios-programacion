/**Ejercicio 5.
 * 
 *  Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
    separados por espacios. Muestra también el máximo, el mínimo y la media
    de esos números.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/

public class Ej5 {
    
  public static void main(String[] args) {

    System.out.println("Programa que imprime 50 números aleatorios entre el 100 y el 199");
    int suma=0;
    int contador=0;
    int media=0;
    int numMax=1;
    long numMin=999999999;
    
    for (int i=1; i<=50; i++){
      int numero =(int)(Math.random()* 99)+101;
      System.out.print(numero + " ");
      suma+=numero;
      contador++;
      
      if (numero<numMin){ //sacamos el numero minimo
          numMin = numero;
      }
      if (numero > numMax){ //sacamos el numero maximo
          numMax=numero;
      }
    }
    media= suma/contador;
    System.out.println(" "); //Salto de linea para que no salga pegado
    System.out.println(" ");
    System.out.println("La media es "+ media);
    System.out.println("El número máximo es "+ numMax);
    System.out.println("El número mínimo es "+ numMin);
  }
}
