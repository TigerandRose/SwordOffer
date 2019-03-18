/**
 * 这里使用前序和后序来构造二叉树
 *  注意事项:
 *        这里使用了递归算法实现算法迭代，通过限定每个子树的范围来进行递归
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0)
            return null;
        return ConstructCore(pre, in, 0,pre.length-1, 0, in.length-1);
    }

    /**
     * 使用递归的方式构造二叉树
     */
    public TreeNode ConstructCore(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd){
        TreeNode root = new TreeNode(pre[preStart]);        //根节点
        root.leftNode = null;
        root.rightNode = null;  //左右节点均初始化为null

        if (preStart == preEnd && inStart == inEnd){
            return root;
        }

        //通过前序遍历序列所得到的根节点在中序遍历节点的位置
        int rootInorder = 0;
        for ( rootInorder=inStart; rootInorder<inEnd; rootInorder++){
            if (pre[preStart] == in[rootInorder]){
                break;
            }
        }

        //开始分割左右子树
        //左子树长度
        int leftChildLength = rootInorder - inStart;
        //右子树长度
        int rightChildLength = inEnd - rootInorder;

        //开始构建左右子树
        //构建左子树
        if (leftChildLength > 0){
            root.leftNode = ConstructCore(pre, in, preStart+1, preStart+leftChildLength,
                                                              inStart, rootInorder-1);
        }
        //构建右子树
        if (rightChildLength > 0){
            root.rightNode = ConstructCore(pre, in, preStart+leftChildLength+1, preEnd,
                                                                rootInorder+1, inEnd);
        }

        return root;
    }

    //后序遍历
    public void postOrder(TreeNode current){
        if (current == null)
            return ;

        postOrder(current.leftNode);
        postOrder(current.rightNode);
        System.out.print(current.val + " ");
    }

    public static void main(String[] args){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] end = {4,7,2,1,5,3,8,6};
        TreeNode newTree = null;

        Solution s1 = new Solution();
        newTree = s1.reConstructBinaryTree(pre, end);

        System.out.println("后序遍历:");
        s1.postOrder(newTree);
    }
}
