package datasctructure;

public class Main {
    public static void main(String[] args) {

        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);

        System.out.println(newLinkedList.removeFirst().value);
        System.out.println(newLinkedList.removeFirst().value);
        System.out.println(newLinkedList.removeFirst());




    }
}