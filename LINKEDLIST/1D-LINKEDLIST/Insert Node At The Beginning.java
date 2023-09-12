Insert Node At The Beginning
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
    public static Node insertAtFirst(Node list, int newValue) {
        // Write your code here
        
     

        Node newNode = new Node(newValue);
        if (list == null) {
            // If the list is empty, the new node becomes both head and tail.
            list = newNode;
        } else {
            // If the list is not empty, update the next pointer of the new node
            // to point to the current head and then update the head to the new node.
            newNode.next = list;
            //list.prev = newNode;
            list = newNode; // Update the head reference to the new node.
        }
        return list;

    }
}
