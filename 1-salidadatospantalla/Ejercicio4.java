/**
 * Ejercicio 4, horario
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Lunes        	              Martes                Miércoles               Jueves              Viernes");
	System.out.println("-----------------------------------------------------------------------------------------------------------");
    System.out.printf("%-18s  %20s  %20s  %20s  %20s\n", "sistemas", "programación", "sistemas", "programación", "programación");
    System.out.printf("%-18s  %20s  %20s  %20s  %20s\n", "sistemas", "programación", "sistemas", "programación", "programación");
    System.out.printf("%-18s  %20s  %20s  %20s  %20s\n", "sistemas", "programación", "sistemas", "programación", "E. de desarrollo\n");
    System.out.printf("                                        %20s            \n\n",                                "RECREO"                                      );
    System.out.printf("%-18s  %20s  %20s  %20s  %20s\n", "FOL", "base de datos", "E. de desarrollo", "base de datos", "L. de marcas");
    System.out.printf("%-18s  %20s  %20s  %20s  %20s\n", "FOL", "base de datos", "E. de desarrollo", "base de datos", "L. de marcas");
    System.out.printf("%-18s  %20s  %20s  %20s  %20s\n", "FOL", "base de datos", "L. de marcas", "base de datos", "L. de marcas");
  }
}
