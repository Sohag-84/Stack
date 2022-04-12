package Stack;

public class Stack {
    private Node top;
    private int size;
    Stack(){
        this.top = null;
        this.size = 0;
    }
    void push(int value){
        Node temp = new Node(value);
        temp.next = this.top;
        this.top = temp;
        this.size++;
    }
    int pop(){
        if (is_empty()) {
            System.out.println("No item in the stack");
            System.exit(-1);
        }
        int temp_val;
        temp_val = top.value;
        top = top.next;
        return temp_val;
    }
    int top(){
        if (is_empty()) {
            System.out.println("No item in the stack");
            System.exit(-1);
        }
        return top.value;
    }
    boolean is_empty(){
        if(size <= 0){
            return true;
        }
        else{
            return false;
        }
    }
    void printStack(){
        if(!is_empty()){
            Node cur = top;
            System.out.println("Items: ");
            //System.out.println("current value: "+cur.value);
            
            while(cur != null){
                System.out.println(cur.value);
                cur = cur.next;
            }
        }
        else{
            System.out.println("No item in the stack");
        }
    }
}
