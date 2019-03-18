/**
 * 二维数组的查找
 *  2019/1/3
 */

public class Solution {
    public boolean Find(int target, int [][] array) {
        int len = array.length - 1;
        int i = 0;

        while (len >= 0 && i < array[0].length){
            if (array[len][i] > target){
                len --;
            }else if (array[len][i] < target){
                i ++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int [][] a = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
        Boolean c = new Solution().Find(3, a);
        System.out.println(c);
    }
}
