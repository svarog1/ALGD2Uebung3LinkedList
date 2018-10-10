/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
public class DLinkedListTest {

    public DLinkedList<Integer> d = new DLinkedList<>();

    public DLinkedListTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        d.add(1);
        d.add(2);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class DLinkedList.
     */
    @Test
    public void testToArray() {
        System.out.println("ToArray");
        assertEquals(2, d.size());
        Object[] ia=d.toArray();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of isEmpty method, of class DLinkedList.
//     */
//    @Test
//    public void testIsEmpty() {
//        System.out.println("isEmpty");
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.isEmpty();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of contains method, of class DLinkedList.
//     */
//    @Test
//    public void testContains() {
//        System.out.println("contains");
//        Object o = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.contains(o);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of iterator method, of class DLinkedList.
//     */
//    @Test
//    public void testIterator() {
//        System.out.println("iterator");
//        DLinkedList instance = new DLinkedList();
//        Iterator expResult = null;
//        Iterator result = instance.iterator();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toArray method, of class DLinkedList.
//     */
//    @Test
//    public void testToArray_0args() {
//        System.out.println("toArray");
//        DLinkedList instance = new DLinkedList();
//        Object[] expResult = null;
//        Object[] result = instance.toArray();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toArray method, of class DLinkedList.
//     */
//    @Test
//    public void testToArray_GenericType() {
//        System.out.println("toArray");
//        Object[] a = null;
//        DLinkedList instance = new DLinkedList();
//        Object[] expResult = null;
//        Object[] result = instance.toArray(a);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of add method, of class DLinkedList.
//     */
//    @Test
//    public void testAdd_GenericType() {
//        System.out.println("add");
//        Object e = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.add(e);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class DLinkedList.
//     */
//    @Test
//    public void testRemove_Object() {
//        System.out.println("remove");
//        Object o = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.remove(o);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of containsAll method, of class DLinkedList.
//     */
//    @Test
//    public void testContainsAll() {
//        System.out.println("containsAll");
//        Collection c = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.containsAll(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addAll method, of class DLinkedList.
//     */
//    @Test
//    public void testAddAll_Collection() {
//        System.out.println("addAll");
//        Collection c = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.addAll(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addAll method, of class DLinkedList.
//     */
//    @Test
//    public void testAddAll_int_Collection() {
//        System.out.println("addAll");
//        int index = 0;
//        Collection c = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.addAll(index, c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeAll method, of class DLinkedList.
//     */
//    @Test
//    public void testRemoveAll() {
//        System.out.println("removeAll");
//        Collection c = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.removeAll(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of retainAll method, of class DLinkedList.
//     */
//    @Test
//    public void testRetainAll() {
//        System.out.println("retainAll");
//        Collection c = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.retainAll(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of clear method, of class DLinkedList.
//     */
//    @Test
//    public void testClear() {
//        System.out.println("clear");
//        DLinkedList instance = new DLinkedList();
//        instance.clear();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of get method, of class DLinkedList.
//     */
//    @Test
//    public void testGet_int() {
//        System.out.println("get");
//        int index = 0;
//        DLinkedList instance = new DLinkedList();
//        Object expResult = null;
//        Object result = instance.get(index);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of set method, of class DLinkedList.
//     */
//    @Test
//    public void testSet_int_GenericType() {
//        System.out.println("set");
//        int index = 0;
//        Object element = null;
//        DLinkedList instance = new DLinkedList();
//        Object expResult = null;
//        Object result = instance.set(index, element);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of add method, of class DLinkedList.
//     */
//    @Test
//    public void testAdd_int_GenericType() {
//        System.out.println("add");
//        int index = 0;
//        Object element = null;
//        DLinkedList instance = new DLinkedList();
//        instance.add(index, element);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class DLinkedList.
//     */
//    @Test
//    public void testRemove_int() {
//        System.out.println("remove");
//        int index = 0;
//        DLinkedList instance = new DLinkedList();
//        Object expResult = null;
//        Object result = instance.remove(index);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of indexOf method, of class DLinkedList.
//     */
//    @Test
//    public void testIndexOf() {
//        System.out.println("indexOf");
//        Object o = null;
//        DLinkedList instance = new DLinkedList();
//        int expResult = 0;
//        int result = instance.indexOf(o);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of lastIndexOf method, of class DLinkedList.
//     */
//    @Test
//    public void testLastIndexOf() {
//        System.out.println("lastIndexOf");
//        Object o = null;
//        DLinkedList instance = new DLinkedList();
//        int expResult = 0;
//        int result = instance.lastIndexOf(o);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of subList method, of class DLinkedList.
//     */
//    @Test
//    public void testSubList() {
//        System.out.println("subList");
//        int fromIndex = 0;
//        int toIndex = 0;
//        DLinkedList instance = new DLinkedList();
//        List expResult = null;
//        List result = instance.subList(fromIndex, toIndex);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkMembership method, of class DLinkedList.
//     */
//    @Test
//    public void testCheckMembership() {
//        System.out.println("checkMembership");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        boolean expResult = false;
//        boolean result = instance.checkMembership(item);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    /**
//     * Test of head method, of class DLinkedList.
//     */
//    @Test
//    public void testHead() {
//        System.out.println("head");
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.head();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tail method, of class DLinkedList.
//     */
//    @Test
//    public void testTail() {
//        System.out.println("tail");
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.tail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of next method, of class DLinkedList.
//     */
//    @Test
//    public void testNext() {
//        System.out.println("next");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.next(item);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of previous method, of class DLinkedList.
//     */
//    @Test
//    public void testPrevious() {
//        System.out.println("previous");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.previous(item);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cyclicNext method, of class DLinkedList.
//     */
//    @Test
//    public void testCyclicNext() {
//        System.out.println("cyclicNext");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.cyclicNext(item);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cyclicPrevious method, of class DLinkedList.
//     */
//    @Test
//    public void testCyclicPrevious() {
//        System.out.println("cyclicPrevious");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.cyclicPrevious(item);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of delete method, of class DLinkedList.
//     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        ListItem item = null;
//        boolean next = false;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.delete(item, next);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cyclicDelete method, of class DLinkedList.
//     */
//    @Test
//    public void testCyclicDelete() {
//        System.out.println("cyclicDelete");
//        ListItem item = null;
//        boolean next = false;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.cyclicDelete(item, next);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of get method, of class DLinkedList.
//     */
//    @Test
//    public void testGet_ListItem() {
//        System.out.println("get");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        Object expResult = null;
//        Object result = instance.get(item);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of set method, of class DLinkedList.
//     */
//    @Test
//    public void testSet_ListItem_GenericType() {
//        System.out.println("set");
//        ListItem item = null;
//        Object data = null;
//        DLinkedList instance = new DLinkedList();
//        instance.set(item, data);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class DLinkedList.
//     */
//    @Test
//    public void testRemove_ListItem() {
//        System.out.println("remove");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        Object expResult = null;
//        Object result = instance.remove(item);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addHead method, of class DLinkedList.
//     */
//    @Test
//    public void testAddHead() {
//        System.out.println("addHead");
//        Object data = null;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.addHead(data);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addTail method, of class DLinkedList.
//     */
//    @Test
//    public void testAddTail() {
//        System.out.println("addTail");
//        Object data = null;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.addTail(data);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addAfter method, of class DLinkedList.
//     */
//    @Test
//    public void testAddAfter_ListItem_GenericType() {
//        System.out.println("addAfter");
//        ListItem item = null;
//        Object data = null;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.addAfter(item, data);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addBefore method, of class DLinkedList.
//     */
//    @Test
//    public void testAddBefore_ListItem_GenericType() {
//        System.out.println("addBefore");
//        ListItem item = null;
//        Object data = null;
//        DLinkedList instance = new DLinkedList();
//        ListItem expResult = null;
//        ListItem result = instance.addBefore(item, data);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of moveToHead method, of class DLinkedList.
//     */
//    @Test
//    public void testMoveToHead() {
//        System.out.println("moveToHead");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        instance.moveToHead(item);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of moveToTail method, of class DLinkedList.
//     */
//    @Test
//    public void testMoveToTail() {
//        System.out.println("moveToTail");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        instance.moveToTail(item);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of rotate method, of class DLinkedList.
//     */
//    @Test
//    public void testRotate() {
//        System.out.println("rotate");
//        ListItem item = null;
//        DLinkedList instance = new DLinkedList();
//        instance.rotate(item);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of swap method, of class DLinkedList.
//     */
//    @Test
//    public void testSwap() {
//        System.out.println("swap");
//        ListItem item1 = null;
//        ListItem item2 = null;
//        DLinkedList instance = new DLinkedList();
//        instance.swap(item1, item2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reverse method, of class DLinkedList.
//     */
//    @Test
//    public void testReverse() {
//        System.out.println("reverse");
//        DLinkedList instance = new DLinkedList();
//        instance.reverse();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addAfter method, of class DLinkedList.
//     */
//    @Test
//    public void testAddAfter_ListItem_List() {
//        System.out.println("addAfter");
//        DLinkedList instance = new DLinkedList();
//       // instance.addAfter(null);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addBefore method, of class DLinkedList.
//     */
//    @Test
//    public void testAddBefore_ListItem_List() {
//        System.out.println("addBefore");
//        DLinkedList instance = new DLinkedList();
//        instance.addBefore(null);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of conc method, of class DLinkedList.
//     */
//    @Test
//    public void testConc() {
//        System.out.println("conc");
//        DLinkedList instance = new DLinkedList();
//        instance.conc(null);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class DLinkedList.
//     */
//    @Test
//    public void testRemove_ListItem_ListItem() {
//        System.out.println("remove");
//        ListItem startInclusive = null;
//        ListItem endExclusive = null;
//        DLinkedList instance = new DLinkedList();
//        IList expResult = null;
//        IList result = instance.remove(startInclusive, endExclusive);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listIterator method, of class DLinkedList.
//     */
//    @Test
//    public void testListIterator_0args() {
//        System.out.println("listIterator");
//        DLinkedList instance = new DLinkedList();
//        IListIterator expResult = null;
//        IListIterator result = instance.listIterator();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listIterator method, of class DLinkedList.
//     */
//    @Test
//    public void testListIterator_int() {
//        System.out.println("listIterator");
//        int index = 0;
//        DLinkedList instance = new DLinkedList();
//        IListIterator expResult = null;
//        IListIterator result = instance.listIterator(index);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
