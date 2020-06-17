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
import java.util.Arrays;

/**
 *
 * @author Falcao
 */
public class ClientsTest {
    
    public ClientsTest() {
    }
     public  char [] testlimit = new char[151];
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    Arrays.fill (testlimit, 0, 151, 'A');
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of addClients method, of class Clients.
     */
    @Test
    public void testAddClients1() {
        String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "63997";
        String phone2 = "777977";
        String email = "215@yahoo.com";
        Clients instance = new Clients();
        boolean expResult = true;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }

    @Test
    public void testAddClients2() {
         String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = "";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddClients3() {
        String Fname = String.valueOf(testlimit);
       String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddClients4() {
        String Fname = "";
       String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddClients5() {
        String Fname = "mohamed";
        String lname = String.valueOf(testlimit);
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }@Test
    public void testAddClients6() {
        String Fname = "mohamed";
        String lname = "";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddClient7() {
        String Fname = "mohamed";
        String lname = "magdy";
        String phone1 = String.valueOf(testlimit);
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddClients8() {
        String Fname = "mohamed";
        String lname = "magdy";
        String phone1 = "";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddClients9() {
        String Fname = "mohamed";
        String lname = "magdy";
        String phone1 = "4785";
        String phone2 = String.valueOf(testlimit);
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddClients10() {
       String Fname = "mohamed";
        String lname = "magdy";
        String phone1 = "4785";
        String phone2 = "147932";
        String email = String.valueOf(testlimit);
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddClients11() {
         String Fname = "mohamed";
        String lname = "magdy";
        String phone1 = "4785";
        String phone2 = "147932";
        String email ="";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditCilent1() {
        int id = 2;
      String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "200";
        String phone2 = "300";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = true;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

      public void testEditCilent2() {
        int id = 4;
      String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "160";
        String phone2 = "";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = true;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

      public void testEditCilent3() {
        int id = 5500;
      String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

    
      public void testEditCilent4() {
        int id = -1;            // -1 value respresented to no value enter
      String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

      public void testEditCilent5() {
        int id = 2;
       String Fname = String.valueOf(testlimit);
       String lname = "ashraf";
       String phone1 = "147896";
       String phone2 = "23478";
       String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

    
      public void testEditCilent6() {
        int id = 2;
        String Fname = "";
        String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

    
      public void testEditCilent7() {
        int id = 2;
       String Fname ="mohamed"; 
        String lname = String.valueOf(testlimit);
        String phone1 = "200";
        String phone2 = "300";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

        public void testEditCilent8() {
        int id = 2;
        String Fname ="mohamed"; 
        String lname = "";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

    
      public void testEditCilent9() {
        int id = 2;
      String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = String.valueOf(testlimit);
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }
    
        @Test

      public void testEditCilent10() {
        int id = 2;
      String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "";
        String phone2 = "23478";
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

      public void testEditCilent11() {
        int id = 2;
      String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = String.valueOf(testlimit);
        String email = "mohammed@gmail.com";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }    @Test

        public void testEditCilent12() {
        int id = 2;
        String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = String.valueOf(testlimit);
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }  
        @Test

      public void testEditCilent13() {
        int id = 2;
      String Fname ="mohamed"; 
        String lname = "ashraf";
        String phone1 = "147896";
        String phone2 = "23478";
        String email = "";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
      
    }
    
@Test
    
    public void testRemoveClient1() {
        int id = 2;
        Clients instance = new Clients();
        boolean expResult = true;
        boolean result = instance.removeClient(id);
        assertEquals(expResult, result);
       
    }
    @Test
      public void testRemoveClient2() {
        int id = 59320;
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.removeClient(id);
        assertEquals(expResult, result);
       
    }@Test
        public void testRemoveClient3() {
        int id = -1;        // -1 value respresented 0 value
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.removeClient(id);
        assertEquals(expResult, result);
       
    }
    
    
    
    
}
