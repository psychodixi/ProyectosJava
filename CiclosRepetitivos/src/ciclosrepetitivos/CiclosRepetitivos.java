
package ciclosrepetitivos;

import java.util.Scanner;


public class CiclosRepetitivos {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int tabla;
        int opc;
        
        System.out.println("""
                           INGRESE EL VALOR DE LA TABLA
                           <===================>
                           """);
                tabla = input.nextInt();
        
        do {
        System.out.println("""
                           <===================>
                           CICLOS REPETITIVOS
                           <===================>
                           1. FOR
                           2. WHILE
                           3. DO
                           4. SALIR
                           <===================>
                           INGRESE LA OPCIÓN
                           """);
                opc = input.nextInt();
                
        
            switch (opc) {
                case 1 -> {
                    System.out.println("USTED HA SELECCIONADO LA TABLA " + tabla);
                    for (int i = 1; i < 11; i++) {
                        System.out.println(tabla + " * " + i + " = " + tabla * i);
                        
                        
                    }
                }
                    
                case 2 -> {
                    int j = 1;
                    System.out.println("USTED HA SELECCIONADO LA TABLA " + tabla);
                    while (j <= 10) {
                        System.out.println(tabla + " * " + j + " = " + tabla * j);
                        j++; 
                    }
                }
                    
                case 3 -> {
                    int k = 1;
                    System.out.println("USTED HA SELECCIONADO LA TABLA " + tabla);
                    do {
                        System.out.println(tabla + " * " + k + " = " + tabla * k);
                        k++;
                    } while (k <= 10);
                }
                    
                case 4 -> {
                    System.out.println("USTED HA SELECCIONADO SALIR");
                    opc = 4;
                }
                    
                default -> {
                    System.out.println("LA OPCIÓN INGRESADA ES INVÁLIDA");
                    
                }
                    
            }
        } while (opc != 4);
        
         
        
        
        
        
        
        
        
        
    }
     
}
