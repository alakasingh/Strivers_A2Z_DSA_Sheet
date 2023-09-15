Find length of Loop

  code------------------------------------------
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
 };

 *****************************************************************/

public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
         Node slow = head;
        Node fast = head;
        boolean hasCycle = false;
        int length = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle) {
            // If a cycle is detected, count the length of the loop.
            do {
                  slow = slow.next;
                length++;
            } while (slow != fast);
        }

        return hasCycle ? length : 0;
    }
}
