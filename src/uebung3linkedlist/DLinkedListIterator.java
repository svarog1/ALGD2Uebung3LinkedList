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
        return (!item.next.isDummy);
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            this.item = this.item.next;
            return this.item.element;
        } else {
            assert !this.hasNext() : "There is no next element it ist der dummy element.";
            return null;
        }

    }

    @Override
    public boolean hasPrevious() {
        return (item.previous.isDummy) ? false : true;

    }

    @Override
    public T previous() {
        if (this.hasPrevious()) {
            this.item = this.item.previous;
            return this.item.element;
        } else {
            assert !this.hasNext() : "There is no previous element it ist der dummy element.";
            return null;
        }
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
        if (item.isDummy) {
            throw new IllegalStateException("It should not be possible to remove the dummy ListItem.");
        } else {
            item.previous.next = item.next.previous;
            item.next.previous = item.previous.next;
        }
    }

    @Override
    public void set(T e) {
        item.element=e;
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
    public boolean equals(Object o) {
        return item.equals(o);
    }

}
