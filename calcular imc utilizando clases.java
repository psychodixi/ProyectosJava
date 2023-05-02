public class Paciente {
    
    String nombre;
    String run;
    int sexo;
    Double peso;
    Double altura;
    Double imc;
    String estadoFisico;
    
    public void CalcularImc(){
    
    imc = peso/(altura * altura);
     
    }
    
    public void MostrarDatos(){
        System.out.println("El NOMBRE del paciente es: " + nombre + "\n"
                + "El RUN del paciente es: " + run + "\n"
                        + "El SEXO del paciente es: " + sexo + "\n"
                                + "La ALTURA del paciente es: " + altura + "\n"
                                        + "El IMC del paciente es: " + imc + "\n");
    }
    
    public void EstadoFísico(){
        switch (sexo) {
            case 1:
                //hombres
                if (imc < 20) {
                    estadoFisico = "BAJO PESO";
                    
                } else {
                    if (imc >=20 && imc <=24.9) {
                        estadoFisico = "NORMAL";
                        
                    } else {
                        if (imc >=25 && imc <=29.9) {
                            estadoFisico = "OBESIDAD LEVE";
                            
                        } else {
                            if (imc >=30 && imc<=40) {
                                estadoFisico = "OBESIDAD SEVERA";
                                
                            } else {
                                estadoFisico = "OBESIDAD MUY SEVERA";
                            }
                        }
                    }
                }
                
                break;
            case 2:
                //mujeres
                if (imc < 20) {
                    estadoFisico = "BAJO PESO";
                    
                } else {
                    if (imc >=20 && imc <=23.9) {
                        estadoFisico = "NORMAL";
                        
                    } else {
                        if (imc >=24 && imc <=28.9) {
                            estadoFisico = "OBESIDAD LEVE";
                            
                        } else {
                            if (imc >=29 && imc<=37) {
                                estadoFisico = "OBESIDAD SEVERA";
                                
                            } else {
                                estadoFisico = "OBESIDAD MUY SEVERA";
                            }
                        }
                    }
                }
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Su estado Físico es: " + estadoFisico);
    }
    
    
}
// LA CLASE Menu.java
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente e1 = new Paciente();
        
        System.out.println("Ingrese nombre del paciente");
        e1.nombre = sc.nextLine();
        
        System.out.println("Ingrese el run del paciente");
        e1.run = sc.nextLine();
        
        System.out.println("Ingrese el sexo del paciente");
        System.out.println("1. MÁSCULINO");
        System.out.println("2. FEMENINO");
        e1.sexo = sc.nextInt();
        
        System.out.println("Ingrese el peso del paciente (EN KILOGRAMOS)");
        e1.peso = sc.nextDouble();
        
        System.out.println("Ingrese la altura del paciente (EN METROS, UTILICE COMA)");
        e1.altura = sc.nextDouble();
        
        e1.CalcularImc();
        e1.MostrarDatos();
        e1.EstadoFísico();
    }
}
