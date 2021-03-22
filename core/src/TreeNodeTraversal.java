import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的左中右序遍历
 *
 * 94. 二叉树的中序遍历
 *
 *
 * @author Silence 000996
 * @data 2021-03-21
 */
public class TreeNodeTraversal {

    /**
     * 中序遍历（左中右）
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        // 递归出口
        if (node == null) {
            return;
        }
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    /**
     * 前序遍历（根左右）
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        preorder(root,result);
        return result;
    }

    //根左右
    private void preorder(TreeNode node,List<Integer> result){
        if(node == null){
            return;
        }
        result.add(node.val);
        preorder(node.left,result);
        preorder(node.right,result);
    }


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
}
