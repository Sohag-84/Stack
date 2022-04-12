package Stack;

public class Runner_class {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(3);
        s.pop();
        s.printStack();
        System.out.println(s.pop());
        s.printStack();
    }
}
