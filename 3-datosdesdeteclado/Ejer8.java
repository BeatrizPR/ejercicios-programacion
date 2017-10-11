/**
 * Ejercicio 8. Calcular el salario semanal de un empleado en base 
 * a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Beatriz 
 */

public class Ejer8 {
  public static void main(String[] args) {

    System.out.println("Calcula el salario, ganado 12€/hora ");
    System.out.print("Por favor, introduce el número total de horas trabajadas: ");
    double horaTrab = Double.parseDouble(System.console().readLine());
    
    double totalSalario = horaTrab * 12;
    
    System.out.printf( "El salario es " + totalSalario + "€");

  }
}

