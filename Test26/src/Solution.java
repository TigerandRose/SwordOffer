public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n == 0)
            return 0;

        int count = 0;
       for (int i = n; i > 0; i--){
           int temp = i;
           while (temp > 0){
               if (temp % 10 == 1){
                   count ++;
               }
               temp = temp / 10;
           }
       }

       return count;
    }
}
