package model;
public class Node <E>{
    Node next;
    E node;
    public Node(E node) {
        this.next = null;
        this.node = node;
    }

    public E getNode() {
        return node;
    }
    
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
