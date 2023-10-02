Diameter Of Binary Tree

  code----------------------------------

/*************************************************************

 Following is the Binary Tree Node structure:

 class TreeNode<T> {
     public T data;
     public BinaryTreeNode<T> left;
     public BinaryTreeNode<T> right;

     TreeNode(T data) {
         this.data = data;
         left = null;
         right = null;
     }
 }

 *************************************************************/

public class Solution {
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        // Write your code here.
        if (root == null) {
            return 0;
        }
        
        // Calculate the height of the left and right subtrees.
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        // Calculate the diameter of the left and right subtrees.
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        
        // The diameter of the binary tree is the maximum of:
        // 1. Diameter of the left subtree.
        // 2. Diameter of the right subtree.
        // 3. Length of the path passing through the root (leftHeight + rightHeight).
        return Math.max(Math.max(leftDiameter, rightDiameter), leftHeight + rightHeight);

    }
    private static int getHeight(TreeNode<Integer> node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
