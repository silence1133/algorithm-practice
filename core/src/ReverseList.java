/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Silence 000996
 * @data 2021-03-10
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        //用于记录前一个节点
        ListNode prev = null;
        //当前节点，用于移动
        ListNode curr = head;
        while (curr != null) {
            //先把当前节点的下一个节点缓存起来
            ListNode temp = curr.next;
            //改变当前节点的下一个节点指向前一个节点
            curr.next = prev;
            //往后移动prev
            prev = curr;
            //当前节点移动到原来缓存的节点（相当于按原链表方向往后移动）
            curr = temp;
        }
        //这里要返回prev，因为上面的wile，curr会指向null
        return prev;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
