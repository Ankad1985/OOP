import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedListContainer<Integer> myList = new LinkedListContainer<>();
        myList.addLast(1);
        myList.addFirst(99);
        myList.addLast(7);
        myList.addLast(4);
        System.out.println(myList.size());
        System.out.println("First: " + myList.getElementByIndex(0));
        System.out.println("--------------- All-----------");

        for (int item: myList) {
            System.out.println(item);
        }

        LinkedListContainer<Integer> integerLinkedGrades = new LinkedListContainer<>();
        integerLinkedGrades.addLast(99);
        integerLinkedGrades.addFirst(1);
        integerLinkedGrades.addLast(78);
        integerLinkedGrades.addLast(100);
        System.out.println("--------------- From end to begin-----------");
        Iterator iterator = integerLinkedGrades.descendingIteratror();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}