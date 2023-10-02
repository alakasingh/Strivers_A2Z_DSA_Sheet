Height of Binary Tree

  code-----------------------------------------

  /************************************************************

 Following is the TreeNode class structure

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

public class Solution {
    public static int heightOfBinaryTree(TreeNode root) {
        // Write your code here.
        if (root == null) {
            return 0;
        }
        
        // Recursively calculate the height of the left and right subtrees.
        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        
        // The height of the binary tree is the maximum of the left and right subtree heights,
        // plus 1 for the root node itself.
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
