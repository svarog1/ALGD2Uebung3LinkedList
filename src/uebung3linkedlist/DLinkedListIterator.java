/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3linkedlist;

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

    /**
     * Execution time:  O(1).
     * @return          Checks if next ListItem is Dummy.
     */
    @Override
    public boolean hasNext() {
        return (!item.next.isDummy);
    }

    /**
     * Execution time:  O(1).
     * Precondition:    Next item is not Dummy.
     * @return          Next element of List.
     */
    @Override
    public T next() {
        if (this.hasNext()) {
            this.item = this.item.next;
            return this.item.element;
        } else {
            return null;
        }
    }

    /**
     * Execution time:  O(1).
     * @return          Checks if previous ListItem is Dummy.
     */
    @Override
    public boolean hasPrevious() {
        return !(item.previous.isDummy);

    }

    /**
     * Execution time:  O(1).
     * Precondition:    Previous item is not Dummy.
     * @return          Previous element of List.
     */
    @Override
    public T previous() {
        if (this.hasPrevious()) {
            this.item = this.item.previous;
            return this.item.element;
        } else {
            assert this.hasPrevious() : "There is no previous element it ist der dummy element.";
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

    /**
     * Execution time:  O(n).
     * Precondition:    Item can't be Dummy.
     */
    @Override
    public void remove() {
        if (item.isDummy) {
            throw new IllegalStateException("It should not be possible to remove the dummy ListItem.");
        } else {
            list.remove(item);
        }
    }

    /**
     * Executio time:   O(1).
     * @param e 
     */
    @Override
    public void set(T e) {
        list.set(item, e);
    }

    /**
     * Execution time:  O(1).
     * @param e         Item to add after current.
     */
    @Override
    public void add(T e) {
        if (e != null) {
            list.addAfter(item, e);
        }
    }

    /**
     * Execution time:  O(1).
     * @return          Current ListItem.
     */
    @Override
    public ListItem getVisited() {
        return item;
    }

    /**
     * Execution time:  O(1).
     * @param o         Object to check for equality.
     * @return          Wether the object equals the current element.
     */
    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        
        return item.equals(o);
    }
}
