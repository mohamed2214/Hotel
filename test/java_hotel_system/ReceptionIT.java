/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hotel_system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Falcao
 */
public class ReceptionIT {
    
    public ReceptionIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testRecptionEnter1() {
        
        String username="test3";
        String password="test3";
        Reception instance = new Reception();
        
        int expResult = 3;
        int result = instance.RecptionEnter(username, password);
        assertEquals(expResult, result);  
    }
      @Test
    public void testRecptionEnter2() {
        
            String username="test35";
        String password="test3";
        Reception instance = new Reception();
        
        int expResult = 0;
        int result = instance.RecptionEnter(username, password);
        assertEquals(expResult, result);
    
    }    
      @Test
    public void testRecptionEnter3() {
        
             String username="";
        String password="test3";
        Reception instance = new Reception();
        
        int expResult = 0;
        int result = instance.RecptionEnter(username, password);
        assertEquals(expResult, result);
       }  @Test
    public void testRecptionEnter4() {
        
               String username="test3";
        String password="test355";
        Reception instance = new Reception();
        
        int expResult = 0;
        int result = instance.RecptionEnter(username, password);
        assertEquals(expResult, result);
}
      @Test
      public void testRecptionEnter5() {
        
               String username="test3";
        String password="";
        Reception instance = new Reception();
        
        int expResult = 0;
        int result = instance.RecptionEnter(username, password);
        assertEquals(expResult, result);
}
}