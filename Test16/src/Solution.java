import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0)
            return false;

        Stack<Integer> s = new Stack<Integer>();
        int popLength = 0;

        for (int i = 0; i < pushA.length; i++){
            s.push(pushA[i]);

            while(!s.isEmpty() && s.peek() == popA[popLength] ){
                s.pop();
                popLength ++;
            }
        }
        return s.isEmpty();
    }
}
