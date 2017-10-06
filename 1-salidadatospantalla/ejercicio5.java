/**
 * Ejercicio 5, horario con colores
 */

public class ejercicio5 {
  public static void main(String[] args) {
    
    String sys = "\033[31m";
    String prog = "\033[32m";
    String bdd = "\033[33m";
    String ed = "\033[34m";
    String lm = "\033[35m";
    String fol = "\033[36m";
    String recreo ="\033[37m";
    
    System.out.println("Lunes        	      Martes            Miércoles           Jueves            Viernes");
    System.out.println("-----------------------------------------------------------------------------------------------------------");
    System.out.printf("%-18s  %20s    %20s    %20s    %20s\n", sys+"sistemas",    prog+"programación",      sys+"sistemas",     prog+"programación",      prog+"programación");
    System.out.printf("%-18s  %20s    %20s    %20s    %20s\n", sys+"sistemas",    prog+"programación",      sys+"sistemas",     prog+"programación",      prog+"programación");
    System.out.printf("%-18s  %20s    %20s    %20s    %20s\n", sys+"sistemas",    prog+"programación",      sys+"sistemas",     prog+"programación",      ed+"E. de desarrollo\n");
    System.out.printf("                                           %20s            \n\n",                                recreo+"RECREO"                                      );
    System.out.printf("%-18s  %20s    %20s    %20s    %20s\n", fol+"FOL",     bdd+"base de datos",    ed+"E. de desarrollo",    bdd+"base de datos",      lm+"L. de marcas");
    System.out.printf("%-18s  %20s    %20s    %20s    %20s\n", fol+"FOL",     bdd+"base de datos",    ed+"E. de desarrollo",    bdd+"base de datos",      lm+"L. de marcas");
    System.out.printf("%-18s  %20s    %20s    %20s    %20s\n", fol+"FOL",     bdd+"base de datos",    lm+"L. de marcas",          bdd+"base de datos",      lm+"L. de marcas"+recreo);
  }
}
