import java.util.ArrayList;
import java.util.List;

/**
 *
 * 590. N 叉树的后序遍历
 *
 * 给定一个 N 叉树，返回其节点值的 后序遍历 。
 *
 * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 *
 *
 * @author Silence 000996
 * @data 2021-03-21
 */
public class NThreeNode {

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        doPostorder(root, result);
        return result;
    }

    public void doPostorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        for (Node n : node.children) {
            doPostorder(n, result);
        }
        result.add(node.val);
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;


}
