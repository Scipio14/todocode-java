
package vectores;

import java.util.Scanner;


public class Vectores {

    public static void main(String[] args) {
        //Declaracion
        int vector [] = new int [4];
        
        //Asignacion (teclado)
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++){
        System.out.println("Ingrese el valor para el indice " +i);
        vector[i] = teclado.nextInt();
        }
      
        
        //Recorrido
        for (int i = 0; i < vector.length; i++){
        System.out.println("Estoy en el indice: " + i);
        System.out.println("Tengo guardado un  " + vector[i]);
        System.out.println("---------------------------------");
        }
        
    }
    
}
