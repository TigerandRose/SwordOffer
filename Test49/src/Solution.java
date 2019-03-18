public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        ListNode fastNode = pHead;
        ListNode lowNode = pHead;

        while (fastNode.next != null && lowNode != null){
                fastNode = fastNode.next.next;  //不使用if语句，是因为初始值都为头指针
                lowNode = lowNode.next;


            if (fastNode == lowNode){
                ListNode p = pHead;
                while (p != fastNode){
                    p = p.next;
                    fastNode = fastNode.next;
                }
                return  p;
            }
        }

        return null;
    }
}
