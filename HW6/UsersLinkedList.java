import java.util.Iterator;

public class UsersLinkedList implements Iterable<User>{
    private Node head;
    private  int countUsers;
    public UsersLinkedList(){
    }
    public void add(User user)
    {
        if (head == null) {
            head = new Node(user);
        }
        Node userTemp = new Node(user);
        Node userCurrent = head;
        if (userCurrent != null) {
            while (userCurrent.getNext() != null) {
                userCurrent = userCurrent.getNext();
            }
            userCurrent.setNext(userTemp);
        }
        countUsers++;
    }

    public User get(int index)
    {
        if (index < 0)
            return null;
        Node userCurrent = null;
        if (head != null) {
            userCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (userCurrent.getNext() == null)
                    return null;
                userCurrent = userCurrent.getNext();
            }
            return userCurrent.getUser();
        }
        return userCurrent.getUser();
    }

    public String toString() {
        String str = "";
        if (head != null) {
            Node userCurrent = head.getNext();
            while (userCurrent != null) {
                str +=  userCurrent.getUser().toString() + ";\n";
                userCurrent = userCurrent.getNext();
            }
        }
        return str;
    }
    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            private int index = 0;
            private Node userCurrent = head;
            @Override
            public boolean hasNext() {
                return index < countUsers;
            }

            @Override
            public User next() {
                userCurrent = userCurrent.getNext();
                index++;
                return userCurrent.getUser();
            }
            
        };
    }
    
}
