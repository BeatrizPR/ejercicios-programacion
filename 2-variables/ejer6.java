/**
 * Ejercicio 6. Total de una factura
 *
 * @author Beatriz 
 */

public class ejer6 {
  public static void main(String[] args) {

    double libro = 30;
    double pegatinas = 1.50;
    double cd =12.30;
    double dvd =24.20;
    
    double totalSIva = (libro + pegatinas + cd + dvd);
    double totalIva = ((totalSIva * 121) /100);
    
    System.out.printf( "El libro vale %16.2f€\n", libro);
    System.out.printf( "Las pegatinas valen %10.2f€\n", pegatinas);
    System.out.printf( "El cd vale %19.2f€\n", cd);
    /**Podemos hacerlo de las dos formas con la de arriva aparece formateado y en columna y abajo no*/
    System.out.println( "El dvd vale " + dvd + "€\n");
    System.out.println( "El total es " + (int) totalSIva + "€");
    System.out.println( "Total + IVA es " +  totalIva + "€");

  }
}

