/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.checknumber;

import java.util.Scanner;

/**
 *Escriu una classe en Java amb NetBeans (o Eclipse) que retorni un 1,
 * un 0 o un -1 en funció de si el número double que li passem és positiu, zero o negatiu.
 * La classe es dirà CheckNumber.
 * Realitza 3 proves unitàries amb JUnit (una per cada camí possible). La classe es dirà CheckNumberTest.
 * 
 * 
 * 
 * @author LucasAcevedo
 */
public class CheckNumber {

    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
            
        double numero;
            
        System.out.println("Escriu un número d'entrada, et diré si és positiu, negatiu o zero."
                + "Si escrius un número decimal, el separador per defecte és la coma.");
            
        numero=teclat.nextDouble(); 
        
        String resposta=check(numero);
        System.out.println(resposta);
        
        RetornarPNZ(resposta, numero);
    }
        
        public static String check(double numero) {
            
        String missatge;
        switch (Double.compare(numero, 0.0)) {
            case 1:
                missatge = numero + " és positiu";
                break;
            case -1:
                missatge = numero + " és negatiu";
                break;
            default:
                missatge = numero + " és zero";
                break;
        }
        return missatge;
    }
        
        public static void RetornarPNZ(String resposta, double numero) {
        if(resposta.equals(numero+" és positiu")){
            System.out.println(1);
        }
        else if(resposta.equals(numero+" és negatiu")){
            System.out.println(-1);
        }
        else if(resposta.equals((numero+" és zero"))){
            System.out.println(0);
        }
    }
}
