import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {
    public ListNode FindKthToTail (ListNode head, int k){
        ListNode pre = head;
        ListNode last = head;

        if (head == null || k<=0){
            return null;
        }

        for (int i = 1; i<k; i++){   //  先将一个指针先走k步
            if (last.next != null){     //为了防止是最后一个元素
                last = last.next;
            }else{
                return null;
            }
        }

        while (last.next != null){ //这样可以满足遍历最后一个元素
            last = last.next;
            pre = pre.next;
        }

        return pre;
    }

    public static void main(String[] args){
        ListNode s1 = new ListNode(5);
        ListNode s2 = new ListNode(4);
        ListNode s3 = new ListNode(3);
        ListNode s4 = new ListNode(2);
        ListNode s5 = new ListNode(1);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;

       System.out.println(new Solution().FindKthToTail(s1, 5).val);
    }
}
