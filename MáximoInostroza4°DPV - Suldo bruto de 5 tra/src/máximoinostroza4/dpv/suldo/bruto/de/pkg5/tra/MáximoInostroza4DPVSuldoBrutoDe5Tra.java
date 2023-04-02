
package máximoinostroza4.dpv.suldo.bruto.de.pkg5.tra;

import java.util.Scanner;


public class MáximoInostroza4DPVSuldoBrutoDe5Tra {

    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    String trabajadores[] = new String[5];
    Double sueldos[] = new Double[5];
    
    //contadores, auxiliar
    int k = 1;
    String aux2;
    Double aux;
    
    //ingreso de los nombres de los trabajadores y su sueldo bruto correspondiente
    for (int i = 0; i < trabajadores.legnth; i++) {
            System.out.println("Ingrese el nombre del trabajador " + (i+1));
            trabajadores[i] = sc.next();
            
            System.out.println("Ingrese el sueldo BRUTO del trabajador " + k);
            sueldos[i] = sc.nextDouble();
            
            
            k++;
            k = 1;
                    
            
        }
    
    //sueldo bruto pasa a sueldo líquido
    for (int i = 0; i < trabajadores.length; i++) {
        sueldos[i] = sueldos[i] * 0.81;
            
    }
    // ordenamiento del arreglo, intercambio de posicion
    for (int i = 0; i < (trabajadores.length-1); i++) {
            for (int j = 0; j < (trabajadores.length-1); j++) {
                if (sueldos[j] > sueldos[j+1]) {
                    aux = sueldos[j];
                    sueldos[j] = sueldos[j+1];
                    sueldos[j+1] = aux;
                    
                    aux2 = trabajadores[j];
                    trabajadores[j] = trabajadores[j+1];
                    trabajadores[j+1] = aux2;
                    
                            
                    
                }
                
            }
            
        }
    // imprimirlos de mayor a menor
    for (int i =(trabajadores.length-1); i >= 2; i--) {
            System.out.println("EL SUELDO LÍQUIDO DE: " + sueldos[i] + " CORRESPONDE AL TRABAJADOR:  " + trabajadores[i]);
            
        }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
