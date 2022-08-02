package com.fitnesscoder.demo.TwoStackInOneArray;

public class TwoStackDemo {
    public static void main(String[] args) {
        TwoStack twoStack=new TwoStack(3);
        twoStack.push1(2);
        twoStack.push1(4);
        twoStack.push1(3);
        twoStack.push2(5);
        System.out.println(twoStack.pop2());
        System.out.println(twoStack.pop1());
        twoStack.push2(6);
        System.out.println(twoStack.pop2());
        System.out.println(twoStack.pop1());
        twoStack.push2(7);
    }
}
