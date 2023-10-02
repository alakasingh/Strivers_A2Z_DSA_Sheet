Is Height Balanced Binary Tree

  code-----------------------------------------
/*************************************************************

     Following is thr TreeNode class structure

     class BinaryTreeNode<T>
     {
         T data;
         BinaryTreeNode<T> left;
         BinaryTreeNode<T> right;

         BinaryTreeNode(T data) {
             this.data = data;
             left = null;
             right = null;
         }
     };

 *************************************************************/
public class Solution {
    public static boolean isBalancedBT(TreeNode<Integer> root) {
        // Write your code here.
        // Base case: If the tree is empty (root is null), it is height-balanced.
        if (root == null) {
            return true;
        }

        // Calculate the height of the left and right subtrees.
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // Check if the current subtree is balanced and both left and right subtrees are balanced.
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalancedBT(root.left) && isBalancedBT(root.right)) {
            return true;
        }
        // If any of the above conditions is not met, the tree is not height-balanced.
        return false;
    }

    // Helper function to calculate the height of a binary tree.
    private static int getHeight(TreeNode<Integer> node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}

  
