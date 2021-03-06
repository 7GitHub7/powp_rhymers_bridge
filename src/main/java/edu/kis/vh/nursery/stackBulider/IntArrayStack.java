package edu.kis.vh.nursery.stackBulider;


public class IntArrayStack implements StackInterface {
    int STACK_MAX_SIZE = 12;
    private int[] NUMBERS = new int[STACK_MAX_SIZE];

    public int getTotal() {
        return total;
    }

    @Override
    public void push(int i) {
        countIn(i);
    }

    @Override
    public boolean isEmpty() {
        return callCheck();
    }


    private int total = STACK_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_EMPTY;
    }


    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        return peekaboo();
    }

    @Override
    public int pop() {
        return countOut();
    }


    public int peekaboo() {
        if (callCheck())
            return STACK_EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY;
        return NUMBERS[total--];
    }

}
