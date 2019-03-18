import java.util.ArrayList;
import java.util.Stack;

public class ArrayListTest {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            //listNode 表示下一个结点
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (! stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ArrayListTest a1 = new ArrayListTest();
        System.out.println(a1.printListFromTailToHead(l1));

    }
}
