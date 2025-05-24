package datasctructure;

public class Main {
    public static void main(String[] args) {

        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);

        newLinkedList.insert(2, 6);
        newLinkedList.insert(3, 7);
        newLinkedList.insert(4, 8);

        newLinkedList.printList();




    }
}