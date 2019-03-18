public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int i;
        int len = array.length;
        int[] arrayCopy = new int[len];
        boolean[] isChoose = new boolean[len];

        for (i=0; i < len; i++){
            isChoose[i] = false;
        }

        int j = 0;
        while (j < len){
            for (i=j; i < len; i++){
                if (  isChoose[i] == false && array[i] == array[j]){
                    isChoose[i] = true;
                    arrayCopy[j]  ++;
                }
            }
            j++;
        }

        int maxIndex = 0;
        for (i=0; i<len; i++){
            if (arrayCopy[i] > (len/2)){
               maxIndex = i;
               break;
            }
        }
        return array[maxIndex];
    }

    public static void main(String[] args){
        Solution s = new Solution();
        int[] a = {1,2,3,2,2,2,5,4,2};

        int maxNum = s.MoreThanHalfNum_Solution(a);
        System.out.println(maxNum);
    }
}
