Create Binary Tree

  code----------------------------------------
/*class Node {
    public int data;
    public Node left;
    public Node right;

    Node() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
*/
public class Solution {
    public static Node createTree(int[] arr) {
        return createTreeFromArray(arr, 0);
    }

    // Recursive function to build the tree
    private static Node createTreeFromArray(int[] arr, int index) {
        // Base case: If the index is out of bounds or the current element is -1, return null.
        if (index >= arr.length || arr[index] == -1) {
            return null;
        }

        // Create a new node with the current element from the array.
        Node newNode = new Node(arr[index]);

        // Recursively create the left and right subtrees.
        newNode.left = createTreeFromArray(arr, 2 * index + 1);
        newNode.right = createTreeFromArray(arr, 2 * index + 2);

        return newNode;
    }

    // Function to print the tree in-order (for testing purposes)
   
    

  
}

  
