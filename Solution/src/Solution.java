import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        int low = 1;
        int high = 2;
        while (high > low) {
            int temp = (high + low) * (high - low + 1) / 2;

            if (temp == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    list.add(i);
                }
                lists.add(list);
                low++;
            } else if (temp < sum) {
                high++;
            } else {
                low++;
            }
        }
        return lists;
    }
}
