/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;

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

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return dummyElement.next.isDummy; //When the dummy element follow it self then there are no Elements in the LinkedList.        
    }

    @Override
    public boolean contains(Object o) {
        for (E element : this) {
            if (element.equals(o)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new DLinkedListIterator<>(this.dummyElement);
    }

    @Override
    public Object[] toArray() {
        Object[] ob = new Object[size];
        int counter = 0;
        for (E thi : this) {
            ob[counter] = thi;
            counter++;
        }
        return ob;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return a;
    }

    @Override
    public boolean add(E e) {
        if (this.isEmpty()) {
            return (this.addAfter(dummyElement, e) != null);
        } else {
            return (this.addAfter(this.tail(), e) != null);
        }

    }

    @Override
    public boolean remove(Object o) {

        if (this.isEmpty()) {
            assert this.isEmpty() : "You can not remove a item from an Empty list.";
            return false;
        } else if (dummyElement.getClass().equals(o.getClass())) { //The object o is from the class ListItem.
            DLinkedListIterator<E> iterator = new DLinkedListIterator<>(dummyElement);
            DLinkedListIterator<E> i;
            for (i = iterator; i.hasNext();) {
                if (i.item.equals(o)) {
                    i.remove();
                    size--;
                    return true;
                }
            }
            return false;

        } else if (this.dummyElement.next.getElement().getClass().equals(o.getClass())) {//The object o is from the class E.
            ListItem<E> item = new ListItem<>((E) o);
            DLinkedListIterator<E> iterator = new DLinkedListIterator<>(dummyElement);
            DLinkedListIterator<E> i;
            for (i = iterator; i.hasNext();) {
                if (i.item.equals(o)) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkMembership(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem head() {
        if (this.isEmpty()) {
            assert this.isEmpty() : "Ther is no head element in an empty DLinkedList";
            return null;
        } else {
            return this.dummyElement.next;
        }

    }

    @Override
    public ListItem tail() {
        if (this.isEmpty()) {
            assert this.isEmpty() : "Ther is no tail element in an empty DLinkedList";
            return null;
        } else {
            return this.dummyElement.previous;
        }
    }

    @Override
    public ListItem next(ListItem item) {
        if (item.next.isDummy) {
            assert item.next.isDummy : "Ther is no next element in this ListItem.";
            return null;
        } else {
            return item.next;
        }
    }

    @Override
    public ListItem previous(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem cyclicNext(ListItem item) {
        return this.next(item);
    }

    @Override
    public ListItem cyclicPrevious(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem delete(ListItem item, boolean next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem cyclicDelete(ListItem item, boolean next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(ListItem item) {
        if (item.getClass().equals(dummyElement.getClass())) {
            return (E) item.element;
        } else {
            throw new IllegalStateException("The ListItem is not a list Item from this DLinkedList.");
        }

    }

    @Override
    public void set(ListItem item, E data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(ListItem item) {
        size--;
        item.previous.next = item.next;
        item.next.previous = item.previous;
        return (E) item.element;
    }

    @Override
    public ListItem addHead(E data) {
        ListItem<E> newHead = new ListItem(data);
        newHead.previous = dummyElement;
        newHead.next = dummyElement.next;
        dummyElement.next.previous = newHead;
        dummyElement.next = newHead;
        return newHead;
    }

    @Override
    public ListItem addTail(E data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param item
     * @param data
     * @return the new list Element with the new data.
     */
    @Override
    public ListItem addAfter(ListItem item, E data) {
        ListItem<E> nextItem = new ListItem<>();
        nextItem.setElement(data);
        nextItem.next = item.next;
        nextItem.previous = item;
        item.next.previous = nextItem;
        item.next = nextItem;
        size++;
        return item;
    }

    @Override
    public ListItem addBefore(ListItem item, E data) {
        size++;
        ListItem<E> beforeItem = new ListItem<>(data);
        beforeItem.next=item;
        beforeItem.previous=item.previous;
        item.previous.next=beforeItem;
        item.previous=beforeItem;
        return beforeItem;
    }

    @Override
    public void moveToHead(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveToTail(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rotate(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void swap(ListItem item1, ListItem item2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAfter(ListItem item, List<E> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addBefore(ListItem item, List<E> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conc(List<E> list, boolean after) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IList<E> remove(ListItem startInclusive, ListItem endExclusive) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IListIterator<E> listIterator() {
        if (isEmpty()) {
            assert isEmpty() : "The list needs elements first.";
            return null;
        }
        DLinkedListIterator<E> dli = new DLinkedListIterator<>(this.dummyElement);
        return dli;
    }

    @Override
    public IListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
