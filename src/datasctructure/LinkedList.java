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

    public Node get(int index){
        if (index < 0 || index > lenght) return null;
        Node temp = head;

        for (int i =0; i < index; i ++){
            temp = temp.next;
        }
        return temp;

    }

    public Node set (int index, int value){
        Node temp = head;
        Node pre = head;

        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        pre = temp;

        pre.value = value;
        return pre;
    }

    public boolean setBoolean (int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert (int index, int value){
        if (index < 0 || index > lenght) return false;

        if (index == lenght){
            this.append(value);
            return true;
        }

        if (index == 0){
            this.prepend(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = head;
        Node prev = head;

        for (int i = 0; i < index; i++){
            prev = temp;
            temp = temp.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        lenght++;
        return true;
    }

    public Node remove (int index){
        Node node = this.get(0);
        if(node == null) return null;

        if (index == 0 ) return removeFirst();
        if (index == lenght-1) return removeLast();

        Node temp = head;
        Node prev = head;
        for (int i = 0; i < index; i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        temp.next = null;
        lenght --;

        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;

        for (int i = 0; i < lenght; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public Node findMiddleNode(){

        if (head == null) return null;

        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public boolean isLoop(){
        if (head == null) return false;

        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
            fast = fast.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public Node findKthFromEnd(int k){
        Node fast = head;
        Node slow = head;
        int count = 0;

        for (int i = 0; i < k; i ++){
            if (fast == null){
                return null;
            } else {
                fast = fast.next;
            }
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
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
