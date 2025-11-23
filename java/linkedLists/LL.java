package linkedLists;
// package LinkedList;
// import java.util.*;
// CREATING LINKED LIST FROM SCRATCH 

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null; // for one element
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) { // traverse
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // size
    public int getSize() {
        return size;
    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(9);
        list.addFirst(23);
        list.addFirst(89);
        list.printList();
        list.addLast(69);
        list.addLast(20);

        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}

// IMPLEMENTING LINKEDLIST USING COLLECTIONS INTERFACE

// public class LL{
// public static void main(String[] args) {
// LinkedList<String> list = new LinkedList<String>();
// // only add works similar as addFirst
// list.add("Example");
// list.add("of");

// //adding element at some particular index
// list.add(2, "a");

// // adding element at first index
// list.addFirst("The");
// System.out.println(list);

// // add element at Last index
// list.addLast("Linked");
// list.addLast("List");
// System.out.println(list);

// //printing size
// System.out.println(list.size());

// //removing element from last
// list.removeLast();
// System.out.println(list);

// System.out.println(list.size());
// }
// }
