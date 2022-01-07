package Top100;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo demo0094inorderTraversal
 * 二叉树的中序遍历
 *
 * @author sunlianyu
 * @date 1月05日 16:29
 */
public class demo0094inorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> res = new ArrayList<Integer>();

    public List<Integer> inorderTraversal1(TreeNode root) {
        if (root==null) {
            return new ArrayList<Integer>();
        }
        inorderTraversal1(root.left);
        res.add(root.val);
        inorderTraversal1(root.right);
        return res;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal1(root);
    }

    public static void main(String[] args) {

    }
}
