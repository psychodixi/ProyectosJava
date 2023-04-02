
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
        } while (opc < 1 || opc > 5);
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
                int giroDinero = 0;
                int veinteMil = 0;
                int diezMil = 0;
                int cincoMil = 0;
                int dosMil = 0;
                int unMil = 0;
                int saldoInicial = 0;
                int saldoFinal = 0;
                contador = 1;
                do {
                    System.out.println("GIRO DE DINERO\n"
                            + "<=================>\n"
                            + "INGRESE EL MONTO QUE DESEE GIRAR\n"
                            + "- EL GIRO MÍNIMO ES DE 1.000$\n"
                            + "- EL GIRO MÁXIMO ES DE 200.000$\n");
                giroDinero = input.nextInt();
                saldoInicial = giroDinero;
                
                } while ((giroDinero < 1000 || giroDinero > 200000));
                
                    if (giroDinero >=  20000) {
                        veinteMil = giroDinero / 20000;
                        giroDinero = giroDinero - (veinteMil * 20000);
                    
                }
                
                    if (giroDinero >= 10000) {
                        diezMil = giroDinero / 10000;
                        giroDinero = giroDinero - (diezMil * 10000);
                    
                }
                    
                    if (giroDinero >= 5000) {
                        cincoMil = giroDinero / 5000;
                        giroDinero = giroDinero - (cincoMil * 5000);
                    
                }
                    if (giroDinero >= 2000) {
                        dosMil = giroDinero / 2000;
                        giroDinero = giroDinero - (dosMil * 5000);
                
                    }
                    
                    if (giroDinero >= 1000) {
                        unMil = giroDinero / 1000;
                        giroDinero = giroDinero - (unMil * 1000);
                        if (giroDinero != 0) {
                            saldoFinal = saldoInicial - giroDinero;
                            System.out.println("EL MÁXIMO DINERO A ENTREGAR ES DE: " + saldoFinal);
                            
                        }
                }
                    
                    System.out.println("LA CANDITAD DE BILLETES DE 20000 ES: " + veinteMil + "\n"
                            + "LA CANTIDAD DE BILLETES DE 10000 ES: " + diezMil + "\n"
                                    + "LA CANTIDAD DE BILLETES DE 5000 ES: " + cincoMil + "\n"
                                            + "LA CANTIDAD DE BILLETES DE 2000 ES: " + dosMil + "\n"
                                                    + "LA CANTIDAD DE BILLETES DE 1000 ES: " + unMil + "\n"
                                                            + "EL RESTO QUE QUEDA ES: " + giroDinero + "\n"
                                                                    + "EL TOTAL DEL GIRO ES DE: " + saldoFinal);
                    
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
