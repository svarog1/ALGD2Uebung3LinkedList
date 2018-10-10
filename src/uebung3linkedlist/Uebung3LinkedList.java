/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Infos : https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in
 */
package uebung3linkedlist;

/**
 *
 * @author santi
 */
public class Uebung3LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DLinkedList<Integer> dlnikList = new DLinkedList<>();
        dlnikList.add(1);
        dlnikList.add(2);
        dlnikList.add(3);
        dlnikList.reverse();
    }

}
