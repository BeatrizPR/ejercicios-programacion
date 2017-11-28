/**Ejercicio 1.
 * 
 *  Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
    también la suma total (los puntos que suman entre los tres dados).
*   Generación de números aleatorios.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/

public class Ej1 {
    
  public static void main(String[] args) {

    System.out.println("Genera al azar tirada de 3 dados:");
    
    int suma=0;
    
    for (int i=1; i<=3; i++){
      int dado=(int)(Math.random()* 6) +1;
      
      String dadoFigura= " ";
      switch (dado){
        case 1:
          dadoFigura = "⚀";
          break;
        case 2:
          dadoFigura =" ";  /**Da error con el dado 2 - buscar en unicode*/
          break;
        case 3:
          dadoFigura ="⚂";
          break;
        case 4:
          dadoFigura ="⚃";
          break;
        case 5:
          dadoFigura ="⚄";
          break;
        case 6:
          dadoFigura ="⚅";
          break;
        default:
      }
    System.out.println("Dado " + i + ": " + dado);
    suma+=dado;
    
    }
    
    System.out.println(" ");
    System.out.println("Suma: " + suma);
  }
}
