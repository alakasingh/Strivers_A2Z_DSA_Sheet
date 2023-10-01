Tree Traversals

  code----------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;

/*class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}*/

public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();

        inOrderTraversal(root, inOrder);
        preOrderTraversal(root, preOrder);
        postOrderTraversal(root, postOrder);

        result.add(inOrder);
        result.add(preOrder);
        result.add(postOrder);

        return result;
    }

    private static void inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left, list);
        list.add(node.data);
        inOrderTraversal(node.right, list);
    }

    private static void preOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.data);
        preOrderTraversal(node.left, list);
        preOrderTraversal(node.right, list);
    }

    private static void postOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left, list);
        postOrderTraversal(node.right, list);
        list.add(node.data);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Get and print the tree traversals
        List<List<Integer>> traversals = getTreeTraversal(root);
        System.out.println("In-order traversal: " + traversals.get(0));
        System.out.println("Pre-order traversal: " + traversals.get(1));
        System.out.println("Post-order traversal: " + traversals.get(2));
    }
}
