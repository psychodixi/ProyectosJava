package crearcalculadora;

import java.util.Scanner;

public class CrearCalculadora {
    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int numeroUno ;
        int numeroDos ;
        int opc ;
        int respuesta ;
        
        do {            
            System.out.println("<CALCULADORA EXÓTICA>");
            System.out.println("<===================>\n"
                    + "1. SUMA\n"
                    + "2. RESTA\n"
                    + "3. MULTIPLICACIÓN\n"
                    + "4. DIVISIÓN\n"
                    + "5. SALIR\n"
                    + "ESCOGA UNA OPCIÓN\n");
            
                     opc = Entrada.nextInt();
                switch (opc)    {
                    case 1:
                        System.out.println("Ingrese el primer número");
                        numeroUno = Entrada.nextInt();
                        System.out.println("Ingrese el segundo número");
                        numeroDos = Entrada.nextInt();
                        int suma = numeroUno + numeroDos;
                        System.out.println("La suma de los dos números es de " + suma);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer número");
                        numeroUno = Entrada.nextInt();
                        System.out.println("Ingrese el segundo número");
                        numeroDos = Entrada.nextInt();
                        int resta = numeroUno - numeroDos;
                        System.out.println("La resta de los dos los números es de " + resta);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer número");
                        numeroUno = Entrada.nextInt();
                        System.out.println("Ingrese el segundo número");
                        numeroDos = Entrada.nextInt();
                        int multiplicacion = numeroUno * numeroDos;
                        System.out.println("La multiplicación de dos los números es de " + multiplicacion);
                        break;
                    case 4: 
                        System.out.println("Ingrese el primer número");
                        numeroUno = Entrada.nextInt();
                        System.out.println("Ingrese el segundo número");
                        numeroDos = Entrada.nextInt();
                        float division = numeroUno / numeroDos;
                        System.out.println("La división de los dos números es de " + division);
                        break;
                    default:
                        throw new AssertionError();       
                }
                System.out.println("¿Desea realizar otra operación?\n"
                        + "1. SI / 2. NO ");
                respuesta = Entrada.nextInt();
        } while (respuesta == 1);
        
        
       
        
                
                
                
                
                
                
                
    }
    
    
    
    
    
    
}
