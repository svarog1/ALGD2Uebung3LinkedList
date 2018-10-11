/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3linkedlist;

import java.util.Objects;

/**
 *
 * @author santi
 */
class DLinkedListIterator<T> implements IListIterator<T> {

    private final DLinkedList<T> list;
    private ListItem<T> item;

    public DLinkedListIterator(DLinkedList<T> list) {
        this.list = list;
        this.item = list.dummyElement;
    }

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
            assert !this.hasNext() : "There is no next element in the list.";
            return null;
        }
    }

    @Override
    public boolean hasPrevious() {
        return !(item.previous.isDummy);

    }

    @Override
    public T previous() {
        if (this.hasPrevious()) {
            this.item = this.item.previous;
            return this.item.element;
        } else {
            assert !this.hasPrevious() : "There is no previous element it ist der dummy element.";
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
            list.remove(item);
        }
    }

    @Override
    public void set(T e) {
        list.set(item, e);
    }

    @Override
    public void add(T e) {
        if (e != null) {
            list.addAfter(item, e);
        }
    }

    @Override
    public ListItem getVisited() {
        return item;
    }

    @Override
    public boolean equals(Object o) {
        return item.equals(o);
    }
}
