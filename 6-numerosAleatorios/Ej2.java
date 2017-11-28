/**Ejercicio 2.
 * 
 *  Realiza un programa que muestre al azar el nombre de una carta de la
    baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
    diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
    cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
    sería el 1). (No usar esto:Para convertir un número en una cadena de caracteres podemos
    usar String.valueOf(n)).
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/

public class Ej2 {
    
  public static void main(String[] args) {

    System.out.println("Programa que imprime una carta al azar");
    
    
    
    for (int i=2; i<=2; i++){
      int carta=(int)(Math.random()*13)+1;
      //For con los números
      String nCarta=" ";
      switch(carta) {
          case 1:
            nCarta = "A" ;
            break;
          case 2:
            nCarta = "2";
            break;
          case 3:
            nCarta = "Q";
            break;
          case 4:
            nCarta = "K";
            break;
          case 5:
            nCarta = "A" ;
            break;
          case 6:
            nCarta = "J";
            break;
          case 7:
            nCarta = "Q";
            break;
          case 8:
            nCarta = "K";
            break;
          case 9:
            nCarta = "A" ;
            break;
          case 10:
            nCarta = "J";
            break;
          case 11:
            nCarta = "Q";
            break;
          case 12:
            nCarta = "K";
            break;
          case 13:
            nCarta = "K";
            break;
          }
          System.out.print("Carta: " + nCarta);
    }
          
    
    for (int i=1; i<=1; i++){
      int carta=(int)(Math.random()* 4) +1;
      //For con los palos
      
      String palo=" ";
      switch(carta) {
          case 1:
            palo = "Corazones" ;
            break;
          case 2:
            palo = "Diamantes";
            break;
          case 3:
            palo = "Picas";
            break;
          case 4:
            palo = "Treboles";
            break;
      }
         System.out.println(" de "+ palo);
    }
    
    
   
    System.out.println( " ");
  }
}
