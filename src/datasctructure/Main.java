package datasctructure;

public class Main {
    public static void main(String[] args) {

        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);
        newLinkedList.append(5);
        newLinkedList.append(6);
        newLinkedList.append(7);
        newLinkedList.append(8);
        newLinkedList.append(9);
        newLinkedList.append(10);
        newLinkedList.append(11);
        newLinkedList.append(12);
        newLinkedList.append(13);
        newLinkedList.append(14);
        newLinkedList.append(15);


        newLinkedList.printList();

//        System.out.println(newLinkedList.findMiddleNode().value);


        System.out.println(newLinkedList.findMiddleNode().value);

    }
}