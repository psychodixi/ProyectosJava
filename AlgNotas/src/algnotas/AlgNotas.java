
package algnotas;

import java.util.Scanner;


public class AlgNotas {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double notaUno ;
    double notaDos ;
    double notaTres ;
    double promedio ;
    
    
    System.out.println("Ingrese la primer nota");
    notaUno = input.nextDouble();
    
    System.out.println("Ingrese la segunda nota");
    notaDos = input.nextDouble();
    
    System.out.println("Ingrese la tercer nota");
    notaTres = input.nextDouble();
    
    promedio = (notaUno + notaDos + notaTres) / 3;
            
    System.out.println("El promedio del alumno es de " + Math. round(promedio));
    
    if (promedio >= 4) {
        System.out.println("La situación del estudiante es APROBADO");
     
    }
    else {
        System.out.println("La situación del estudiante es REPROBADO");
    }
    
    }
    
}
        