/**
 *  功能：使用递归方法实现二分查找
 */
public class HalfSearch {
    public boolean halfSearch(int[] arrays, int key){
        if (arrays.length == 0)
            return false;
        return fastSearch(arrays, 0, arrays.length-1, key);
    }

    public boolean fastSearch(int[] arrays, int start, int end, int key){
        if (start == end){
            if (arrays[start] == key){
                return true;
            }else
                return false;
        }

        int mid = (start + end)>>1;
        if (arrays[mid] > key)
            return fastSearch(arrays, start, mid-1, key);
        else if (arrays[mid] < key){
            return fastSearch(arrays, mid+1, end, key);
        }else{
            return true;
        }
    }

    public static  void main(String[] args){
        HalfSearch hs = new HalfSearch();
        int[] arrays = {1, 2, 3 , 4, 5};

        System.out.println(hs.halfSearch(arrays, 3));
    }
}
