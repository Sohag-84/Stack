package Stack;

public class Node {
    int value;
    Node next;
    Node(int value){
        this.value = value;
        this.next = null;
    }
    Node(int value,Node node){
        this.value = value;
        this.next = node;
    }
}
