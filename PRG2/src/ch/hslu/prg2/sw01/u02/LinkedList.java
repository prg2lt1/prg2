/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw01.u02;

import ch.hslu.prg2.sw01.u01.Konto;

/**
 *
 * @author frowin
 */
public class LinkedList<T> {

    private ListNode<T> head;      // Kopf bzw. Anfang der Liste

    public LinkedList() {
        head = null;

    }

    /**
     * Prüft, ob Liste leer ist.
     *
     * @return
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Fügt Objekt k am Anfang in die Liste ein.
     *
     * @param k
     */
    public void insert(T d) {
        head = new ListNode<T>(head, d);

    }

    /**
     * Prüft, ob ein gleiches Objekt wie d bereits in der Liste enthalten ist.
     *
     * @return
     */
    public boolean isFound(T d) {

        ListNode<T> actualNode = head;

        while ((actualNode != null) && !d.equals(actualNode.getData())) {
            actualNode = actualNode.getNext();
        }
        return actualNode != null;

    }

    /**
     * Entfernt aus der Liste das erste Objekt gleich k.
     *
     * @param k
     */
    public void remove(T d) {
        ListNode<T> actualNode = head;
        ListNode<T> prevNode = null;
        while ((actualNode != null) && !d.equals(actualNode.getData())) {
            prevNode = actualNode;
            actualNode = prevNode.getNext();
        }
        // Liste wieder ordentlich zusammenhängen:
        if (actualNode != null) {
            if (actualNode == head) {
                head = actualNode.getNext();
            } else {
                prevNode.setNext(actualNode.getNext());
            }
        }
    }

    /**
     * Gibt alle Objekte der Reihe nach zeilenweise auf die Konsole aus.
     */
    public void print() {
        ListNode<T> actualNode = head;
        System.out.println("----------");
        while (actualNode != null) {
            System.out.println(actualNode.getData());
            actualNode = actualNode.getNext();
        }

    }

    public void length() {

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.print();
        list.remove(2);
        list.print();

    }
}
