Reverse Linked List(recursion)

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

public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
         Node prev = null; // Initialize a pointer to the previous node (starts as null).
        Node current = head; // Start with the head of the original list.

        while (current != null) {
            Node nextNode = current.next; // Store the next node temporarily.
            current.next = prev; // Reverse the pointer of the current node.

            // Move both pointers one step forward.
            prev = current;
            current = nextNode;
        }

        // After the loop, 'prev' will be pointing to the new head of the reversed list.
        return prev;
    }
}

  
