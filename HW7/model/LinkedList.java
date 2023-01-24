package model;
import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>{
    private Node head;
    private  int countUsers;
    public LinkedList(){
    }
    public void add(E node)
    {
        if (head == null) {
            head = new Node(node);
        }
        Node userTemp = new Node(node);
        Node userCurrent = head;
        if (userCurrent != null) {
            while (userCurrent.getNext() != null) {
                userCurrent = userCurrent.getNext();
            }
            userCurrent.setNext(userTemp);
        }
        countUsers++;
    }

    public E get(int index)
    {
        if (index < 0)
            return null;
        Node <E> userCurrent = null;
        if (head != null) {
            userCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (userCurrent.getNext() == null)
                    return null;
                userCurrent = userCurrent.getNext();
            }
            return userCurrent.getNode();
        }
        return userCurrent.getNode();
    }

    public String toString() {
        String str = "";
        if (head != null) {
            Node<E> userCurrent = head.getNext();
            while (userCurrent != null) {
                str +=  userCurrent.getNode().toString() + ";\n";
                userCurrent = userCurrent.getNext();
            }
        }
        return str;
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;
            private Node<E> userCurrent = head;
            @Override
            public boolean hasNext() {
                return index < countUsers;
            }

            @Override
            public E next() {
                userCurrent = userCurrent.getNext();
                index++;
                return userCurrent.getNode();
            }
            
        };
    }

    public void remove(E node){
        Node<E> temp = head;
        //Node<E> prev = head;
        if (node == temp.getNode())
        {
            head = head.getNext();
            
        }
        else{
            for(; temp.getNext() != null; temp = temp.getNext()){
                if(temp.getNext().getNode().equals(node)){
                    temp.setNext(temp.getNext().getNext());
                    break;
                }
            }
        }
        countUsers--;
        
    }
    
}
