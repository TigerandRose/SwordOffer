import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        int layer = 1;
        s1.push(pRoot);

        while (!s1.isEmpty() ||  !s2.isEmpty()){
            if (layer % 2 != 0){
                ArrayList<Integer> temp = new ArrayList<>();
                while (! s1.isEmpty()){
                    TreeNode newNode = s1.pop();
                    if (newNode != null){
                        temp.add(newNode.val);
                        System.out.print(newNode.val + " ");
                        s2.add(newNode.left);
                        s2.add(newNode.right);
                    }
                }

                if (! temp.isEmpty()){// 重要
                    list.add(temp);
                    layer ++;
                    System.out.println();
                }

            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                while (! s2.isEmpty()){
                    TreeNode newNode = s2.pop();
                    if (newNode != null){
                        temp.add(newNode.val);
                        System.out.print(newNode.val + " ");
                        s1.add(newNode.right);
                        s1.add(newNode.left);
                    }
                }
                if (! temp.isEmpty()){
                    list.add(temp);
                    layer ++;
                    System.out.println();
                }
            }
        }
        return list;
    }
}
