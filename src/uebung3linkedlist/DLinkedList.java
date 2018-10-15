/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author santi
 * @param <E>
 */
public class DLinkedList<E> implements IList<E> {

    public DLinkedList() {
        this.dummyElement = new ListItem<>();
        this.dummyElement.previous = this.dummyElement;
        this.dummyElement.next = this.dummyElement;
        this.dummyElement.isDummy = true;
    }

    private int size = 0;
    ListItem<E> dummyElement;
    
    /**
     * Execution time:  O(1).
     * @return          The amount of ListElements inside the list, except the dummy element.
    */
    @Override
    public int size() {
        return this.size;
    }
    
    /**
     * Execution time:  O(1).
     * @return          If the dummyElement refers to itselft as the nextItem.
    */
    @Override
    public boolean isEmpty() {
        return dummyElement.next.isDummy; //When the dummy element follow it self then there are no Elements in the LinkedList.
    }
    
    /**
     * Execution time:  O(n).
     * @param o         Can be null.
     * @return          Wether the object is inside the list.
    */
    @Override
    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }

        Iterator it = iterator();
        Object obj = it.next();
        while (obj != null) {
            if (obj.equals(o)) {
                return true;
            }
            obj = it.next();
        }

        return false;
    }
    
   /**
     * Execution time:  O(1).
     * @return          New iterator for this list.
    */
    @Override
    public Iterator<E> iterator() {
        return new DLinkedListIterator<>(this);
    }

    /**
     * Execution times:     O(n).
     * @return              New array with elements from the list.
     */
    @Override
    public Object[] toArray() {
        Object[] objs = new Object[size];
        int counter = 0;

        Iterator it = iterator();
        Object obj = it.next();
        while (obj != null) {
            objs[counter] = obj;
            counter++;
            obj = it.next();
        }
        return objs;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not implemented for DLinkList.");
    }
    
    /**
     * Execution time:  O(1).
     * @param e         Data that is going to be inside the list element. 
     *                  Can be null.
     * @return          The success of the addition.
     */
    @Override
    public boolean add(E e) {
        if (e == null) {
            return false;
        }
        return (this.addAfter(this.tail(), e) != null);
    }

    /**
     * Execution time:  O(n).
     * Precondition:    o can be null, from the type E and the list can't be empty.
     * @param o         Will be removed.
     * @return          The success of the removal of the object.
     */
    @Override
    public boolean remove(Object o) {
        if (o == null) {
            return false;
        }

        if (this.isEmpty()) {
            assert this.isEmpty() : "You can not remove a item from an Empty list.";
            return false;
        } else if (dummyElement.getClass().equals(o.getClass())) { //The object o is from the class ListItem.
            DLinkedListIterator<E> iterator = new DLinkedListIterator<>(this);
            DLinkedListIterator<E> i;
            for (i = iterator; i.hasNext();) {
                if (i.getVisited().equals(o)) {
                    remove(i.getVisited());
                    size--;
                    return true;
                }
            }
            return false;

        } else if (this.dummyElement.next.getElement().getClass().equals(o.getClass())) {//The object o is from the class E.
            ListItem<E> item = new ListItem<>((E) o);
            DLinkedListIterator<E> iterator = new DLinkedListIterator<>(this);
            DLinkedListIterator<E> i;
            for (i = iterator; i.hasNext();) {
                if (i.getVisited().equals(o)) {
                    i.remove();
                    size--;
                    return true;
                }
            }
            return false;

        } else {
            assert true : "The Object need to be from class E or a ListItem";
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not implemented for DLinkList.");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not implemented for DLinkList.");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not implemented for DLinkList.");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not implemented for DLinkList.");
    }

    /**
     * Execution time:  O(1).
     */
    @Override
    public void clear() {
        dummyElement.next = dummyElement;
        dummyElement.previous = dummyElement;
        size = 0;
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }
    
    /**
     * Execution time:  O(n)
     * @param item      Item that should be checked for membership. 
     *                  Can be null.
     * @return          True if item is a member of this list.
     */
    @Override
    public boolean checkMembership(ListItem item) {
        DLinkedListIterator<E> it = new DLinkedListIterator<>(this);
        E element = it.next();
        while (element != null) {
            if (element == item) {
                return true;
            }
            element = it.next();
        }
        return false;
    }
    
    /**
     * Execution time:  O(1).
     * Precondition:    List can't be empty.
     * @return          The head element of the linked list.
     */
    @Override
    public ListItem head() {
        if (this.isEmpty()) {
            assert this.isEmpty() : "There is no head element in an empty DLinkedList";
            return null;
        } else {
            return this.dummyElement.next;
        }
    }
    
    /**
     * Execution time:  O(1).
     * Precondition:    List can't be empty.
     * @return          The tail of the linked list.
     */
    @Override
    public ListItem tail() {
        if (this.isEmpty()) {
            assert this.isEmpty() : "There is no tail element in an empty DLinkedList";
            return null;
        } else {
            return this.dummyElement.previous;
        }
    }

    /**
     * Execution time:  O(1).
     * Precondition:    ListItem can't be tail.
     * @param item      
     * @return          The next element in the list after item.
     */
    @Override
    public ListItem next(ListItem item) {
        if (item.next.isDummy) {
            assert item.next.isDummy : "There is no next element in this ListItem.";
            return null;
        } else {
            return item.next;
        }
    }
    
    /**
     * Execution time:  O(1).
     * Precondition:    ListItem can't be head.
     * @param item
     * @return          The previous element in the list before item.
     */
    @Override
    public ListItem previous(ListItem item) {
        if (item.previous.isDummy) {
            assert item.previous.isDummy : "There is no previous element in this ListItem.";
            return null;
        } else {
            return item.previous;
        }
    }
    
    /**
     * Execution time:  O(1).
     * @param item
     * @return          The next item in the list after item. 
     *                  If item is tail, head will be returned. 
     */
    @Override
    public ListItem cyclicNext(ListItem item) {
        ListItem next = this.next(item);
        if (next == null) {
            return dummyElement.next;
        }
        return next;
    }

    /**
     * Execution time:  O(1).
     * @param item
     * @return          The previous item in the list before item. 
     *                  If item is head, tail will be returned.
     */
    @Override
    public ListItem cyclicPrevious(ListItem item) {
        ListItem previous = this.previous(item);
        if (previous == null) {
            return dummyElement.previous;
        }
        return previous;
    }

    /**
     * Execution time:  O(1).
     * @param item
     * @param next 
     * @return          The item next or previous of the deleted item. 
     *                  Can return null if deleted element was head or tail.
     */
    @Override
    public ListItem delete(ListItem item, boolean next) {
        size--;
        item.previous.next = item.next;
        item.next.previous = item.previous;
        if (next) {
            return this.next(item);
        } else {
            return this.previous(item);
        }
    }

    /**
     * Execution time:  O(1).
     * @param item
     * @param next
     * @return          The item next or previous of the deleted item.
     */
    @Override
    public ListItem cyclicDelete(ListItem item, boolean next) {
        size--;
        item.previous.next = item.next;
        item.next.previous = item.previous;
        if (this.isEmpty()) {
            return null;
        }
        if (next) {
            return this.cyclicNext(item);
        } else {
            return this.cyclicPrevious(item);
        }
    }
    
    /**
     * Execution time:  O(1).
     * Precondition:    ListItem must be from this DLinkedList.
     * @throws          IllegalStateException
     * @param item
     * @return          The data of the item.
     */
    @Override
    public E get(ListItem item) {
        //assert this.contains(item.element) : "The item has to be in the list"; // Dauert O(n)
        if (item.getClass().equals(dummyElement.getClass())) {
            return (E) item.element;
        } else {
            throw new IllegalStateException("The ListItem is not a list Item from this DLinkedList.");
        }
    }

    /**
     * Execution time:  O(1).
     * @param item      
     * @param data      Data that should be set to the item.
     */
    @Override
    public void set(ListItem item, E data) {
        item.element = data;
    }

    /**
     * Execution time:  O(1).
     * @param item      The item that should be removed.
     * @return          Data of deleted element.
     */
    @Override
    public E remove(ListItem item) {
        item.previous.next = item.next;
        item.next.previous = item.previous;

        size--;
        return (E) item.element;
    }
    
    /**
     * Execution time:  O(1).
     * @param data      Data for the new head.
     * @return          New head ListItem.
     */
    @Override
    public ListItem addHead(E data) {
        ListItem<E> newHead = new ListItem(data);
        newHead.previous = dummyElement;
        newHead.next = dummyElement.next;
        dummyElement.next.previous = newHead;
        dummyElement.next = newHead;
        size++;

        return newHead;
    }

    /**
     * Execution time:  O(1).
     * @param data      Data for the new tail.
     * @return          New tail ListItem.
     */
    @Override
    public ListItem addTail(E data) {
        ListItem<E> newTail = new ListItem(data);
        newTail.previous = dummyElement.previous;
        newTail.next = dummyElement;
        dummyElement.previous.next = newTail;
        dummyElement.previous = newTail;
        size++;

        return newTail;
    }

    /**
     * Execution time:  O(1)
     * @param item      The ListItem that should be before the new ListItem.
     * @param data      Data for the new ListItem.
     * @return          The newly added ListItem.
     */
    @Override
    public ListItem addAfter(ListItem item, E data) {
        if (item == null) {
            item = dummyElement;
        }
        
        ListItem<E> nextItem = new ListItem<>(data);
        nextItem.next = item.next;
        nextItem.previous = item;
        item.next.previous = nextItem;
        item.next = nextItem;
        size++;

        return nextItem;
    }

    /**
     * Execution time:  O(1).
     * @param item      The ListItem that should be after the new ListItem.
     * @param data      Data for the new ListItem.
     * @return          The newly added ListItem.
     */
    @Override
    public ListItem addBefore(ListItem item, E data) {
        if (item == null) {
            item = this.dummyElement;
        }
        ListItem<E> beforeItem = new ListItem<>(data);
        beforeItem.next = item;
        beforeItem.previous = item.previous;
        item.previous.next = beforeItem;
        item.previous = beforeItem;
        size++;

        return beforeItem;
    }

    /**
     * Execution time:  O(1).
     * @param item      The item that will be the new head.
     */
    @Override
    public void moveToHead(ListItem item) {
        this.remove(item);
        this.addAfter(null, (E) item.element);
    }
    
    /**
     * Execution time:  O(1).
     * @param item      The item that will be the new tail.
     */
    @Override
    public void moveToTail(ListItem item) {
        this.remove(item);
        this.addBefore(null, (E) item.element);
    }
    
    /**
     * Execution time:  O(1).
     * @param item      ListItem that should be rotated.
     */
    @Override
    public void rotate(ListItem item) {
        if (item == dummyElement.next) {
            return;
        }
        dummyElement.next.previous = dummyElement.previous;
        dummyElement.previous.next = dummyElement.next;
        dummyElement.next = item;
        dummyElement.previous = item.previous;

        item.previous.next = dummyElement;
        item.previous = dummyElement;
    }

    /**
     * Execution time:  O(1).
     * @param item1     Item1 to swap.
     * @param item2     Item2 to swap.
     */
    @Override
    public void swap(ListItem item1, ListItem item2) {
        E temp = (E) item1.element;
        item1.element = item2.element;
        item2.element = temp;
    }

    /**
     * Execution time:  O(n).
     */
    @Override
    public void reverse() {
        if (isEmpty()) {
            return;
        }
        ListItem nextItem = dummyElement;
        do {
            ListItem next = nextItem.next;
            nextItem.next = nextItem.previous;
            nextItem.previous = next;
            nextItem = next;
        } while (nextItem.getElement() != null);
    }

    /**
     * Execution time:  O(n).
     * @param item
     * @param list      List to add after item.
     */
    @Override
    public void addAfter(ListItem item, List<E> list) {
        ListItem prev = item;
        for (E element : list) {
            prev = addAfter(prev, element);
        }
        list.clear();
    }

    /**
     * Execution time:  O(n).
     * @param item
     * @param list      List to add before item.
     */
    @Override
    public void addBefore(ListItem item, List<E> list) {
        for (E element : list) {
            addBefore(item, element);
        }
        list.clear();
    }

    /**
     * 
     * @param list      List to concatenate with this list.
     * @param after     Wether the list should be concatenated at the 
     *                  end or at the beginning of this list.
     */
    @Override
    public void conc(List<E> list, boolean after) {
        if (after) {
            addBefore(null, list);
        } else {
            addAfter(null, list);
        }
    }

    /**
     * Execution time:          O(n).
     * @param startInclusive
     * @param endExclusive
     * @return                  List of deleted ListItems.
     */
    @Override
    public IList<E> remove(ListItem startInclusive, ListItem endExclusive) {
        if (this.isEmpty()) {
            return new DLinkedList<>();
        }
        ListItem itemToDelete = startInclusive;
        if (itemToDelete == null) {
            itemToDelete = dummyElement.next;
        }
        if (endExclusive == null) {
            endExclusive = dummyElement.next;
        }
        DLinkedList<E> deletedItems = new DLinkedList<>();
        do {
            deletedItems.add((E) itemToDelete.getElement());
            remove(itemToDelete);
            itemToDelete = this.cyclicNext(itemToDelete);
        } while (itemToDelete != endExclusive);
        return deletedItems;
    }

    /**
     * Execution time:  O(1).
     * Precondition:    The list can't be empty.
     * @return          New DLinkedListIterator.
     */
    @Override
    public IListIterator<E> listIterator() {
        if (isEmpty()) {
            assert this.isEmpty() : "The list needs elements first.";
            return null;
        }
        return new DLinkedListIterator<>(this);
    }

    @Override
    public IListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Too slow to implement.");
    }
}
