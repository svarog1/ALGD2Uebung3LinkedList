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
public class ListItem<E> {

    ListItem() {
    }

    ListItem(E element) {
        this.element = element;
    }

    E element;
    ListItem<E> previous, next;
    boolean isDummy = false;

    /**
     * Execution time:  O(1).
     * @param other     Object to check for equality.
     * @return          Wether the object is equal to this ListItem.
     */
    @Override
    public boolean equals(Object other) {
        E el = getElement();
        if (el == null) {
            return false;
        }
        return el.equals(other);
    }

    /**
     * Execution time:  O(1).
     * @return          The element
     */
    public E getElement() {
        return element;
    }

    /**
     * Execution time:  O(1).
     * @param element   The element to set
     */
    public void setElement(E element) {
        this.element = element;
    }
}
