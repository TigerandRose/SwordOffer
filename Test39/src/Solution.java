public class Solution {
    public String ReverseSentence(String str){
        char[] ch = str.toCharArray();
        int len = ch.length;
        if (len == 0)
            return str;

        swap(ch, 0,  len-1);
        int kongGe = -1;
        for (int i =0; i < len; i++){
            if (ch[i] == ' '){
                int nextKongGe = i;
                swap(ch, kongGe+1, nextKongGe-1);
                kongGe = nextKongGe;
            }
        }
        swap(ch, kongGe+1, len-1);
        return new String(ch);
    }

    public void swap(char[] ch, int i, int j){
        char temp;

        while (i < j){
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
    }
}
