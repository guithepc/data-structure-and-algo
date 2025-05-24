package datasctructure;

public class Main {
    public static void main(String[] args) {

        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);

        newLinkedList.get(3);
//
//        newLinkedList.set(2, 9);
        newLinkedList.setBoolean(2,9);

        newLinkedList.printList();




    }
}