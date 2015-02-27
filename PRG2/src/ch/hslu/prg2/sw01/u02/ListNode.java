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
public class ListNode<T> {

    private T data;
    private ListNode<T> next;

    public ListNode(ListNode<T> n, T d) {
        this.next = n;
        this.data = d;
    }

    public void setData(T d) {
        this.data = d;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(ListNode<T> n) {
        this.next = n;
    }

    public ListNode<T> getNext() {
        return this.next;
    }

}
