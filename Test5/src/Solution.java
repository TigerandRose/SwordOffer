import java.util.Stack;

public class Solution {

    private Stack<Integer> s1 = new Stack<>() ;
    private Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args){
        Solution st = new Solution();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }

    public void push(int data){
        s1.push(data);
    }

    public int pop(){
        if (s1.empty() && s2.empty()){
            throw new RuntimeException("空栈异常");
        }
        if (s2.empty()){
            while ( ! s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
