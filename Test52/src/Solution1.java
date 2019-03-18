import java.util.ArrayList;

public class Solution1 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        if (pRoot == null){
            return lists;
        }
        depth(pRoot, 1, lists);
        return lists;
    }

    public void depth(TreeNode root, int layers, ArrayList<ArrayList<Integer>> lists){
        if (root == null)
            return ;
        if (layers > lists.size())
            lists.add(new ArrayList<>());
        lists.get(layers-1).add(root.val);

        depth(root.left, layers+1, lists);
        depth(root.right, layers+1, lists);
    }
}
