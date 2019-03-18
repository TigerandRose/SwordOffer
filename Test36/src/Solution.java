import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
            ArrayList<Integer> list = new ArrayList<>();

            if (array.length == 0){
                return list;
            }

            for (int i = 0; i < array.length; i++){
                for (int j = i+1; j < array.length; j++){
                    if (array[i] + array[j] == sum){
                        list.add(array[i]);
                        break;
                    }
                }
            }

            if (list.size() == 0)
                return list;
            if (list.size() == 1){
                int num2 = sum - list.get(0);
                list.add(num2);
                return list;
            }

            int result = (sum - list.get(0)) * list.get(0);
            int flag = 0, s, temp;
            for (int i = 1; i < list.size(); i++){
                s = list.get(i);
                temp = (sum-s) * s;
                if (temp < result){
                    result = temp;
                    flag = i;
                }
            }

            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(list.get(flag));
            list1.add(sum-list.get(flag));

            return list1;
    }
}
