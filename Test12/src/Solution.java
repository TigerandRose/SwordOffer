/**
 *  合并两个排序的链表
 *          采用递归的方法：
 *                 按照顺序选取两个链表的元素值，将值较小的指针向后移
 *                 同时，返回较小值所在的链表
 *                 递归终止条件：若某一个链表为空，则返回另一个链表
 */
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
       if (list1 == null)
           return list2;
       if (list2 == null)
           return list1;

       if (list1.val < list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
       }else{
           list2.next = Merge(list1, list2.next);
           return list2;
       }
    }

    public void showList(ListNode head){
        ListNode current = head;
        while (current.next != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println(current.val);
    }

    public static void main(String[] args) {
        ListNode s1 = new ListNode(1);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(3);
        ListNode s4 = new ListNode(4);
        ListNode s5 = new ListNode(5);

        ListNode s11 = new ListNode(1);
        ListNode s21 = new ListNode(2);
        ListNode s31 = new ListNode(3);
        ListNode s41 = new ListNode(4);
        ListNode s51 = new ListNode(5);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;

        s11.next = s21;
        s21.next = s31;
        s31.next = s41;
        s41.next = s51;

        Solution s = new Solution();
        ListNode newHead = s.Merge(s1, s11);
        s.showList(newHead);
    }
}
