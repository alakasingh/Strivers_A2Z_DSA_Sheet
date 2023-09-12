Introduction To Linked List
code-------------------------------------------------
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
    public static Node constructLL(int []arr) {

       
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Create the head of the linked list with the first element of the array
        Node head = new Node(arr[0]);
        Node current = head; // Use a current pointer to keep track of the last node

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Create a new node with the current array element
            Node newNode = new Node(arr[i]);

            // Link the current node to the new node
            current.next = newNode;

            // Update the current pointer to the new node
            current = newNode;
        }

        // Return the head of the linked list
        return head;
    

   

        
    }
}
