package datasctructure;

public class Main {
    public static void main(String[] args) {

        LinkedList newLinkedList = new LinkedList(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);
        newLinkedList.append(5);
        newLinkedList.append(6);


        newLinkedList.printList();

//        System.out.println(newLinkedList.findMiddleNode().value);


        System.out.println(newLinkedList.findMiddleNode().value);

    }
}