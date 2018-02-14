/*
 * Clase mamifero
 */

/**
 *
 * @author Beatriz Parejo Ramos
 */
public class Mamifero extends Animal {

  public Mamifero() {
  }
  public Mamifero(String sexo){
    super(sexo);
  }
  
  
  
  public void amamanta(Perro perrito) {
    if (this.sexo.equals("macho")) {
      System.out.println("No amamanto, busca a la madre");
    } else {
      System.out.println("Toma pecho");
    }
  }

  

  
}
