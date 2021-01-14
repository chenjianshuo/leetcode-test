import org.junit.jupiter.api.Test;

/**
 * @description:合并两个有序连表
 * @author: chenjianshuo
 * @create: 2021-01-14 12:07
 **/

public class MergeTwoLists {
    @Test
    public  void main() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(5);
        node1.next.next.next = new ListNode(5);
        ListNode listNode = mergeTwoLists2(node1,node);


    }

    /**
     * 递归
     * @param l1
     * @param l2
     * @return
     */

    public ListNode mergeTwoListestts(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        else if(l1.val<l2.val){
            l1.next = mergeTwoListestts(l1.next,l2);
            return l1;
        }
        else {
            l2.next = mergeTwoListestts(l1,l2.next);
            return l2;
        }
    }
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode preHead=new ListNode(-1);

        ListNode temp=preHead;
        while(l1!=null && l2 !=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }else {
                temp.next=l2;
                l2=l2.next;
            }

            temp=temp.next;
        }

        temp.next =  l1==null?l2:l1;
        return preHead.next;
    }

    public ListNode mergeTwoList3(ListNode l1, ListNode l2){
        ListNode prev = new ListNode(-1);
        ListNode t = prev;
        while (l1 != null && l2 != null) {
         if(l1.val<l2.val){
             t.next = l1;
             l1 = l1.next;
         }else {
            t.next = l2;
            l2 = l2.next;
         }
         t = t.next;

        }
        t.next = l1==null?l2:l1;
        return prev.next;
    }



}
