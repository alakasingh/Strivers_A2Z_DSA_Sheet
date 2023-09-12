Delete Node Of Linked List

  code-----------------------------------
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

public class Solution {
    public static Node deleteLast(Node list){
        // Write your code here
         if (list == null || list.next == null) {
            return null; // Return null to indicate an empty list
        }

        Node current = list;
        Node prev = null;

        // Traverse the list until the last node is reached
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        // Set the next of the second-to-last node to null
        prev.next = null;

        return list; // Return the updated list
    }
}
