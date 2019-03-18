/**
 *  反转链表
 *         考虑当前节点的前节点，将当前节点指向前节点，为了处理链表断裂的情况，使用一个指针用来
 *         保存当前节点的后一个指针，从而保证了遍历。
 *
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
            ListNode preNode = null;
            ListNode nextNode = null;

            if (head == null){
                return null;
            }

            while (head != null){ //若当前节点不为空，则进行循环
                nextNode = head.next;
                head.next = preNode;
                preNode = head;
                head  = nextNode;
            }

            return preNode;
    }

    public static void main(String[] args){
        ListNode s1 = new ListNode(1);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(3);
        ListNode s4 = new ListNode(4);
        ListNode s5 = new ListNode(5);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;

       System.out.println(new Solution().ReverseList(s1).val) ;
    }
}
