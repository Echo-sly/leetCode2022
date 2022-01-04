package Top100;

/**
 * Demo demo0021mergeTwoLists
 *
 * @author sunlianyu
 * @date 1月04日 18:09
 */
public class demo0021mergeTwoLists {

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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode merged = head;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                merged.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                merged.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            merged = merged.next;
        }
        while (l1 != null) {
            merged.next = new ListNode(l1.val);
            l1 = l1.next;
            merged = merged.next;
        }
        while (l2 != null) {
            merged.next = new ListNode(l2.val);
            l2 = l2.next;
            merged = merged.next;
        }
        return head.next;
    }
}
