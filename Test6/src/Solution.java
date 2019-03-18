/**
 * 旋转数组的最小数字：
 *      若中间数小于最后一个元素值，则说明该中间数处于第二个数组中，最小值在中间值的前面
 *      若中间数大于最后一个元素值，则说明该中间数处于第一个数组中，最小值在中间值的后面
 *      若中间数等于最后一个元素值，则将最后一个元素往前移动一个位置
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right){ // 这里的判断条件是当两个指针的位置相同的时候则迭代结束
            int mid = (left + right) / 2;       //mid的坐标靠近前者
            if (array[mid] > array[right]){     //  这里跟最后的一个元素比较，是因为后面的数字序列没有发生改变
                left = mid + 1;                      // 最小值在第二个数组中，因此可以使用left+1
            }else if(array[mid] < array[right]){
                right = mid;                           // 因此，相应的调整右边界的时候是包含mid
            }else{      //若出现相同的数字的时候，则进行移动
                right --;
            }
        }
        return array[left];
    }

    public static void main(String[] args){
        int[] arr = {1,0,1,1,1};
        System.out.print(new Solution().minNumberInRotateArray(arr));
    }
}