Delete Last Node of a Doubly Linked List

  code------------------------------------------------

Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node deleteLastNode(Node head) {
        // Write your code here
         if (head == null || head.next == null) {
            // If the list is empty or has only one node, return null
            return null;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Update the next reference of the second-to-last node to null
        current.next = null;

        return head;
    }
}
