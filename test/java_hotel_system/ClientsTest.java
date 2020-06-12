/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hotel_system;

import javax.swing.JTable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Falcao
 */
public class ClientsTest {
    
    public ClientsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addClients method, of class Clients.
     */
    @Test
    public void testAddClients() {
        System.out.println("addClients");
        String Fname = "";
        String lname = "";
        String phone1 = "";
        String phone2 = "";
        String email = "";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.addClients(Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillClientsJTABLE method, of class Clients.
     */
    @Test
    public void testFillClientsJTABLE() {
        System.out.println("fillClientsJTABLE");
        JTable table = null;
        Clients instance = new Clients();
        instance.fillClientsJTABLE(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editCilent method, of class Clients.
     */
    @Test
    public void testEditCilent() {
        System.out.println("editCilent");
        int id = 0;
        String Fname = "";
        String lname = "";
        String phone1 = "";
        String phone2 = "";
        String email = "";
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.editCilent(id, Fname, lname, phone1, phone2, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeClient method, of class Clients.
     */
    @Test
    public void testRemoveClient() {
        System.out.println("removeClient");
        int id = 0;
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.removeClient(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
