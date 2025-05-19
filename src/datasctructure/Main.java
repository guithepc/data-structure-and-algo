package datasctructure;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);

        newLinkedList.printList();

        System.out.println(newLinkedList.removeLast());



    }
}