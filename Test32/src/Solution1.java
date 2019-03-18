public class Solution1 {
    public int GetNumberOfK(int [] array , int k){
        if (array.length == 0)
            return  0;

        int first = getFistK(array,0, array.length-1, k);
        int last = getLastK(array, 0, array.length-1, k);
        System.out.println(first + " " + last);

        int count = 0;
        if (first != -1 && last != -1){
            count = last - first + 1;
        }
        return count;
    }

    public int getFistK(int[] arrays, int start, int end, int key){
        if (start > end){
            return -1;
        }

        int mid = (start + end) >> 1;
        if (arrays[mid] > key){
             return getFistK(arrays, start, mid-1, key);
        }else if (arrays[mid] < key){
             return getFistK(arrays, mid+1, end, key);
        }else if ( arrays[mid]==key && mid>=1 && arrays[mid-1] == key){
            return getFistK(arrays, start, mid-1, key);
        }else{
            return mid;
        }
    }

    public int getLastK(int[] arrays, int start, int end, int key){
        while (start <= end){
            int mid = (start + end)>>1;
            if (mid+1 <= end && arrays[mid+1] == key && arrays[mid] == key){
                start = mid + 1;
            }else if (arrays[mid] > key){
                end = mid - 1;
            }else if (arrays[mid] < key){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Solution1 s1 = new Solution1();
        int[] arrays = {3,3,3,3,3,4,5};

        int count = s1.GetNumberOfK(arrays,3);
        System.out.println(count);
    }
}
