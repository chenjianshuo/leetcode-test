package 链表;

import org.junit.jupiter.api.Test;

/**
 * @description:删除链表的倒数第N个节点
 * @author: chenjianshuo
 * @create: 2021-01-14 18:00
 **/

public class RemoveNthFromEnd {

    @Test
    public  void main() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode node1 = removeNthFromEnd1(node,2);

    }
    public ListNode test(ListNode head,int n){
        ListNode dum = new ListNode(0,head);
        ListNode cur = dum;
        int length = getLength(head);
        int a = length - n +1;
        for (int i = 1; i < a; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
     return dum.next;
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }



    public int getLength(ListNode head){
        int length = 0;
        while (head!=null){
            ++length;
            head = head.next;
        }
        return length;
    }
}
