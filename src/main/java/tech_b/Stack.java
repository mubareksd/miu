package tech_b;

public class Stack {

    private int[] arr;
    private int capacity;
    private int top;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int x) {
        if(isFull()) {
            System.out.println("stack overflow");
            System.exit(1);
        }
        arr[++top] = x;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public void printStack() {
        for(int i=0; i <= top; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack");
        stack.printStack();
        stack.pop();
        System.out.println("\nafter pop");
        stack.printStack();
    }

}