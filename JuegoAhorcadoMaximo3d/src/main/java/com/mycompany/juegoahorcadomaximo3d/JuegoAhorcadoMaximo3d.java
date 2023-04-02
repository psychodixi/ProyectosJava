
package com.mycompany.juegoahorcadomaximo3d;

import java.util.Scanner;


public class JuegoAhorcadoMaximo3d {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    String palabra = "";
    String palabraMin;
    int vidas = 5;
    
    
    
    System.out.println("Ingrese la palabra a adivinar");
    palabra = input.next();
    palabraMin = palabra.toLowerCase();
    
        for (int i = 0; i < 50; i++) {
            
            System.out.println("");
            
        }
        System.out.println("Juego del ahorcado");
        
        //comienzo
        
        while (vidas > 0) {
            
            
            
            int numeroDeLetras = palabraMin.length();
            char [] palabraSecreta = new char [numeroDeLetras];
            
            for (int i = 0; i < palabraSecreta.length; i++) {
                palabraSecreta[i] = '_';
            }
            
            return palabraSecreta;
        
            
            System.out.println(palabraSecreta);
            System.out.println("Ingrese una letra");
                char letra = input.next().charAt(0);
                boolean letraCorrecta = false;
                for (int i = 0; i < palabraMin.length(); i++) {
                    if (palabraMin.charAt(i) == letra) {
                        palabraSecreta[i] = letra;
                        letraCorrecta = true;
                    }
                
            }   
                if (letraCorrecta == false) {
                    System.out.println("Letra incorrecta");
                } else {    
                    
                
            }
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
