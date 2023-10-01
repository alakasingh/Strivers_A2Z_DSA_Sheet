Level Order Traversal

  code-------------------------------------------------

  import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/
public class Solution {
    public static List<Integer> levelOrder(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<Integer> current = queue.poll();
            result.add(current.data);

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);

        // Perform level-order traversal and get the list of nodes
        List<Integer> levelOrderTraversalList = levelOrder(root);

        // Print the level-order traversal result
        System.out.println("Level-order traversal: " + levelOrderTraversalList);
    }
}
