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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Falcao
 */
public class RESERVATIONTest {
    
    public RESERVATIONTest() {
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

    /**
     * Test of addReservation method, of class RESERVATION.
     */
    @Test
    public void testAddReservation1() {
        int client_id = 5;
        int room_type = 20;
        String dateIn = "2020-05-14";
        String dateOut = "2020-05-20";
        int Recp = 3;
        RESERVATION instance = new RESERVATION();
        boolean expResult = true;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }       @Test

public void testAddReservation2() {
       int client_id = 5000;
        int room_type = 16;
        String dateIn = "2020-05-14";
        String dateOut = "2020-05-31";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }
       @Test

public void testAddReservation3() {
        int client_id = -1;
         int room_type = 16;
        String dateIn = "2020-05-14";
        String dateOut = "2020-05-31";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }


       @Test

public void testAddReservation4() {
        int client_id = 4;
        int room_type = 3;
        String dateIn = "2020-05-14";
        String dateOut = "2020-05-31";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }

       @Test

public void testAddReservation5() {
        int client_id = 4;
        int room_type = -1;
        String dateIn = "2020-05-14";
        String dateOut = "2020-05-31";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }



       @Test

public void testAddReservation6() {
        int client_id = 4;
        int room_type = -1;
        String dateIn = "2020-05-14";
        String dateOut = "2020-05-31";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }


       @Test

public void testAddReservation7() {
        int client_id = 4;
        int room_type = 16;
        String dateIn = "2020-05-12";
        String dateOut = "2020-05-31";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }



       @Test

public void testAddReservation8() {
          int client_id = 4;
        int room_type = 16;
        String dateIn = "";
        String dateOut = "2020-05-31";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }
       @Test


public void testAddReservation9() {
            int client_id = 4;
        int room_type = 16;
        String dateIn = "2020-05-14";
        String dateOut = "2020-05-6";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }



       @Test

public void testAddReservation10() {
           int client_id = 4;
        int room_type = 16;
        String dateIn = "2020-05-14";
        String dateOut = "";
        int Recp = 4;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.addReservation(client_id, room_type, dateIn, dateOut, Recp);
        assertEquals(expResult, result);
        
    }
    
  
    

    @Test
    public void testEditReservation1() {
        int reservation_id = 45;
        int client_id = 6;
        int room_number = 2;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = true;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

      public void testEditReservation2() {
        int reservation_id = 1;
         int client_id = 7;
        int room_number = 1;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }
   
           @Test

    public void testEditReservation3() {
        int reservation_id = -1;
       int client_id = 7;
        int room_number = 1;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation4() {
        int reservation_id = 1;
       int client_id = 50;
        int room_number = 15;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation5() {
        int reservation_id = 1;
       int client_id = -1;
        int room_number = 15;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation6() {
    int reservation_id = 27;
       int client_id = 7;
        int room_number = 1;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation7() {
  int reservation_id = 27;
       int client_id = 7;
        int room_number = -1;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation8() {
  int reservation_id = 27;
       int client_id = 7;
        int room_number = 500;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation9() {
        int reservation_id = 27;
       int client_id = 7;
        int room_number = 1;
        String dataIn = "2020-05-1";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation10() {
        int reservation_id = 27;
       int client_id = 7;
        int room_number = 1;
        String dataIn = "";
        String dateOut = "2020-05-31";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation11() {
        int reservation_id = 22;
       int client_id = 7;
        int room_number = 1;
        String dataIn = "2020-05-14";
        String dateOut = "2020-05-11";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }       @Test

    public void testEditReservation12() {
        int reservation_id = 27;
       int client_id = 7;
        int room_number = 1;
        String dataIn = "2020-05-14";
        String dateOut = "";
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.editReservation(reservation_id, client_id, room_number, dataIn, dateOut);
        assertEquals(expResult, result);
        
    }
    
    
    
    
       @Test
    public void testRemoveReservation1() {
        int reservation_id = 51;
        RESERVATION instance = new RESERVATION();
        boolean expResult = true;
        boolean result = instance.removeReservation(reservation_id);
        assertEquals(expResult, result);
    }
    
  
    
     @Test
    public void testRemoveReservation2() {
        int reservation_id = 15000;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.removeReservation(reservation_id);
        assertEquals(expResult, result);
    }
     @Test
    public void testRemoveReservation3() {
        int reservation_id = -1;
        RESERVATION instance = new RESERVATION();
        boolean expResult = false;
        boolean result = instance.removeReservation(reservation_id);
        assertEquals(expResult, result);
    }
    
    
    
    


    
}
