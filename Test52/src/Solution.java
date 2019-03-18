import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        if (pRoot == null)
            return lists;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        int layers = 1;
        q1.offer(pRoot);

        while (! q1.isEmpty() || ! q2.isEmpty()){
            if (layers % 2 != 0){
                ArrayList<Integer> temp = new ArrayList<>();
                while (! q1.isEmpty()){
                    TreeNode newNode = q1.poll();
                    temp.add(newNode.val);
                    System.out.print(newNode.val);
                    if (newNode.left != null)
                        q2.offer(newNode.left);
                    if (newNode.right != null)
                        q2.offer(newNode.right);
                }
                if (! temp.isEmpty()){
                    lists.add(temp);
                    layers ++;
                    System.out.print("\n");
                }
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                while (! q2.isEmpty()){
                    TreeNode newNode = q2.poll();
                    temp.add(newNode.val);
                    System.out.print(newNode.val);
                    if (newNode.left != null)
                        q1.offer(newNode.left);
                    if (newNode.right != null)
                        q1.offer(newNode.right);
                }
                if (! temp.isEmpty()){
                    lists.add(temp);
                    layers ++;
                    System.out.print("\n");
                }
            }
        }
        return lists;
    }
}
