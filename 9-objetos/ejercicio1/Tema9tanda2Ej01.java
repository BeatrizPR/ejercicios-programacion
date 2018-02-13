/*
 * Ejercicio 1
Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
instancias y aplicándole algunos métodos.
 */
package tema9tanda2ej01;

/**
 *
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Tema9tanda2Ej01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Caballo rocinante = new Caballo("Rocinante");

    Persona pepe = new Persona("Pepe", "Pérez");

    rocinante.setRaza("flaco");
    rocinante.setColor("blanco");
    rocinante.setJinete(pepe);

    System.out.println(pepe);

    pepe.espolea("cariñosa");

    System.out.println(rocinante);

  }

}
