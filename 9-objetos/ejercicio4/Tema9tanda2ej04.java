/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tema9tanda2ej04;

/**
 *
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;
public class Tema9tanda2ej04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Fraccion f1= new Fraccion(1,5);
        Fraccion f2=new Fraccion (3, 4);
        Fraccion f3=new Fraccion (30, 72);
        
        System.out.println("Si invertimos la fracción "+ f1+ " tenemos " + f1.invierte(1,5));
        System.out.println("Si multiplicamos la fracción "+ f1+ " x 5 tenemos " + f1.multiplica(f2));
        System.out.println("Si dividimos la fracción "+ f3 + " entre "+ f2+ " obtenemos " + f3.divide(f2));
        System.out.println("Vamos a simplificar la fracción " + f3 + " y tenemos "+ f3.simplifica());
        
        
        
        
        
        
        
    }

}
