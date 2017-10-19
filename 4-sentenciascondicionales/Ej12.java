/**Ejercicio 12
  
  Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
  que se imparten en el curso. Cada pregunta acertada sumará un punto. El
  programa mostrará al final la calificación obtenida. Pásale el minicuestionario
  a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
  en las diferentes asignaturas del curso.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej12 {
  public static void main(String[] args) {
    System.out.println("Responde si o no.");
    System.out.print("1. Base de datos ¿Una entidad se puede relacionar consigo misma? ");
    String respuesta1 = System.console().readLine().toLowerCase();
    int puntuacion = 0;

    if (respuesta1.equals("si")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("2. Base de datos ¿Un registro lógico y un registro físico es lo mismo? ");
    String respuesta2 = System.console().readLine().toLowerCase();
  
    if (respuesta2.equals("no")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("3. E. de desarrollo ¿Un interprete y un compilador son traductores? ");
    String respuesta3 = System.console().readLine().toLowerCase();
  
    if (respuesta3.equals("si")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("4. E. de desarrollo ¿Una aplicación se compone de uno o más programas? ");
    String respuesta4 = System.console().readLine().toLowerCase();
  
    if (respuesta4.equals("si")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("5. E. de desarrollo ¿El lenguaje máquina es un lenguaje de alto nivel? ");
    String respuesta5 = System.console().readLine().toLowerCase();
    if (respuesta5.equals("no")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("6. ¿Programando con Java se crea un bytecode (.class)? ");
    String respuesta6 = System.console().readLine().toLowerCase();
  
    if (respuesta6.equals("si")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("7. Sistemas ¿En la codificación binaria, se codifica con 0s y 1s? ");
    String respuesta = System.console().readLine().toLowerCase();
  
    if (respuesta.equals("si")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("8. Sistemas ¿La codificación hexadecimal tiene 8 símbolos? ");
    String respuesta8 = System.console().readLine().toLowerCase();
  
    if (respuesta8.equals("no")) {
      System.out.println("¡La respuesta es correcta! La codificación hexadecimal se compone de 16 elementos.");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("9. L. de marcas ¿La etiqueta small hace pequeño el texto? ");
    String respuesta9 = System.console().readLine().toLowerCase();
  
    if (respuesta9.equals("si")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.print("10. L. de marcas ¿Hay etiquetas que son una sola y no de apertura y cierre? ");
    String respuesta10 = System.console().readLine().toLowerCase();
  
    if (respuesta10.equals("si")) {
      System.out.println("¡La respuesta es correcta! Un ejemplo de ello es la etiqueta <br/>");
      puntuacion++;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    System.out.println("Tu puntuación es de " + puntuacion + " puntos.");
  }
}
