import java.util.ArrayList;

public class Solution {
    private  ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    private ArrayList<Integer> list1 = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return listAll;

        list1.add(root.val);
         if (root.right == null && root.left == null && root.val == target){
             listAll.add(new ArrayList<Integer>(list1));
         }

         if (root.left != null ){
             FindPath(root.left, target-root.val);
         }
         if (root.right != null ){
             FindPath(root.right, target-root.val);
         }
         list1.remove(list1.size() - 1); //回退父节点

         return listAll;
    }

    public static  void main (String[] args){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(11);
        TreeNode t3 = new TreeNode(5);
        //TreeNode t4 = new TreeNode(7);
        TreeNode t5 = new TreeNode(0);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(1);

        t1.left = t2;
        t1.right = t3;
       // t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        list2 = new Solution().FindPath(t1, 14);
        for (ArrayList s : list2){
           System.out.println(s.toString());
        }
    }
}
