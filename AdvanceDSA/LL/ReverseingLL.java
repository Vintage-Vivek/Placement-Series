package AdvanceDSA.LL;

public class ReverseingLL {
    private int size;

    ReverseingLL() {
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

    public void reverseList() {

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;

            // connect backways
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public Node reverseListRecursive(Node head) {
        // empty node || last node or only node 
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        ReverseingLL list = new ReverseingLL();

        list.addLast("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("List");

        list.printList();

        // list.reverseList();
        // list.head = list.reverseListRecursive(list.head);
        
        list.printList();





    }
}
