/**
 * Ejercicio 3, palabras en inglés y español. Para que alinee las palabras 
 * a la izquierda incluyo en %14s un menos delante, seria %-14s.
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("  Inglés        	  Español");
    System.out.println("-----------------------------------------");
    System.out.printf("%-14s      %14s\n", "painting", "pintura");
    System.out.printf("%-14s      %14s\n", "sculpture", "escultura");
    System.out.printf("%-14s      %14s\n", "architecture", "arquitectura");
    System.out.printf("%-14s      %14s\n", "scketch", "boceto");
    System.out.printf("%-14s      %14s\n", "film", "película");
    System.out.printf("%-14s      %14s\n", "music", "música");
    System.out.printf("%-14s      %14s\n", "comic", "cómic");
    System.out.printf("%-14s      %14s\n", "picture", "cuadro");
    System.out.printf("%-14s      %14s\n", "galery", "galería");
    System.out.printf("%-14s      %14s\n", "museum", "museo");
  }
}
