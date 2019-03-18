public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)
            return null;

        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);
        int len;
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;

        if (len1 > len2){
            len = len1 - len2;
            if (len > 0){
                while (len > 0){
                    head1 = head1.next;
                    len--;
                }
            }

        }else{
            len = len2 - len1;
            if (len > 0){
                while (len > 0){
                    head2 = head2.next;
                    len--;
                }
            }
        }
        while (head1.var != head2.var){
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1;

    }

    public int getLength(ListNode pHead){
        ListNode newNode = pHead;
        int len = 0;
        while (newNode != null){
            len++;
            newNode = newNode.next;
        }
        return len;
    }
}
