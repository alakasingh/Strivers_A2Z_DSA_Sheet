Cycle Detection in a Singly Linked List

  code----------------------------------------------

  Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one node, there can be no cycle.
        }

        Node slow = head; // Slow pointer moves one step at a time.
        Node fast = head; // Fast pointer moves two steps at a time.

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step.
            fast = fast.next.next; // Move fast pointer two steps.

            if (slow == fast) {
                return true; // If there's a cycle, the slow and fast pointers will meet.
            }
        }

        return false; // If fast reaches the end of the list, there is no cycle.
    }
}
