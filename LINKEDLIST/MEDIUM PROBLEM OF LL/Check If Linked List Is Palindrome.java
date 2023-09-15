Check If Linked List Is Palindrome

  code--------------------------------------

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
    public static boolean isPalindrome(Node head) {
        // write your code here

        
        if (head == null || head.next == null) {
            return true; // Empty list or list with a single node is a palindrome.
        }
        
        // Step 1: Find the middle of the linked list using the slow and fast pointers.
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse the second half of the linked list.
        Node secondHalf = reverse(slow);
        
        // Step 3: Compare the first half with the reversed second half.
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false; // Not a palindrome.
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true; // It's a palindrome.
    }
    
    // Helper function to reverse a linked list.
    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev; // The new head of the reversed list.
    }
}
