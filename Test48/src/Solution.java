public class Solution {
    int[] hashTable = new int[128];
    StringBuffer str = new StringBuffer();

    public void Insert(char ch){
        str.append(ch);
        hashTable[ch] ++;
    }

    public char FirstAppearingOnce(){
        char[] ch = str.toString().toCharArray();

        for (char c : ch){
            if (hashTable[c] == 1)
                return c;
        }

        return '#';
    }
}
