
package com.mycompany.proyectojavabancoxile;

import java.util.Scanner;

public class ProyectoJavaBancoXile {

    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
        String usuario = "maximoelputodios@gmail.com";
        String user = "";
        int clave = 1234;
        int password;
        int contador = 0;
        int opc = 0;
        int claveAnt = 0;
        int claveNue = 0;
        int saldo = 1000000;
        int giro = 0;
        int respuesta;
        
        do {
                System.out.println("<====BIENVENIDO AL BANCO DE XILE====>\n"
                        + "<===LOGIN===>\n"
                        + "<===========>");
                do {
                System.out.println("INGRESE EL USUARIO");
                user = input.next();
                    if (user.equals(usuario)) {
                        System.out.println("USUARIO INGRESADO CORRECTAMENTE");
                        contador = 3;
                    } else {
                        System.out.println("USUARIO INCORRECTO " + (contador + 1) + " INTENTO FALLIDO");
                        contador++;
                        if (contador == 3) {
                            System.out.println("CUENTA BLOQUEADA POR SEGURIDAD, CONTACTESE CON SU BANCO MÁS CERCANO");
                            break;
                        }
                    }
                    
                } while (contador != 3);
                contador = 0;
                
                do {
                 System.out.println("INGRESE  SU CONTRASEÑA");
                        password = input.nextInt();
                    if (password == clave) {
                        
                        System.out.println("CLAVE INGRESADA CORRECTAMENTE");
                        contador = 3;
                    } else {
                        System.out.println("CLAVE INCORRECTA " + (contador + 1) + " INTENTO FALLIDO");
                        contador++;
                        if (contador == 3) {
                            System.out.println("CUENTA BLOQUEADA POR SEGURIDAD, CONTACTESE CON SU BANCO MÁS CERCANO");
                            break;
                            
                        }
                    }
                 } while (contador !=3);
                contador = 0;
        } while (contador == 3);
                
        do {   
            System.out.println("BIENVENIDO AL SISTEMA DEL BANCO XILE\n"
            + "SELECCIONE LA OPCIÓN QUE DESEE\n"
            + "<============================>\n"
            + "1. CAMBIAR CLAVE\n"
            + "2. GIRAR DINERO\n"
            + "3. CONSULTAR SALDO\n"
            + "4. DEPOSITAR DINERO\n"
            + "5. SALIR");
            System.out.println("INGRESE UNA OPCIÓN");
            opc = input.nextInt();
            switch (opc) {
            case 1:
                System.out.println("<===CAMBIAR CLAVE===>");
                do {
                    System.out.println("INGRESE SU CLAVE ANTIGUA");
                    claveAnt = input.nextInt();
                    if (claveAnt == clave) {
                        System.out.println("CLAVE ANTIGUA ACEPTADA");
                        do {
                            System.out.println("INGRESE SU NUEVA CONTRASEÑA");
                            claveNue = input.nextInt();
                            claveNue = clave;
                            if (claveNue == clave) {
                                System.out.println("EL CAMBIO DE CONTRASEÑA HA SIDO EXITOSO");
                                contador = 3;
                                
                            } else {
                                System.out.println("ERROR");
                            }
                            
                        } while (claveNue != clave);
                    
                    } else {
                        System.out.println("CLAVE ANTIGUA INCORRECTA " + (contador + 1) + " INTENTO FALLIDO");
                        contador++;
                        if (contador == 3) {
                            System.out.println("CUENTA BLOQUEADA POR SEGURIDAD, CONTACTESE CON SU BANCO MÁS CERCANO");
                            break;
                    }
                    }
                } while (contador != 3);
                contador = 0;
                
                
                break;
            case 2:
                contador = 0;
                respuesta = 0;
                do {
                    System.out.println("GIRO DE DINERO\n"
                        + "SU SALDO ES " + saldo + " $");
                System.out.println("INGRESE LA CANTIDAD QUE DESEE GIRAR\n"
                        + "<====================>");
                giro = input.nextInt();
                System.out.println("USTED HA GIRADO " + giro + " $");
                saldo = saldo - giro;
                System.out.println("SU NUEVO SALDO ES " + saldo);
                    System.out.println("<====================>\n"
                            + "¿DESEA REALIZAR UN NUEVO GIRO DE DINERO?\n"
                            + "1. SI\n"
                            + "2. NO");
                    respuesta = input.nextInt();
                    if (respuesta != 1 && respuesta != 2) {
                        System.out.println("LA OPCIÓN INGRESADA NO ES VÁLIDA");
                    }
                        
                } while (respuesta != 2);
                contador = 0;
                
                
                
                
                
                
                
                
                
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            default:
                throw new AssertionError();
            
            
        }
        
        }while (opc == 5);  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
