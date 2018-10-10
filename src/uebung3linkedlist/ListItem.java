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
class ListItem<E> {

    public E element;
    ListItem<E> previous, next;

    @Override
    public boolean equals(Object other) {
        return element.equals(other);
    }
}
