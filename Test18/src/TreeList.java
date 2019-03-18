import java.util.Stack;

public class TreeList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        if (pRootOfTree.left == null && pRootOfTree.right == null)
            return pRootOfTree;

        TreeNode pre = null;
        TreeNode newHead = null;
        TreeNode p = pRootOfTree;
        Stack<TreeNode> stack = new Stack<>();
        boolean isFirst = true;

        while (p != null || !stack.isEmpty()){
            while (p != null){
                stack.push(p);
                p = p.left;
            }

            p = stack.pop();
            if (isFirst){
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
