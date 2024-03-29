/**
 *  二叉树的镜像
 *       采用的是从上往下递归
 */
public class Solution {
    public void Mirror(TreeNode root) {
            TreeNode temp;
            if  (root != null){
                temp = root.left;
                root.left = root.right;
                root.right = temp;

                if (root.left != null)
                    Mirror(root.left);
                if (root.right != null)
                    Mirror(root.right);
            }
    }
}
