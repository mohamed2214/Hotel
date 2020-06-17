/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hotel_system;

import javax.swing.JComboBox;
import javax.swing.JTable;
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
public class ROOMSTest {
    
    public ROOMSTest() {
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
     * Test of addRooms method, of class ROOMS.
     */
    @Test
    public void testAddRooms1() {
        int Number = 1;
        int Type = 1;
        String phone = "";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.addRooms(Number, Type, phone);
        assertEquals(expResult, result);
       
    }
     
     @Test
    public void testAddRooms2() {
        int Number = 16;
        int Type = 4;
        String phone = "";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.addRooms(Number, Type, phone);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testAddRooms3() {
        int Number = -1;
        int Type = 7;
        String phone = "1478";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.addRooms(Number, Type, phone);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testAddRooms4() {
        int Number = 21;
        int Type = 4;
        String phone = "8937";
        ROOMS instance = new ROOMS();
        boolean expResult = true;
        boolean result = instance.addRooms(Number, Type, phone);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testAddRooms5() {
        int Number = 2;
        int Type = 0;
        String phone = "1788";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.addRooms(Number, Type, phone);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testAddRooms6() {
        System.out.println("addRooms");
        int Number = -1;
        int Type = 3;
        String phone = "";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.addRooms(Number, Type, phone);
        assertEquals(expResult, result);
       
    }
 
    @Test
    public void testEditRoom1() {
        int Number = 6;
        int Type = 2;
        String phone = "";
        String isReserved = "Yes";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.editRoom(Number, Type, phone, isReserved);
        assertEquals(expResult, result);

    }    @Test

    public void testEditRoom2() {
        System.out.println("editRoom");
        int Number = 20;
        int Type = 4;
        String phone = "";
        String isReserved = "Ye";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.editRoom(Number, Type, phone, isReserved);
        assertEquals(expResult, result);

    }    @Test

    public void testEditRoom3() {
        System.out.println("editRoom");
        int Number = -1;
        int Type = 2;
        String phone = "741";
        String isReserved = "Yes";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.editRoom(Number, Type, phone, isReserved);
        assertEquals(expResult, result);

    }    @Test

    public void testEditRoom4() {
        int Number = -1;
        int Type = 5;
        String phone = "7896";
        String isReserved = "Yes";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.editRoom(Number, Type, phone, isReserved);
        assertEquals(expResult, result);

    }
        @Test

    public void testEditRoom5() {
        int Number = 5;
        int Type = 4;
        String phone = "12369";
        String isReserved = "Yes";
        ROOMS instance = new ROOMS();
        boolean expResult = true;
        boolean result = instance.editRoom(Number, Type, phone, isReserved);
        assertEquals(expResult, result);

    }
        @Test

    public void testEditRoom6() {
        System.out.println("editRoom");
        int Number = -1;
        int Type = 3;
        String phone = "";
        String isReserved = "Yes";
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.editRoom(Number, Type, phone, isReserved);
        assertEquals(expResult, result);

    }
    
    
    
    
    
    

    /**
     * Test of removeRoom method, of class ROOMS.
     */
    @Test
    public void testRemoveRoom1() {
        int RoomNumber = 4;
        ROOMS instance = new ROOMS();
        boolean expResult = true;
                
        boolean result = instance.removeRoom(RoomNumber);
        assertEquals(expResult, result);
      
    }

    
    
    @Test
    public void testRemoveRoom2() {
        int RoomNumber = 50;
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.removeRoom(RoomNumber);
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testRemoveRoom3() {
        int RoomNumber = -1;
        ROOMS instance = new ROOMS();
        boolean expResult = false;
        boolean result = instance.removeRoom(RoomNumber);
        assertEquals(expResult, result);
      
    }
  
    
}
