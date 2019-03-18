public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
      if (sequence.length == 0)
          return false;
      if (sequence.length == 1)
          return true;

      return ju(sequence, 0, sequence.length-1);
    }

    public boolean ju(int[] sequence, int start, int end){
//        当递归迭代结束时，左指针大于或等于右指针
        if (start >= end)
            return true;

        int i = end-1;
        while (sequence[i] > sequence[end] && i>start){
            i--;
        }

        for (int j=start; j<i; j++){
            if (sequence[j] > sequence[end]){
                return false;
            }
        }

        return ju(sequence, 0, i-1)&&ju(sequence, i, end-1);
    }
}
