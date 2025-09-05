package AdvanceDSA;

class DeleteCycle {

    // Represents a node in the linked list
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    ListNode head;

    /**
     * This is the main function where you can write your solution.
     * It detects and removes a cycle in the linked list.
     *
     * @param head The head of the linked list.
     */
    public void detectAndRemoveCycle(ListNode head) {

        // this is my code that doesnt handle a edge case but it works well hihi

        
        if(head==null || head.next==null) {
            return;
        }
        ListNode hare = head;
        ListNode turtle = head;

        while(hare!=null && hare.next!=null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle){
                break;
            }
        }
        turtle = head;
        while (hare.next != turtle.next) {
            hare = hare.next;
            turtle = turtle.next;
        }

        hare.next = null;

    }

    // Utility function to print the linked list
    void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteCycle list = new DeleteCycle();
        list.head = new ListNode(50);
        list.head.next = new ListNode(20);
        list.head.next.next = new ListNode(15);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(10);

        // Create a loop for testing
        // The last node (10) points back to the node with data 15
        list.head.next.next.next.next.next = list.head.next.next;

        // System.out.println("Linked List before removing cycle:");
        // This would print indefinitely if there's a cycle, so we don't call it.

        System.out.println("Detecting and removing the cycle...");
        list.detectAndRemoveCycle(list.head);

        System.out.println("Linked List after removing cycle:");
        list.printList(list.head);
    }
}



/*
 if (head == null || head.next == null) {
            return;
        }

        // 1. Detect the cycle using Floyd's Tortoise and Hare algorithm
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast pointers meet, a cycle is detected
            if (slow == fast) {
                break;
            }
        }

        // 2. If a cycle was found, remove it
        if (slow == fast) {
            // Reset one pointer to the head
            slow = head;

            // If the cycle starts at the head itself
            if (slow == fast) {
                 while(fast.next != slow) {
                     fast = fast.next;
                 }
            } else {
                // Move both pointers one step at a time until they meet again.
                // The meeting point is the start of the loop.
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }


            // 3. Remove the cycle
            // `fast` is now at the last node of the cycle.
            // Set its `next` pointer to null to break the cycle.
            fast.next = null;
        }
 */

 /*

 this one is less tricky and easy to understand


          if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        // 1. Find the meeting point inside the cycle.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break; // Cycle detected
            }
        }

        // 2. If a cycle was found (slow and fast met)
        if (slow == fast) {
            // Reset the slow pointer to the head of the list.
            slow = head;

            // 3. Move both pointers one step at a time. The point where they meet
            // again is the start of the loop.
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            // Now, `slow` is at the start of the loop.

            // 4. To remove the loop, we need the node right before the start of the loop.
            // We can traverse from the start until we find it.
            while (fast.next != slow) {
                fast = fast.next;
            }

            // 5. `fast` is now the last node in the cycle. Break the cycle.
            fast.next = null;
        }
  */