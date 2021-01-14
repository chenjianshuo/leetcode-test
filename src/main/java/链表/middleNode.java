package 链表;

/**
 * @description:求链表的中间结点
 * @author: chenjianshuo
 * @create: 2021-01-14 17:48
 **/

public class middleNode {

    public ListNode test(ListNode head){
        ListNode fast = head;
        ListNode slow  = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
