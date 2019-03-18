import java.util.ArrayList;

public class Solution1 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum){
        ArrayList<Integer> list = new ArrayList<>();

         if (array.length == 0)
             return list;

         int i = 0;
         int j = array.length - 1;
         while (i < j){
             int result = array[i] + array[j];
             if ( result == sum){
                 list.add(array[i]);
                 list.add(array[j]);
                 break;
             }else if (result > sum){
                 j--;
             }else{
                 i++;
             }
         }

         return list;
    }
}
