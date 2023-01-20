public class Node {
    Node next;
    User user;
    public Node(User user) {
        this.next = null;
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
