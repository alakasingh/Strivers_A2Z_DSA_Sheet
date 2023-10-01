Postorder Traversal

  code----------------------------------------------------

import java.util.ArrayList;
import java.util.List;

/*class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public TreeNode(T x) {
        this.data = x;
        this.left = null;
        this.right = null;
    }

    public TreeNode(T x, TreeNode<T> left, TreeNode<T> right) {
        this.data = x;
        this.left = left;
        this.right = right;
    }
}*/

public class Solution {
    public static List<Integer> postorderTraversal(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }

    private static void postOrderTraversal(TreeNode<Integer> node, List<Integer> list) {
        if (node == null) {
            return;
        }

        // Recursively traverse the left subtree
        postOrderTraversal(node.left, list);

        // Recursively traverse the right subtree
        postOrderTraversal(node.right, list);

        // Process or add the current node's value to the list
        list.add(node.data);
    }

    
}
