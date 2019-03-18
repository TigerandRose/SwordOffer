import java.util.Stack;
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        Stack<TreeNode> stack = new Stack<>();

        TreeNode p = pRootOfTree;  // p为临时节点，用来遍历树的节点，初始值为根节点pRootOfTree
        TreeNode newHead = null;    //创建双向链表的表头
        TreeNode pre = null;            // 用于保存中序遍历序列的上一个节点
        boolean isFirst = true;     //判断是否为左子树链表的第一个节点

        while (p != null || !stack.isEmpty()){
            while (p != null){  // 当节点不是左子树最左边的结点，则进行继续遍历，并将其放入到栈中
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();   // 第一次是左子树最左边的节点（后面的则是当前栈中最优先的节点）
            if (isFirst){       //这里是给左子树最后一个节点使用的
                newHead = p;
                pre = p;
                isFirst = false;
            }else{
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return newHead;
    }
}