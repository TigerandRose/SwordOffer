import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();

        if (str.length() == 0)
            return list;
        fun(str.toCharArray(), list, 0);
        Collections.sort(list);
        return list;
    }

    public void fun(char[] ch, ArrayList<String>list, int i){
        if (i == ch.length-1){
            if (! list.contains(new String(ch))){
                list.add(new String(ch));
                return ;
            }
        }else{
            for (int j = i; j < ch.length; j++){
                swap(ch, i, j);
                fun(ch, list, i+1);
                swap(ch, i, j);
            }
        }
    }

    public void swap(char[] ch, int i, int j){
        char t;
        t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
    }
}
