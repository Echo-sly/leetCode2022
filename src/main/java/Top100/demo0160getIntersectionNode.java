package Top100;

/**
 * Demo demogetIntersectionNode
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * @author sunlianyu
 * @date 1月04日 18:45
 */
public class demo0160getIntersectionNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
        /**
         * 一个特别有意思的写法😊
         * 链表A的长度m m=a+b
         * 链表B的长度n n=a+c
         * 找到a+b+c的点即为相交的点 找不到即为不相交
         * @param headA 链表
         * @param headB 链表
         * @return 相交的节点
         */
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            ListNode nodeA = headA;
            ListNode nodeB = headB;
            while (nodeA != nodeB) {
                nodeA = nodeA == null ? headB : nodeA.next;
                nodeB = nodeB == null ? headA : nodeB.next;
            }
            return nodeA;
        }
    }
}
