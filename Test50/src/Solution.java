public class Solution {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null || pHead.next == null)
            return pHead;

        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode pre = head;
        ListNode last = head.next;

        while (last != null){
            if (last.next != null && last.next.var == last.var){
                while (last.next!= null && last.next.var == last.var){ //因为使用到next code的变量，因此需要注意判断是否为空值
                    last = last.next;
                }
                pre.next = last.next;
                last = last.next;
            }else{
                pre = pre.next;
                last = last.next;
            }
        }

        return head.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(4);
        ListNode l8 = new ListNode(4);
        ListNode l9 = new ListNode(4);
        ListNode l10 = new ListNode(5);
        ListNode l11 = new ListNode(5);
        ListNode l12 = new ListNode(6);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;
        l11.next = l12;

        new Solution().deleteDuplication(l1);
    }
}
