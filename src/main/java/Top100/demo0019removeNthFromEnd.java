package Top100;

/**
 * Demo demo0019removeNthFromEnd
 *
 * @author sunlianyu
 * @date 1月04日 20:35
 */
public class demo0019removeNthFromEnd {

    public class ListNode {
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

    /**
     * 双指针找到那个倒数第k的节点！😁
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode fast = head;
        ListNode slow = res;
        for (int i = 0; i < n; ++i) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        ListNode ans = res.next;
        return ans;
    }
}
