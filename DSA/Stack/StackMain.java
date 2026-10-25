package myJava.Stack;

public class StackMain {
    static void main() throws StackException {
//        CustomStack stack=new CustomStack(5);
//        stack.push(29);
//        stack.push(9);
//        stack.push(2);
//        stack.push(20);
//        stack.push(12);
//        stack.push(112);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        DynamicStack stack=new DynamicStack(5);
        stack.push(29);
        stack.push(9);
        stack.push(2);
        stack.push(20);
        stack.push(12);
        stack.push(112);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
