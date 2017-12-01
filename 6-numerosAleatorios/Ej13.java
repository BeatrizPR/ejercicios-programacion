/**Ejercicio 13.
 * 
 *  Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/

public class Ej13 {
    
  public static void main(String[] args) {

    System.out.println("Genera al azar tirada de 2 dados:");
    
    int dado1=0;
    int dado2=0;
    do {
      dado1=(int)(Math.random()* 6) +1;
      dado2=(int)(Math.random()* 6) +1;
      int dado=(int)(Math.random()* 6) +1;
      
      String dadoFigura= " ";
      switch (dado){
        case 1:
          dadoFigura = "⚀";
          break;
        case 2:
          dadoFigura =" 2";  /**Da error con el dado 2 - buscar en unicode*/
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
      } //termina el switch
    System.out.println("Dado 1" +  ": " + dadoFigura );
    System.out.println("Dado 2" +  ": " + dadoFigura);
    } while (dado1!=dado2);

    System.out.println();
  }
}
