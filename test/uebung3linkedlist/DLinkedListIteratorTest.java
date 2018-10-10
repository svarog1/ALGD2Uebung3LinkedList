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
public class DLinkedListIteratorTest {
    
    public DLinkedListIteratorTest() {
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
     * Test of hasNext method, of class DLinkedListIterator.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        DLinkedListIterator instance = null;
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class DLinkedListIterator.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        DLinkedListIterator instance = null;
        Object expResult = null;
        Object result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasPrevious method, of class DLinkedListIterator.
     */
    @Test
    public void testHasPrevious() {
        System.out.println("hasPrevious");
        DLinkedListIterator instance = null;
        boolean expResult = false;
        boolean result = instance.hasPrevious();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class DLinkedListIterator.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        DLinkedListIterator instance = null;
        Object expResult = null;
        Object result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextIndex method, of class DLinkedListIterator.
     */
    @Test
    public void testNextIndex() {
        System.out.println("nextIndex");
        DLinkedListIterator instance = null;
        int expResult = 0;
        int result = instance.nextIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previousIndex method, of class DLinkedListIterator.
     */
    @Test
    public void testPreviousIndex() {
        System.out.println("previousIndex");
        DLinkedListIterator instance = null;
        int expResult = 0;
        int result = instance.previousIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DLinkedListIterator.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        DLinkedListIterator instance = null;
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class DLinkedListIterator.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Object e = null;
        DLinkedListIterator instance = null;
        instance.set(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DLinkedListIterator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object e = null;
        DLinkedListIterator instance = null;
        instance.add(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisited method, of class DLinkedListIterator.
     */
    @Test
    public void testGetVisited() {
        System.out.println("getVisited");
        DLinkedListIterator instance = null;
        ListItem expResult = null;
        ListItem result = instance.getVisited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class DLinkedListIterator.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        DLinkedListIterator instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
