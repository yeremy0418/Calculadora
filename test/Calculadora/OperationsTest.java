/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class OperationsTest {
    
    public OperationsTest() {
    }

    @Test
    public void testGetNum1() {
        System.out.println("getNum1");
        Operations instance = new Operations(5.0,10.0);
        double expResult = 5.0;
        double result = instance.getNum1();
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testSetNum1() {
        System.out.println("setNum1");
        double num1 = 10.0;
        Operations instance = new Operations();
        instance.setNum1(num1);
      
    }

    @Test
    public void testGetNum2() {
        System.out.println("getNum2");
        Operations instance = new Operations(40.0,52.0);
        double expResult = 52.0;
        double result = instance.getNum2();
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testSetNum2() {
        System.out.println("setNum2");
        double num2 = 27.0;
        Operations instance = new Operations();
        instance.setNum2(num2);
        
    }

    @Test
    public void testAddition() {
        System.out.println("addition");
        double num1 = 5.0;
        double num2 = 12.0;
        Operations instance = new Operations();
        double expResult = 17.0;
        double result = instance.addition(num1, num2);
        assertEquals(expResult, result, 0);
       
    }

    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        double num1 = 96.0;
        double num2 = 25.0;
        Operations instance = new Operations();
        double expResult = 71.0;
        double result = instance.subtraction(num1, num2);
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        double num1 = 8.0;
        double num2 = 6.0;
        Operations instance = new Operations();
        double expResult = 48.0;
        double result = instance.multiplication(num1, num2);
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        double num1 = 8.0;
        double num2 = 4.0;
        Operations instance = new Operations();
        double expResult = 2.0;
        double result = instance.division(num1, num2);
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testExponentiation() {
        System.out.println("exponentiation");
        double base = 2.0;
        double power = 6.0;
        Operations instance = new Operations();
        double expResult = 64.0;
        double result = instance.exponentiation(base, power);
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testPercentage() {
        System.out.println("percentage");
        double num = 40.0;
        double percentage = 60.0;
        Operations instance = new Operations();
        double expResult = 24.0;
        double result = instance.percentage(num, percentage);
        assertEquals(expResult, result, 0);
        
    }
    
}
