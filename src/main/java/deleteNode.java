/**
 * @description:
 * @author: chenjianshuo
 * @create: 2021-01-14 12:02
 **/

public class deleteNode {

    public ListNode test(ListNode head, int val) {
        //边界条件判断
        if (head == null)
            return head;
        //如果要删除的是头结点，直接返回头结点的下一个结点即可
        if (head.val == val)
            return head.next;
        ListNode cur = head;
        //找到要删除结点的上一个结点
        while (cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }
        //删除结点
        cur.next = cur.next.next;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
