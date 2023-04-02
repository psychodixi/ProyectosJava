
package arreglosjavam;

import java.util.Scanner;

public class ArreglosJavaM {

    public static void main(String[] args) {
      
        // CRUD, acrònimo create reed update delete (crear, leer, actualizar y borrar)
        // arreglo bidimensional
        
        Scanner input = new Scanner(System.in); 
        String datos [][] = new String [5][3];
        float notas [][] = new float [5][4];
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre");
            datos [i][0] = input.next();
            
            System.out.println("Ingrese Apellido");
            datos[i][1] = input.next();
            
            System.out.println("Ingrese Curso");
            datos[i][2] = input.next();
            
            System.out.println("Ingrese Nota Lenguaje");
            notas[i][0] = input.nextFloat();
            
            System.out.println("Ingrese Nota Matemáticas");
            notas[i][1] = input.nextFloat();
            
            System.out.println("Ingrese Nota Ingles");
            notas[i][2] = input.nextFloat();
            
            System.out.println("Ingrese Nota Historia");
            notas[i][3] = input.nextFloat();
            
        }
        
        
         
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
