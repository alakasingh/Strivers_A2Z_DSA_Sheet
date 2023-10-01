Inorder Traversal

  code----------------------------------------------

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> getInOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    private static void inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        // Recursively traverse the left subtree
        inOrderTraversal(node.left, list);

        // Process or add the current node's value to the list
        list.add(node.data);

        // Recursively traverse the right subtree
        inOrderTraversal(node.right, list);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Perform in-order traversal and get the list of nodes
        List<Integer> inOrderTraversalList = getInOrderTraversal(root);

        // Print the in-order traversal result
        System.out.println("In-order traversal: " + inOrderTraversalList);
    }
}
