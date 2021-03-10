/**
 * 给定一个链表，判断链表中是否有环。
 *
 * @author Silence 000996
 * @data 2021-03-10
 */
public class ListHasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        //fast需要取后一个目的是为了保证下面的while
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
