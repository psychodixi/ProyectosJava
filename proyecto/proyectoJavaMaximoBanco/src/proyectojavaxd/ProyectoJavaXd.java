
package proyectojavaxd;

import java.util.Scanner;


public class ProyectoJavaXd {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String usuario = "maximoelputodios@gmail.com";
        String user = "";
        String clave = "1234";
        String password = "";
        int contador = 0;
        int opc;
        int claveAnt;
        int claveNue;
        int saldo = 1000000;
        int respuesta;
        int error = 0;
        int res = 0;
        boolean confirmar = false;
        
        do {
                System.out.println("<====BIENVENIDO AL BANCO DE XILE====>"
                         + "<====LOGIN====>");
                do {
                System.out.println("INGRESE EL USUARIO");
                user = input.next();
                    if (user.equals(usuario)) {
                       
                        System.out.println("USUARIO INGRESADO CORRECTAMENTE");
                        contador = 3;
                        res = 1;
                        confirmar = true;
                    } else {
                        System.out.println("USUARIO INCORRECTO " + (contador + 1) + " INTENTO FALLIDO");
                        contador++;
                        error++;
                    }
                    
                    if (error == 3) {
                        
                        System.out.println("<=================>");
                        System.out.println("INTENTO " + contador + " SU CUENTA HA SIDO BLOQUEADA\n"
                                + "<=============>\n"
                                + "CONTACTESE CON SU BANCO MÁS CERCANO\n"
                                + "GRACIAS POR PREFERIR NUESTRO BANCO XILENO\n"
                                + "<=============>\n");
                        res = 2;
                        confirmar = false;
                    }  
                } while (contador != 3);
                contador = 0;
                error = 0;
                
            if (res != 2) {
                do {
                 System.out.println("INGRESE  SU CONTRASEÑA");
                        password = input.next();
                    if (password.equals(clave)) {
                        
                        System.out.println("CLAVE INGRESADA CORRECTAMENTE");
                        contador = 3;
                        res = 1;
                        confirmar = true;
                    } else {
                        System.out.println("CLAVE INCORRECTA " + (contador + 1) + " INTENTO FALLIDO");
                        contador++;
                        error++;
                    }
                    
                    if (error == 3) {
                        
                        System.out.println("<=================>");
                        System.out.println("INTENTO " + contador + " SU CUENTA HA SIDO BLOQUEADA\n"
                                + "<=============>\n"
                                + "CONTACTESE CON SU BANCO MÁS CERCANO\n"
                                + "GRACIAS POR PREFERIR NUESTRO BANCO XILENO\n"
                                + "<=============>\n");
                    }
                 } while (contador !=3);
                contador = 1;
            }
        } while (contador == 3);
        
        
    do {
        
    if (confirmar = true && res == 1) {
        
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
                boolean claveCorrecta = false;
                int contUno = 2;
                int contDos = 2;
                int errorUno = 0;
                int errorDos = 0;
                int contadorUno = 0;
                int contadorDos = 0;
                System.out.println("<===CAMBIAR CLAVE===>");
                do {
                    
                    if (res != 2) {
                    System.out.println("INGRESE SU CLAVE ACTUAL");
                    String claveTemporal = input.next();
                    if (claveTemporal.equals(clave)) {
                        System.out.println("INGRESE SU NUEVA CLAVE");
                        claveTemporal = input.next();
                        int contarCharClave = claveTemporal.length();
                            if (contarCharClave == 4) {
                                clave = claveTemporal;
                                claveCorrecta = true;
                                contUno = 0;
                                contDos = 0;  
                            } else {
                                
                                System.out.println("INTENTE NUEVAMENTE");
                                System.out.println("QUEDAN " + contUno + " INTENTOS");
                                contUno = contUno - 1;
                                errorUno++;
                                contadorUno++;
                            }  
                    } else {
                        System.out.println("CLAVE INCORRECTA");
                        System.out.println("QUEDAN " + contDos + " INTENTOS");
                        contDos = contDos - 1;
                        errorDos++;
                        contadorDos++;
                    }
                    if (errorUno == 3) {
                        
                        System.out.println("<=================>");
                        System.out.println("INTENTO " + contadorUno + " SU CUENTA HA SIDO BLOQUEADA\n"
                                + "<=============>\n"
                                + "CONTACTESE CON SU BANCO MÁS CERCANO\n"
                                + "GRACIAS POR PREFERIR NUESTRO BANCO XILENO\n"
                                + "<=============>\n");
                        res = 1;
                        confirmar = true;
                    }
                    if (errorDos == 3) {
                        
                        System.out.println("<=================>");
                        System.out.println("INTENTO " + contadorDos + " SU CUENTA HA SIDO BLOQUEADA\n"
                                + "<=============>\n"
                                + "CONTACTESE CON SU BANCO MÁS CERCANO\n"
                                + "GRACIAS POR PREFERIR NUESTRO BANCO XILENO\n"
                                + "<=============>\n"); 
                        res = 1;
                        confirmar = true;
                        break;
                    }
                    }
                } while (claveCorrecta == false || contUno !=0 || contDos !=0 || confirmar == false);
         
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
                } while ((giroDinero < 1000 || giroDinero > 200000));
                
                if (giroDinero <= saldo) {
                        saldoInicial = giroDinero;
                        saldo = saldo - giroDinero;
                    
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
                }
                    
                    System.out.println("LA CANTIDAD DE BILLETES DE 20000$ ES: " + veinteMil + "\n"
                            + "LA CANTIDAD DE BILLETES DE 10000 ES: " + diezMil + "\n"
                            + "LA CANTIDAD DE BILLETES DE 5000 ES: " + cincoMil + "\n"
                            + "LA CANTIDAD DE BILLETES DE 2000 ES: " + dosMil + "\n"
                            + "LA CANTIDAD DE BILLETES DE 1000 ES: " + unMil + "\n"
                            + "EL RESTO QUE QUEDA ES: " + giroDinero + "\n");
                    if (giroDinero == 0 ) {
                        System.out.println("EL TOTAL DEL GIRO ES DE: " + saldoInicial);
                    
                } else {
                        System.out.println("EL TOTAL DEL GIRO ES DE: " + saldoFinal);
                }
                    
                
                break;
            case 3:
                    System.out.println("CONSULTA DE SALDO\n"
                            + "<============>\n"
                            + "SU SALDO ES: " + saldo + "$\n"
                                    + "<============>\n");
                
                break;
            case 4:
                System.out.println("SU SALDO ACTUAL ES: " + saldo + "$\n"
                        + "INGRESE EL MONTO A DEPOSITAR\n"
                        + "<===================>\n"
                        + "- EL MÍNIMO A DEPOSITAR ES DE 1.000 $\n"
                        + "- EL MÁXIMO A DEPOSITAR ES DE 200.000 $");
                            int depositoDinero = input.nextInt();
                            if (depositoDinero > 1000 && depositoDinero < 200000) {
                                saldo = saldo + depositoDinero;
                                System.out.println("SU SALDO ACTUAL ES: " + saldo);
                                
                    
                } else {
                                System.out.println("EL MONTO INGRESADO NO ES CORRECTO\n"
                                        + "INTENTE OTRA VEZ");
                }
                
                break;
            case 5:
                System.out.println("GRACIAS POR UTILIZAR NUESTRO BANCO XILENO\n"
                        + "<===============>\n"
                        + "GRACIAS POR PREFERIRNOS\n"
                        + "<===============>\n");
                
                break;
            default:
                throw new AssertionError();
        }
    } else {
        System.out.println("SU CUENTA HA SIDO BLOQUEADA\n"
                + "<==================>\n"
                + "CONTACTESE CON SU BANCO MÁS CERCANO");
                confirmar = false;
    }
            
        System.out.println("¿DESEA REALIZAR OTRA OPERACIÓN?\n"
                + "1. SI\n"
                + "2. NO\n");
        res = input.nextInt();
    } while (res == 1);

    
    
    
    
    }
}
