/**
 *  平衡二叉树
 */
public class Solution {
    boolean isBalanceTree = true;

    public boolean IsBalanced_Solution(TreeNode root) {
            if (root == null)
                return isBalanceTree;
            deep(root);

            return isBalanceTree;
    }


    public int deep(TreeNode root){
        if (root == null)
            return 0;

        if (isBalanceTree == false)  //这里添加这句话，是为了节省空间和时间，若是发现了则返回上次循环，而不需要向下执行
            return 0;

        int left = deep(root.left);
        int right = deep(root.right);

        if ((left - right) > 1 || (left - right) < -1)
                isBalanceTree = false;
        return Math.max(left, right)+1 ;
    }
}
