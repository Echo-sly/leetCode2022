package Top100;

/**
 * Demo demo0203removeElements
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。😢
 * @author sunlianyu
 * @date 2022年1月10日 23:38
 */
public class demo0203removeElements {
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
     * 用到了一个虚拟的头节点！！
     * 非常方便😉
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode ghosthead = new ListNode(0);
        ghosthead.next = head;
        ListNode temp = ghosthead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return ghosthead.next;
    }
}
