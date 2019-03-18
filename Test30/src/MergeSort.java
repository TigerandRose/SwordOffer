/**
 *  算法：归并排序
 *          利用递归的算法将整个数组分割成两个子数组，直到子数组的长度为1时停止；(分)
 *          将分割后的子数组进行整合在一起，将元素值较小的值放在复制数组的最前面，依次类推（治）
 *  这里使用了分治法的思想
 *
 */
public class MergeSort {
    public void sort(int[] array){
        if (array.length == 0)
            return ;
        mergeSort(array, 0, array.length-1);
    }

    public void mergeSort(int[] array, int start, int end){
        int mid = (start + end) / 2;
        if (start < end){
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end); //相当于这两个步骤一起进行（因为递归相当于进栈，所以看做两个步骤）
            merge(array, start,  mid,  end);
        }
    }

    public void merge(int[] array, int start, int mid, int end){
        int[] copyArray = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i<mid+1 && j<=end){
            if (array[i] > array[j]){
                copyArray[k++] = array[j];
                j++;
            }else{
                copyArray[k++] = array[i];
                i++;
            }
        }

        while (i < mid+1){
            copyArray[k++] = array[i++];
        }
        while (j <= end){
            copyArray[k++] = array[j++];
        }

        for (i=0; i < copyArray.length; i++){
            array[i+start] = copyArray[i];  // 这里注意拷贝的过程中需要下标
        }
    }

    public static void main(String[] args){
        MergeSort ms = new MergeSort();
        int[] arrys = {4,6,5,2,3,7,9};

        ms.sort(arrys);
        for (int i = 0; i < arrys.length; i++){
            System.out.println(arrys[i]);
        }
    }
  }
