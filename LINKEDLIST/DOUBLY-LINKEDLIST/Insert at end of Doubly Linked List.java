Insert at end of Doubly Linked List

  code------------------------------------------

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
    public static Node insertAtTail(Node list, int K) {
        // Write your code here
         Node newNode = new Node(K);
        
        // If the list is empty, make the new node the head
        if (list == null) {
            return newNode;
        }
        
        // Traverse the list to find the current tail node
        Node current = list;
        while (current.next != null) {
            current = current.next;
        }
        
        // Set the new node as the next node of the current tail
        current.next = newNode;
        
        return list;
    }
} 
