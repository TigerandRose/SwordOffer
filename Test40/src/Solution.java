import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length == 0)
            return false;
        Set<Integer> set = new HashSet<>();

        int max = 0;
        int min = 13;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 0)
                continue;

            if (! set.add(numbers[i]))
                return false;
            if (numbers[i] > 13 || numbers[i] < 0)
                return false;

            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        if (max - min >= 5)
            return false;

        return true;
    }
}
