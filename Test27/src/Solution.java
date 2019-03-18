public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String str = "";

        if (numbers.length == 0){
            return str;
        }

        for (int i=0; i<numbers.length-1; i++){
            for (int j=i+1; j<numbers.length; j++){
                int a = Integer.parseInt(String.valueOf(numbers[i])  + String.valueOf(numbers[j]));
                int b = Integer.parseInt(String.valueOf(numbers[j])  + String.valueOf(numbers[i]));
                if (a > b){
                    swap(numbers, i, j);
                }
            }
        }

        for (int i=0; i<numbers.length; i++){
            str += String.valueOf(numbers[i]);
        }

        return str;
    }

    public void swap(int[] numbers, int i, int j){
        int temp;
        temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
