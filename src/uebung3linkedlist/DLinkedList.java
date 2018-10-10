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

    ListItem<E> headElement;
    int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (headElement == null) {
            return true;
        } else {
            return false;
        }
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
        return new DLinkedListIterator<>(headElement);
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
        if (this.headElement == null) {
            this.addHead(e);
        } else {
            ListItem<E> item = new ListItem<>();
            item.element = e;
            ListItem<E> tail = this.tail();
            tail.next = item;
            item.previous = tail;
        }
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {

        if ( ListItem.class.isInstance(o)) {
   //...
            ;}
        assert (o instanceof E || o instanceof ListItem<E>);
        for (E thi : this) {
            if (thi.equals(o)) {

            }
        }
        DLinkedListIterator<E> iterator = new DLinkedListIterator<>(headElement);
        DLinkedListIterator<E> i;
        for (i = iterator; i.hasNext();) {
            if (i.equals(o)) {
                i.remove();
                break;
            }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem tail() {
        if (headElement == null) {
            throw new IllegalStateException("No head element.");
        } else if (headElement.next == null) {
            return headElement;
        } else {
            DLinkedListIterator<E> iterator = new DLinkedListIterator<>(headElement);
            DLinkedListIterator<E> i;
            for (i = iterator; i.hasNext();) {
                i.next();
            }
            return i.item;
        }
    }

    @Override
    public ListItem next(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem previous(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem cyclicNext(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(ListItem item, E data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(ListItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem addHead(E data) {
        ListItem<E> headItem = new ListItem<>();
        headItem.element = data;
        if (headElement == null) {
            this.headElement = headItem;
        } else {
            headItem.next = this.headElement;
            this.headElement = headItem;
        }
        this.size++;
        return headItem;
    }

    @Override
    public ListItem addTail(E data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem addAfter(ListItem item, E data) {
        ListItem<E> nextItem = new ListItem<>();
        nextItem.element = data;
        if (item.next == null) {
            item.next = nextItem;
        } else {
            nextItem.next = item.next;
            item.next = nextItem;
        }
        this.size++;
        return nextItem;
    }

    @Override
    public ListItem addBefore(ListItem item, E data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        DLinkedListIterator<E> dli = new DLinkedListIterator<E>(headElement);
        return dli;
    }

    @Override
    public IListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
