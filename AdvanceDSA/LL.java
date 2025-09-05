package AdvanceDSA;

public class LL {

    private int size;

    LL() {
        this.size = 0;
    }

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Printing list
    public void printList () {
        if(head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // Delete first and last 

    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        size--;

        if(head.next == null) {
            head = null;
            return;
        }

        // Node secondLast = head;
        // Node lastNode = head.next;

        // while(lastNode.next != null) {
        //     lastNode = lastNode.next;
        //     secondLast = secondLast.next;
        // }
        // secondLast.next = null;

        Node secondLast = head;
        while(secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("a");
        list.addFirst("is");

        list.addLast("list");

        list.addFirst("This");

        list.deleteFirst();

        list.deleteLast();

        list.printList();

        int size = list.getSize();
        System.out.println(size);
    }
}
