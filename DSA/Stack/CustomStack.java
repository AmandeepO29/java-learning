package myJava.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
        // this line will call another constructor which takes int as an argument..... i.e below's constructor
    }

    public CustomStack(int size) {
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        int removed= data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }
}
