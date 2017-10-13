/**
 *Ejercicio 12. Calcular la nota que hace falta sacar en el segundo 
 *examen para obtener la media deseada. Hay que tener en cuenta 
 *que la nota del primer examen cuenta el 40% y la del 
 *segundo examen un 60%.
 * 
 *
 * @author Beatriz 
 */

public class Ejer12 {
  public static void main(String[] args) {

    System.out.println("Calcula la nota que debes sacar en el segundo examen tener la media deseada ");
    System.out.print("Por favor, introduce la nota del primer examen: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la media que deseas tener: ");
    double media = Double.parseDouble(System.console().readLine());
  
    double resultado = media -(primeraNota * 0.40);
    double segundaNota = (resultado / 0.60);
    
    System.out.printf( "La nota que debes sacar en el segundo examen es "+ segundaNota);
    
  }
}

