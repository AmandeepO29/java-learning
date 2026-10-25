package myJava.Stack;

import java.util.Stack;

public class InBuiltExample {
    static void main() {
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(29);
        stack.push(9);
        stack.push(2);
        stack.push(45);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
