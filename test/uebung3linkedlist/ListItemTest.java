/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3linkedlist;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author santi
 */
public class ListItemTest {
    
    public ListItemTest() {
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
     * Test of equals method, of class ListItem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        ListItem instance = new ListItem();
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElement method, of class ListItem.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        ListItem instance = new ListItem();
        Object expResult = null;
        Object result = instance.getElement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setElement method, of class ListItem.
     */
    @Test
    public void testSetElement() {
        System.out.println("setElement");
        Object element = null;
        ListItem instance = new ListItem();
        instance.setElement(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
