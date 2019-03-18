public class NewMergeSort {
    public void sort(int[] arrays){
        if (arrays.length == 0)
            return ;

        mergeSort(arrays, 0,  arrays.length-1);
    }

    public void mergeSort(int[] arrays, int start, int end){
        int mid = (start + end)>>1;

        if (start < end){
            mergeSort(arrays, start, mid);
            mergeSort(arrays, mid+1, end);
            merge(arrays, start, mid, end);
        }
    }

    public void merge(int[] arrays, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[end-start+1];

        while (i<=mid && j<=end){
            if (arrays[i] > arrays[j]){
                temp[k++] = arrays[j++];
            }else {
                temp[k++] = arrays[i++];
            }
        }

        while (i <= mid){
            temp[k++] = arrays[i++];
        }
        while (j <= end){
            temp[k++] = arrays[j++];
        }

        for (i=0; i<temp.length; i++){
            arrays[start+i] = temp[i];
        }
    }

    public static void main(String[] args){
        NewMergeSort ms = new NewMergeSort();
        int[] arrys = {4,6,5,2,3,7,9};

        ms.sort(arrys);
        for (int i = 0; i < arrys.length; i++){
            System.out.println(arrys[i]);
        }
    }
}
