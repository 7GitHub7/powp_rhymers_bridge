package edu.kis.vh.nursery.list;

public interface StackInterface {
    int getTotal();

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}