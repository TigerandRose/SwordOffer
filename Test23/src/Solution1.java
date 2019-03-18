public class Solution1 {
    public int FindGreatestSumOfSubArray(int[] array){
        if (array.length == 0){
            return 0;
        }

        int f = array[0];
        int res = array[0];
        for (int i=1; i< array.length; i++){
            f = Math.max(f+array[i], array[i]);
            res = Math.max(res, f);
        }
        return res;
    }
}
