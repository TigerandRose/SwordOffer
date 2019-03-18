public class Solution {
    public void reOrderArray(int [] array) {
        int len = array.length;
        int[] orderArr = new int[len];

        int i = 0;
        for (int s: array){
            orderArr[i] = s;
            i ++;
        }

        int j = 0;
        for (i=0; i<len; i++){
            if (array[i] % 2 != 0) {
                array[j] = orderArr[i];
                j++;
            }
        }

        for (i=0; i<len; i++){
            if (orderArr[i] % 2 == 0){
                array[j] = orderArr[i];
                j ++;
            }
        }


    }

    public static  void main(String[] args){
        int [] a = {1,2,3,4,5,6};
        new Solution().reOrderArray(a);
        for(int s : a){
            System.out.print(s);
        }
    }
}