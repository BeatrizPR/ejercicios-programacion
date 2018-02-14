/*
 * Clase Ave
 */

/**
 *
 * @author Beatriz Parejo Ramos
 */

public class Ave extends Animal{
  
public Ave (){
  
}
 public Ave (String sexo){
   super (sexo);
 }
  
 
  public void ponHuevo() {
    if (this.getSexo().equals("macho")) {
      System.out.println("Soy macho, no puedo poner huevos");
    } else {
      System.out.println("Ahi va eso... un huevo");
    }
  }
  
  
  public void vuela() {
    System.out.println("Estoy volando");
  }


}
