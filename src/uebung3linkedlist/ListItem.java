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

    @Override
    public boolean equals(Object other) {
        E el = getElement();
        if (el == null) {
            return false;
        }
        return el.equals(other);
    }

    /**
     * @return the element
     */
    public E getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(E element) {
        this.element = element;
    }
}
