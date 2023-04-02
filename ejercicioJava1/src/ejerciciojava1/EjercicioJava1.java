
package ejerciciojava1;

import java.util.Scanner;

class EjercicioJava1 {
    //ingresar nombre, edad, sueldo de 5 trabajadores, luego mostrar el sueldo mas alto y mas bajo
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       String nombreTra[];
       int edadTra[];
       float suelTra[];
       nombreTra = new String[5];
       edadTra = new int[5];
       suelTra = new float[5];
               
       for (int i = 0; i < 5; i++) {
           int a = 1;
           System.out.println("Ingrese el nombre del trabajador " + (i+1));
           nombreTra[i] = input.nextLine();
           
           do {
               System.out.println("Ingrese la edad del trabajador " + (i+1));
               edadTra[i] = input.nextInt();
               if (edadTra[i] >= 18) {
                   
                   if (edadTra[i] <= 65 ) {
                       
                       a = 0;
                       
                   } else {
                       System.out.println("LA EDAD INGRESADA NO ES VÁLIDA");
                   }
                   
               } else {
                   System.out.println("LA EDAD INGRESADA NO ES VÁLIDA");
               
                   
                   
                   
               }
           } while (a == 1);
           
           
           do {
               System.out.println("Ingrese el sueldo del trabajador " + (i+1));
               suelTra[i] = input.nextFloat();
               if (suelTra[i] < 400000) {
                   System.out.println("EL SUELDO INGRESADO NO ES VÁLIDO");
                   
               }
           } while (suelTra[i] < 400000);
           
           }  
         System.out.println("Mostrar sueldos: ");
            for (int j = 0; j < 5; j++) {
            System.out.println(suelTra[j]);   
        }
       
           
       
       
           
        }
    
        
            
            
            
    
    
    
    
    
}
