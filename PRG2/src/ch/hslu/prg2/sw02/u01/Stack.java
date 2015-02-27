/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw02.u01;

/**
 *
 * @author frowin
 */
public class Stack {

    private int size;
    private int top = 0;

    private Object[] stack;

    public Stack(int s) {
        size = s;
        stack = new Object[size];
    }

    public void push(Object o) {
        stack[top] = o;
        top++;
    }

    public Object pop() {
        top--;
        return stack[top];
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public boolean isFull() {
        return (top == size);
    }

}
