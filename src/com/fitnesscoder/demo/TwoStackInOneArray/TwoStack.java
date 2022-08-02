package com.fitnesscoder.demo.TwoStackInOneArray;

public class TwoStack {
    int[] arr;
    int top1;
    int top2;
    int size;

    public TwoStack(int size) {
        this.size=size;
        arr=new int[5];
        top1=-1;
        top2=size;
    }

    public void push1(int data) {
        if(top2-top1>1) {
            top1++;
            arr[top1]=data;
        } else {
            System.out.println("Stack1 Overflow!!");
        }
    }

    public void push2(int data) {
        if(top2-top1>1) {
            top2--;
            arr[top2]=data;
        } else {
            System.out.println("Stack2 Overflow!!");
        }
    }

    public int pop1() {
        if(top1==-1) {
            System.out.println("Stack1 Underflow!!");
            return -1;
        }

        int value=arr[top1];
        top1--;
        return value;
    }

    public int pop2() {
        if(top2==size) {
            System.out.println("Stack2 Underflow!!");
            return -1;
        }
        int value=arr[top2];
        top2++;
        return value;
    }
 }
