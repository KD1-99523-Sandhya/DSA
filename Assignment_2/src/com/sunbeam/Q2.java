package com.sunbeam;

public class Q2{
    private int arr[];
    private final int SIZE;
    private int top;

    public Q2(int size) {
        SIZE = size;
        arr = new int[SIZE];
        top = SIZE;
    }

    public void push(int value) {
        if (isFull())
            System.out.println("Stack is full");
        else {
            top--;
            arr[top] = value;
        }
    }

    public int pop() {
        int temp = -1;

        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            temp = arr[top];
            top++;
        }

        return temp;
    }

    public int peek() {
        int temp = -1;

        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            temp = arr[top];
        }

        return temp;
    }

    public boolean isEmpty() {
        return top == SIZE;
    }

    public boolean isFull() {
        return top == 0;
    }
}
