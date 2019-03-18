public class Solution {
    boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null)
            return true;

        return comRoot(pRoot.left, pRoot.right);
    }

    public boolean comRoot(TreeNode left, TreeNode right){
        if (left == null)
            return right == null;
        if (right == null)
            return false;

        if (left.val != right.val)
            return false;

        return comRoot(left.left, right.right) && comRoot(left.right, right.left);
    }
}
