public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null){
            return null;
        }

        RandomListNode currentNode = pHead;
        while (currentNode != null){ //1.复制每个结点，将复制之后的结点插入到原结点之后
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;

            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }

        //2.重新遍历链表，复制老结点的随机指针
        currentNode = pHead;
        while (currentNode != null){
            RandomListNode cloneNode  = currentNode.next;
            cloneNode.random = currentNode.random == null? null: currentNode.random.next;

            currentNode = currentNode.next.next;
        }

        //3.拆分链表
        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (currentNode != null){
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            currentNode = currentNode.next;

        }
        return pCloneHead;
    }
}
