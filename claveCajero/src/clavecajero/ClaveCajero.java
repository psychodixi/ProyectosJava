package clavecajero;
//retiro dinero, saldo, imprimir transacciones, cambio de clave

import java.util.Scanner;

public class ClaveCajero {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int saldo = 1000000;
        int clave = 1234;
        System.out.println("BIENVENIDO AL BANCO DE CHILE/n"
                + "Ingrese su clave de 4 dígitos")
        int pass = input.nextInt();
        if (clave == pass) {
           System.out.println("BIENVENIDO/N"
                + "<==============================>"
                + "1. Retiro dinero"
                + "2. Consulta saldo"
                + "3. Imprimir transacciones"
                + "4. Cambio de clave"
                + "5. SALIR/n"
                + "<==============================>");
            System.out.println("ESCOGA UNA OPCIÓN"); 
        else    
        System.out.println("LA CLAVE QUE HA INGRESADO ES INCORRECTA");
        }
        
        
        
    
        
        opc = input.nextInt();
        switch (opc) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }
        
        
        
    }
    
    
    
    
}
