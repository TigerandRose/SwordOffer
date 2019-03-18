public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if (array.length == 0)
            return 0;

        int i = 0;
        int count = 0;
        while (i < array.length){
            if (array[i] != k){
                i++;
                continue;
            }
            else{
                count ++;
                if ((i+1)>=array.length || array[i+1] != k)
                    break;
                i++;
            }
        }
        return count;
    }
}
