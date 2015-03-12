// Test mit JUnit fehlt noch, weiss nicht ob diese Klasse funktioniert :-)

// test

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw02.u01;

import java.util.ArrayList;

/**
 *
 * @author frowin
 */
public class Stack<T> {

    private int minCapacity;
    private ArrayList<T> stack;

    public Stack() {
        minCapacity = 10;
        stack = new ArrayList<>(minCapacity);
    }

    public void push(T d) {
        stack.add(d);
    }

    public T pop() {
        int lastIndex = stack.lastIndexOf(this);
        T lastElement = stack.get(lastIndex);
        stack.remove(lastIndex);
        stack.trimToSize();
        return lastElement;
    }

    public boolean isEmpty() {
        return (stack.lastIndexOf(this) == -1);
    }

    public boolean isFull() {
        return (minCapacity == stack.size());
    }

}
