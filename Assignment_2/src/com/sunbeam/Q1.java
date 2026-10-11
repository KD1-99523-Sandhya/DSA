package com.sunbeam;

public class Q1 {
    private int arr[];
    private final int SIZE;
    private int front, rear;

    public Q1(int size) {
        SIZE = size;
        arr = new int[SIZE];

        front = rear = 0;
    }

    public void offer(int value) {
        if(isFull())
            System.out.println("Queue is full");
        else {
            arr[rear] = value;
            rear++;
        }
    }

    public int poll() {
        int temp = -1;

        if(isEmpty())
            System.out.println("Queue is empty");
        else {
            temp = arr[front];
            front++;
        }

        return temp;
    }

    public int peek() {
        int temp = -1;

        if(isEmpty())
            System.out.println("Queue is empty");
        else {
            temp = arr[front];
        }

        return temp;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == SIZE;
    }
}