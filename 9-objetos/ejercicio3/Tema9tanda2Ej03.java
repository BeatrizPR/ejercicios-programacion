/*
 * Ejercicio 3
Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefine el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.
 */

/**
 *
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;
public class Tema9tanda2Ej03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pescado = "pescado";
        
        Perro goofie = new Perro("macho");
        Perro blanquita= new Perro("hembra");
        Gato aristoteles = new Gato();
        Canario piolin = new Canario();
        Lagarto pancho = new Lagarto("macho");
        Pinguino pio = new Pinguino();
        
        System.out.println("¿Quieres darle de comer al perro?");
        goofie.come();
        System.out.println("Saluda al perro. Dile que amamante a la cria");
        goofie.amamanta(blanquita);
        
        System.out.println("Saluda al gato");
        aristoteles.ronronea();
        System.out.println("¿Sales a cazar?");
        aristoteles.caza();
        aristoteles.maulla();
        System.out.println("¿Quieres comer?");
        aristoteles.come(pescado);
        
        System.out.println("¿Quieres comer?");
        piolin.come();
        System.out.println("¿Sabes volar?");
        piolin.vuela();
        System.out.println("Vete a dormir");
        piolin.duerme();
        
        
        System.out.println("¿Pones huevos?");
        pancho.ponHuevo();
        System.out.println("¿Te gusta tomar el sol?");
        pancho.tomaElSol();
        
        System.out.println("¿Vuelas?");
        pio.vuela();
        System.out.println("¿Quieres comer?");
        pio.come();
        System.out.println("¿Quieres nadar?");
        pio.nada();
        
        
    }

}
