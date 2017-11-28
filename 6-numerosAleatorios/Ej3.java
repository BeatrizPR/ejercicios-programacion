/**Ejercicio 3.
 * 
 *  Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
    de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/

public class Ej3 {
    
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
            nCarta = "3";
            break;
          case 4:
            nCarta = "4";
            break;
          case 5:
            nCarta = "5" ;
            break;
          case 6:
            nCarta = "6";
            break;
          case 7:
            nCarta = "7";
            break;
          case 8:
            nCarta = "8";
            break;
          case 9:
            nCarta = "9" ;
            break;
          case 10:
            nCarta = "Sota";
            break;
          case 11:
            nCarta = "Caballo";
            break;
          case 12:
            nCarta = "Rey";
            break;
          default:
          }
          System.out.print("Carta: " + nCarta);
    }
          
    
    for (int i=1; i<=1; i++){
      int carta=(int)(Math.random()* 4)+1;
      //For con los palos
      
      String palo=" ";
      switch(carta) {
          case 1:
            palo = "Oros" ;
            break;
          case 2:
            palo = "Copas";
            break;
          case 3:
            palo = "Bastos";
            break;
          case 4:
            palo = "Espadas";
            break;
      }
         System.out.println(" de "+ palo);
    }
    
    
   
    System.out.println( " ");
  }
}
