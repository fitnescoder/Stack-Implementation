package com.fitnesscoder.demo.StackInArrayImpl;

public class MyStack {
    int[] arr;
    int size;
    int top;

    public MyStack(int size) {
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    public void push(int data) {
        if(top==size-1) {
            System.out.println("Stack Overflow..!!");
        }

        if(top<size-1) {
            top++;
            arr[top]=data;
        }

    }

    public int pop() {
        if(top==-1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value=arr[top];
        top--;
        return value;
    }

    public int peek() {
        if(top>=0 && top<=size-1) {
            return arr[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for(int i=0; i<=top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
