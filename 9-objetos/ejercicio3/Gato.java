/*
 * Clase gato
 */

/**
 *
 * @author Bea
 */
public class Gato extends Mamifero {
  
  
  
//constructor
 

  //getter y setter
 
  
  //métodos
  
  public void come(String comida) {
    if (comida.equals("pescado")) {
      //super()
      //super.come()
      System.out.println("Hmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  public void maulla() {
    System.out.println("miau, miau");
  }

  public void ronronea() {
    System.out.println("rrrrrrrr");
  }
  
  public void caza() {
    System.out.println("¿Quieres un ratón? Tengo unos cuantos");
  }

  
}
