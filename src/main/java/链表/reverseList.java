package 链表;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

/**
 * @description:反转连表
 * @author: chenjianshuo
 * @create: 2021-01-13 16:57
 **/

public class reverseList {

    @Test
    public  void test() {
     ListNode node = new ListNode(1);
     node.next = new ListNode(2);
     node.next.next = new ListNode(3);
     node.next.next.next = new ListNode(4);
        reverseList1(node);
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode t ;
        while (cur!= null){
           t = cur.next;
           cur.next = pre;
           pre = cur;
           cur = t;
        }
        return pre;
    }

    public ListNode reverseList1(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode t = null;
        while (cur != null){
            t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }
        return pre.next;
    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }




}
