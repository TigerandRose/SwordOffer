public class Solution {
    public static int Fibonacci(int n) {
        int a = 0;

        // 这题关注是否考虑n的有效取值范围
        if (n <= 0){
            return -1;
        }
        if (n == 1 || n == 2){
            a = 1;

        }else {
            a = Fibonacci(n-1) + Fibonacci(n-2);
        }

        return a;
    }

    public static void main(String[] args){
       System.out.println(Solution.Fibonacci(0));
    }
}
