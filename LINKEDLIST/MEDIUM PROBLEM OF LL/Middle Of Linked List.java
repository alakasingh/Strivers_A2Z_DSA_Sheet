Middle Of Linked List

  code-----------------------------------------

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
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        if (head == null) {
            return null; // If the list is empty, there is no middle node.
        }

        Node slowPointer = head;
        Node fastPointer = head;

        // Move the fast pointer two steps at a time and the slow pointer one step at a time.
        // When the fast pointer reaches the end of the list, the slow pointer will be at the middle.
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
}
