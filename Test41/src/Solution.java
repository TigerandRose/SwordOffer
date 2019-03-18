public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 0 || m < 0)
            return -1;

        int[] array = new int[n];
        int i = -1;
        int step = 0;
        int count = n;

        while (count > 0){
            i++;
            if (array[i] == -1)
                continue;
            step ++;
            if (step == m){
                array[i] = -1;
                step = 0;
                count--;
            }
            if (i >= n-1)
                i = -1;
        }
        return i;
    }
}
