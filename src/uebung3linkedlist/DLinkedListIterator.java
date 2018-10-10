/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3linkedlist;

import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author santi
 */
class DLinkedListIterator<T> implements IListIterator<T> {

    public DLinkedListIterator(ListItem<T> startelement) {
        this.item = startelement;
    }
    ListItem<T> item;

    @Override
    public boolean hasNext() {
        if (item.next == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public T next() {
        T value=this.item.element;
        this.item = this.item.next;
        return value;
    }

    @Override
    public boolean hasPrevious() {
        if (item.previous == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public T previous() {
        this.item = this.item.previous;
        return this.item.element;
    }

    @Override
    public int nextIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int previousIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        if (item.previous != null && item.next != null) {
            item.previous.next = item.next;
            item.next.previous = item.previous;
        } else if (item.previous == null) {
            item.element = item.next.element;
            item.next = item.next.next;
        } else if (item.next == null) {
            item = item.previous;
            item.next = null;
        }

    }

    @Override
    public void set(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListItem getVisited() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean equals(Object o)
    {
    item.equals(o);
    }

}
