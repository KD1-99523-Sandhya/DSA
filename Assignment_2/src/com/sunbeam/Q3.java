package com.sunbeam;

public class Q3 {
    private int arr[];
    private final int SIZE;
    private int front, rear;
    private int count;

    public Q3(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = rear = -1;
        count = 0;
    }

    public void offer(int value) {
        if(isFull())
            System.out.println("Queue is full");
        else {
            rear = (rear + 1) % SIZE;
            arr[rear] = value;
            count++;
        }
    }

    public int poll() {
        int temp = -1;

        if(isEmpty())
            System.out.println("Queue is empty");
        else {
            front = (front + 1) % SIZE;
            temp = arr[front];
            count--;

            if(count == 0)
                front = rear = -1;
        }

        return temp;
    }

    public int peek() {
        int temp = -1;

        if(isEmpty())
            System.out.println("Queue is empty");
        else {
            temp = arr[(front + 1) % SIZE];
        }

        return temp;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == SIZE;
    }
}

