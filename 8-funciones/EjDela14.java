/**Ejercicio 1 al 14.
* 
*  Este es el main de todas las funciones que he creado del ejercicio 1 al 14.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;
import matematicas.Varias;

public class EjDela14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Este programa contiene distintas funciones ");
    System.out.println(" ");
    
    /************* Ejercicio 1- es capicua *************/
    System.out.println("Introduce un número para saber si es capicua. ");
    int numero =Integer.parseInt(s.next());
    if (matematicas.Varias.esCapicua(numero)){
      System.out.println("El número es capicua ");
    } else {
      System.out.println(" El número no es capicua");
      }
    
    
    /**********Ejercicio 2- es pimo **********/
    
    System.out.println("Introduce un número para saber si es primo. ");
    numero =Integer.parseInt( s.next() );
    if (matematicas.Varias.esPrimo(numero)){
      System.out.println("El número "+ numero +" es primo ");
    } else {
      System.out.println("El número "+ numero +" no es primo ");
      }
      
      
     /**********Ejercicio 3- siguiente primo pimo **********/
     
    /**System.out.println("Introduce un número para saber el siguiente primo. ");
    numero =Integer.parseInt( s.next() );
    if (matematicas.Varias.esPrimo(numero)){
      System.out.println("El número"+ numero +" es primo ");
    } else {
      System.out.println("El número"+ numero +" no es primo ");
      }**/
      
     
    /**********Ejercicio 4- Potencia **********/
    
    System.out.println("Introduce una base: ");
    int base =Integer.parseInt( s.next() );
    System.out.println("Introduce un exponente: ");
    int exponente =Integer.parseInt( s.next() );
      System.out.println("La potencia es "+ matematicas.Varias.potencia(base, exponente));
    
    
    /********* Ejercicio 5 -Digitos ***************/
    
    System.out.print("Por favor, introduzca un número para indicar cuantos digitos tiene  ");
    numero =Integer.parseInt( s.next() );
    System.out.println("El número "+numero+ " tiene "+ matematicas.Varias.sacarDigito(numero)+ " digitos");
    
    
     /********* Ejercicio 6 -Voltea ***************/
    
    System.out.print("Por favor, introduzca un número para darle la vuelta  ");
    numero =Integer.parseInt( s.next() );
    System.out.println("El número "+numero+ " al revés es "+ matematicas.Varias.voltea(numero));
    
    
    /*********** Ejercicio 7 - Digito N *************/
    
    System.out.print("Por favor, introduzca un número para dar la posición de un digito: ");
    numero =Integer.parseInt( s.next() );
    System.out.print("Por favor, introduzca una posición empezando por 0: ");
    int n =Integer.parseInt( s.next() );
    System.out.println("El la posición "+ n + " se encuentra en el dígito "+ matematicas.Varias.digitoNum(numero, n));
    
    
     /********* Ejercicio 8 -Posición de dígito ***************/
    
    System.out.print("Por favor, introduzca un número  para decirte si el digito se encuentra en el número: ");
    numero =Integer.parseInt( s.next() );
    System.out.print("Por favor, introduzca un digito:  ");
    int digito =Integer.parseInt( s.next() );
    int ocurrencia = matematicas.Varias.posicionDigito(numero, digito);
    if (ocurrencia==(-1)){
      System.out.println("El digito introducido no se encuentra en el número");
    } else {
    System.out.println("El digito "+digito+ " se encuentra en la posición  "+ ocurrencia);
      }
      
      
     /********* Ejercicio 9 -Quita por detrás los digitos que se pongan ***************/
    
    System.out.print("Por favor, introduzca un número para quitar por detrás dígitos ");
    numero =Integer.parseInt( s.next() );
    System.out.print("Por favor, introduzca un digito para quitar esos numeros por la derecha  ");
    digito =Integer.parseInt( s.next() );
    int quitoNum = matematicas.Varias.quitaPorDetras(numero, digito);
    if (digito==1){
      System.out.println("Al quitar " + digito+ " tenemos el siguiente número: " +quitoNum);
    } else {
    System.out.println("Al quitar "+digito+ " digitos se encuentra el número "+ quitoNum);
      }
      
      
    /********* Ejercicio 10 -Quita por delante los digitos que se pongan ***************/
    
    System.out.print("Por favor, introduzca un número para quitar dígitos por delante  ");
    numero =Integer.parseInt( s.next() );
    System.out.print("Por favor, introduzca un digito para quitar esos numeros por la izquierda  ");
    digito =Integer.parseInt( s.next() );
    quitoNum = matematicas.Varias.quitaPorDelante(numero, digito);
    if (digito==1){
      System.out.println("Al quitar " + digito+ " tenemos el siguiente número: " +quitoNum);
    } else {
    System.out.println("Al quitar "+digito+ " digitos se encuentra el número "+ quitoNum);
      }
    
    
    /********* Ejercicio 11 -Añade digito a un número por detrás ***************/
    
    System.out.print("Por favor, introduzca un número para añadir detrás un digito  ");
    numero =Integer.parseInt( s.next() );
    System.out.print("Por favor, introduzca un digito  ");
    digito =Integer.parseInt( s.next() );
    
    System.out.println("Al añadir el digito por detrás al número tenemos:  "+ matematicas.Varias.pegaPorDetras(numero, digito));
      
      
      /********* Ejercicio 11 -Añade digito a un número por detrás ***************/
    
    System.out.print("Por favor, introduzca un número para añadir delante un digito  ");
    numero =Integer.parseInt( s.next() );
    System.out.print("Por favor, introduzca un digito  ");
    digito =Integer.parseInt( s.next() );
    
    System.out.println("Al añadir el digito por delante al número tenemos:  "+ matematicas.Varias.pegaPorDetras(numero, digito));
      
    
   /** for (i = 0; i < 10; i++) {
      System.out.printf(" |%7d ", i);
    }
    System.out.println();
    System.out.println();
    System.out.println("Introducido por teclado:");
    System.out.println();
    System.out.print("Array  ");
    */
    


  }  // cierra el public static
} // cierra el public class
