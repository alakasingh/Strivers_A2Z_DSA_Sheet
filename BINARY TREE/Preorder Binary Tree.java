Preorder Binary Tree

  code-----------------------------------------------------------
  /*
	
	Following the structure used for Binary Tree
	
	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */

public class Solution {

	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null) {
            return;
        }

        // Process or print the current node's data
        System.out.print(root.data + " ");

        // Recursively traverse the left subtree
        preOrder(root.left);

        // Recursively traverse the right subtree
        preOrder(root.right);
	}

}
