public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str.isEmpty())
            return -1;

        int firtNum = -1;
        char[] ch = str.toCharArray();
        for (int i = 0; i< ch.length-1; i++){
            int j;
            for (j = 0; j<ch.length; j++){
                if (j == i)
                    continue;
                if (ch[i] == ch[j]){
                    break;
                }
            }
            if (j == ch.length){
                firtNum = i;
                break;
            }
        }
        return firtNum;
    }
}
