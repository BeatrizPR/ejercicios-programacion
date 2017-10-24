/**Ejercicio 16
  
  Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
  nos está siendo infiel. El programa irá haciendo preguntas que el usuario
  contestará con verdadero o falso. Cada pregunta contestada como verdadero
  sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utiliza
  el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
  del programa.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
 public class Ej16 {
  public static void main(String[] args) {
    System.out.println("Test de Infidelidad. Responde verdadero o falso con v o f.");
    
    
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
    String respuesta1 = System.console().readLine().toLowerCase();
    int contador = 0;
      if (respuesta1.equals("v")) {
      contador = contador + 3;
      } 
    System.out.print("2. Ha aumentado sus gastos de vestuario ");
    String respuesta2 = System.console().readLine().toLowerCase();
      if (respuesta2.equals("v")) {
      contador =contador + 3;
      } 
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti ");
    String respuesta3 = System.console().readLine().toLowerCase();
      if (respuesta3.equals("v")) {
      contador =contador + 3;
      } 
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) ");
    System.out.print( "o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) ");
    String respuesta4 = System.console().readLine().toLowerCase();
      if (respuesta4.equals("v")) {
      contador = contador +3;
      } 
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil ");
    String respuesta5 = System.console().readLine().toLowerCase();
      if (respuesta5.equals("v")) {
      contador = contador +3;
      } 
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
    String respuesta6 = System.console().readLine().toLowerCase();
      if (respuesta6.equals("v")) {
      contador = contador +3;
      } 
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a ");
    String respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("v")) {
      contador = contador +3;
      } 
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo ");
    String respuesta8 = System.console().readLine().toLowerCase();
      if (respuesta8.equals("v")) {
      contador = contador +3;
      } 
    System.out.print("9. Has notado que últimamente se perfuma más ");
    String respuesta9 = System.console().readLine().toLowerCase();
      if (respuesta9.equals("v")) {
      contador = contador +3;
      } 
      System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
      String respuesta10 = System.console().readLine().toLowerCase();
      if (respuesta10.equals("v")) {
        
      contador = contador+3;
      } 
    
    
    System.out.println("Esta es tu puntuación: " + contador );
     /** creo la variable fuera de los if */
    
    if ( (contador <=10 )); {
      System.out.println("Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel. ");
    } 
    if ( (contador >=11) && (contador<=22)); {
      System.out.println("Puntuación entre 11 y 22:Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } 
    if ( (contador >=22) && (contador<=30)); {
      System.out.println(" Puntuación entre 22 y 30 Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    } 
  }
}
