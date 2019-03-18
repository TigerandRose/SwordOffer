/**
 *   数组中只出现一次的数字
 */
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length == 0)
            return ;
        if (array.length == 2){
            num1[0] = array[0];
            num2[0] = array[1];
            return ;
        }

        int temp = 0; //0与任何数异或结果都是本身
        for (int i = 0; i < array.length; i++){
            temp ^= array[i];
        }

        int index = findFirstIndex(temp);
        for (int i =0; i < array.length; i++){
            if (isBit1(array[i], index)){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
    }

    public int findFirstIndex(int temp){
        int index = 0;
        while (((temp & 1) == 0)  && index < 32){
            temp = temp >> 1;
            index ++;
        }

        return index;
    }

    public boolean isBit1(int num, int index){
        return ((num>>index) & 1) == 1;
    }
}
