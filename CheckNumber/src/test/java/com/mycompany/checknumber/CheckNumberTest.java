/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checknumber;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;


/**
 *
 * @author LucasAcevedo
 */
public class CheckNumberTest extends TestCase {
    
    
    public void testPositiveNumber() {
        double numero = 2.5;
        String resultatEsperat = numero + " és positiu";
        String resultatObtingut = CheckNumber.check(numero);
        assertEquals(resultatEsperat, resultatObtingut);
    }
    
    
    public void testNegativeNumber() {
        double numero = -2.5;
        String resultatEsperat = numero + " és negatiu";
        String resultatObtingut = CheckNumber.check(numero);
        assertEquals(resultatEsperat, resultatObtingut);
    }
    
    
    public void testZeroNumber() {
        double numero = 0.0;
        String resultatEsperat = numero + " és zero";
        String resultatObtingut = CheckNumber.check(numero);
        assertEquals(resultatEsperat, resultatObtingut);
    }
    
}
