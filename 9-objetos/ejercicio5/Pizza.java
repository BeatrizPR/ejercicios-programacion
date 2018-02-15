/*
 * Clase Pizza
 */
package tema9tanda2ej05;

/**
 *
 * @author Beatriz Parejo Ramos
 */
public class Pizza {

  //atributos
  private String tipo;
  private String tamano;
  private String estado;
  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  //constructores
  public Pizza() {

  }

  public Pizza(String tamano, String tipo) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
  }

// getter and setter
  public String getTamano() {
    return tamano;
  }

  public void setTamaño(String tamano) {
    this.tamano = tamano;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static void setTotalPedidas(int totalPedidas) {
    Pizza.totalPedidas = totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static void setTotalServidas(int totalServidas) {
    Pizza.totalServidas = totalServidas;
  }

  //metodos
  public void sirve() {
    if (this.estado.equals("servida")) {
      System.out.println("Esa pizza ya se ha servido");
    } else {
      this.estado = "servida";
      Pizza.totalServidas += 1;
    }
  }

  public void pide() {
    Pizza.totalPedidas += 1;
  }

  @Override
  public String toString() {
    return "Pizza:" + tamano + ", " + tipo + ", " + estado;
  }

}
