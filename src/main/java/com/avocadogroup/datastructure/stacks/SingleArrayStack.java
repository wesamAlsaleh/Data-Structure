package com.avocadogroup.datastructure.stacks;

public class SingleArrayStack {
    private final int maxSize;
    private final char[] stackArray;
    private int top; // (like current index)

    public SingleArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        top = -1;
    }

    public char push(char data) {
        // if there is a space
        if (top < maxSize - 1) {
            // increase the top
            top++;

            // put the data of the new element
            stackArray[top] = data;

            // return the inserted data
            return data;
        }
        return 0;
    }

    public char pop() {
        // if there is data remove the top (last element)
        if (top >= 0) {
            // return the last element after removal
            return stackArray[top--];
        }

        // return zero if no elements
        return 0;
    }

    public boolean isEmpty() {
        // if the top is -1 then no elements
        return (top == -1);
    }

    public boolean isFull() {
        // if the top (index) is the same as the size - 1 then its empty
        return (top == maxSize - 1);
    }

    public char top() {
        // return the last element
        return stackArray[top];
    }

    // function to print the stack elements
    public void printStack() {
        if (top >= 0) {
            System.out.println("Elements in stack : ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }
}
