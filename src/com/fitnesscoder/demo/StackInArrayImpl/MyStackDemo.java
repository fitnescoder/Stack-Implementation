package com.fitnesscoder.demo.StackInArrayImpl;

public class MyStackDemo {

    public static void main(String[] args) {
        MyStack myStack=new MyStack(5);
        myStack.push(5);
        myStack.push(10);
        myStack.push(15);
        myStack.push(20);
        myStack.push(25);
        System.out.println("===After Push Operation===");
        myStack.printStack();
        System.out.println("==Trying to push beyond limit==");
        myStack.push(30);
        System.out.println("===Top element of Stack===");
        System.out.println(myStack.peek());
        System.out.println("==pop operation twice==");
        System.out.println("Popped value :"+myStack.pop());
        System.out.println("Popped value :"+myStack.pop());
        System.out.println("==After pop operation==");
        myStack.printStack();
        System.out.println("is Stack Empty="+myStack.isEmpty());
    }
}
