Reverse A Doubly Linked List

  code----------------------------------------

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

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
         if (head == null || head.next == null) {
            // If the list is empty or has only one node, no need to reverse
            return head;
        }

        Node current = head;
        Node temp;

        while (current != null) {
            // Swap the prev and next pointers of the current node
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
             // Move to the next node
            head = current; // Update the head to the current node

            current = current.prev;
        }

        return head;
    }
}
