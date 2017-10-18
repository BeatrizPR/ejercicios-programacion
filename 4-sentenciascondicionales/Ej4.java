/**Ejercicio 4
  Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
  las horas extras. Escribe un programa que calcule el salario semanal de un
  trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
  trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
  euros la hora.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej4 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce el número total de horas trabajadas (horas sin minutos): ");
    int horaTrab = Integer.parseInt( System.console().readLine() );
    if (horaTrab <= 40) {
      int totalSalario = horaTrab * 12;
      System.out.printf( "El salario es " + totalSalario + "€");
    }   
  
    if (horaTrab >= 41) {
      int horasExtra = (horaTrab - 40) * 16;
      int horasOrdi = 40 * 12;
      int totalSalario = horasExtra + horasOrdi;
      System.out.printf( "El salario es " + totalSalario + "€");
    }

  }
}
