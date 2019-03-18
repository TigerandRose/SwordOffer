public class Solution1 {
    public int InversePairs(int [] array) {
        if (array.length == 0)
            return 0;

        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }

        int count = InversePairsSort(array,  temp,0, array.length - 1);

        return count ;
    }

    public int InversePairsSort(int[] array, int[] temp,  int start, int end){
        if (start == end) {
            return 0;
        }

        int mid = (start + end) >> 1;
        int left = InversePairsSort(array, temp,  start, mid) % 1000000007;
        int right = InversePairsSort(array,  temp, mid+1, end) % 1000000007;

//        int[] temp = new int[end-start+1];
        int count = 0;
        int i = mid;
        int j = end;
        int k = end;

        while (i>=start && j>= mid+1){
            if (array[i] > array[j]){
                count += j- mid;
                temp[k--] = array[i--];
                if (count >= 1000000007)
                    count %= 1000000007;
            }else{
                temp[k--] = array[j--];
            }
        }

        while (i >= start){
            temp[k--] = array[i--];
        }
        while (j >= mid+1){
            temp[k--] = array[j--];
        }

        for(i = start; i <= end; i++){
            array[i] = temp[i];
        }

        return (left+right+count) % 1000000007;
    }
}
