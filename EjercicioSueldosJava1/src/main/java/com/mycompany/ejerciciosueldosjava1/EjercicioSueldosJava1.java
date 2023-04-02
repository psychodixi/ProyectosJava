
package com.mycompany.ejerciciosueldosjava1;

import java.util.Scanner;


public class EjercicioSueldosJava1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nombreTra[];
        int edadTra[];
        float suelTra[];
        float aux;
        nombreTra = new String[5];
        edadTra = new int[5];
        suelTra = new float[5];
        int a = 0;
  
        
        for (int i = 0; i < 5; i++) {
            System.out.println("INGRESE EL NOMBRE DEL TRABAJADOR " + (i + 1));
            nombreTra[i] = input.next();
            
            do { 
                System.out.println("INGRESE LA EDAD DEL TRABAJADOR " + (i + 1));
                edadTra[i] = input.nextInt();
                a = 1;
                if (edadTra[i] >= 18) {
                    
                    if (edadTra[i] <= 65) {
                        
                       a = 0;
                        
                    } else {
                        System.out.println("LA EDAD INGRESADA ES INVÁLIDA");  
                    }
                    
                } else {
                    System.out.println("LA EDAD INGRESADA ES INVÁLIDA");
                }
                    
                
            } while (a == 1);
            
            do {
                System.out.println("INGRESE EL SUELDO DEL TRABAJADOR");
                suelTra[i] = input.nextFloat();
                
                if (suelTra[i] < 400000) {
                    System.out.println("EL SUELDO INGRESADO NO ES VÁLIDO");
                    
                }
                    
                
                
            } while (suelTra[i] < 400000);
        }
        
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (suelTra[k] > suelTra[k+1]) {
                    aux = suelTra[k];
                    suelTra[k] = suelTra[k+1];
                    suelTra[k+1] = aux; 
                    
                }
                
            }
            
        }
        System.out.println("SUELDOS ORDENADOR MAYOR A MENOR");
        for (int i = 0; i < 5; i++) {
            System.out.println(suelTra[i] + "-");
            
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
