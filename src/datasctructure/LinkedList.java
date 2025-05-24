package datasctructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LinkedList {
    private Node head;
    private Node tail;
    private int lenght;

    class Node{
        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        lenght = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){

        Node newNodeToAppend = new Node(value);
        if (lenght == 0){
            head = newNodeToAppend;
            tail = newNodeToAppend;
        } else {
            tail.next = newNodeToAppend;
            tail = newNodeToAppend;
        }
        lenght ++;
        System.out.println("Append method called.");
    }

    public Node removeLast(){
        if (lenght == 0 ) return null;
        Node temp = head;
        Node pre = head;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        lenght--;

        if (lenght == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node prepend(int value){
        Node newNodeToPrepend = new Node(value);

        if (lenght == 0) {
            head = newNodeToPrepend;
            tail = newNodeToPrepend;
        }else {
            newNodeToPrepend.next = head;
            head = newNodeToPrepend;
        }
        lenght++;

        return newNodeToPrepend;
    }

    public Node removeFirst(){
        if (lenght == 0) return null;

        Node temp = head;
        head = head.next;

        temp.next = null;
        lenght--;

        if (lenght == 0) tail = null;

        return temp;
    }



    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", lenght=" + lenght +
                '}';
    }
}
