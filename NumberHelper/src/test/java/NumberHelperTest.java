/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsEven() {
        System.out.println("isEven");
        int n = 10;
        NumberHelper number = new NumberHelper(n);
        boolean expResult = true;
        boolean result = number.isEven();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsOdd() {
        System.out.println("isOdd");
        int n = 10;
        NumberHelper number = new NumberHelper(n);
        boolean expResult = false;
        boolean result = number.isOdd();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testSum() {
        System.out.println("sum");
        int n = 10;
        NumberHelper instance = new NumberHelper(n);
        int expResult = 20;
        int result = instance.sum(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsPrime() {
        System.out.println("isPrime");
        int n = 7;
        NumberHelper instance = new NumberHelper(n);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int number = 5;
        int n = 10;
        NumberHelper instance = new NumberHelper(n);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(number);
        assertEquals(expResult, result);
    }
    
}
