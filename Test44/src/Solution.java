import java.util.ArrayList;

public class Solution {
    public int StrToInt(String str) {
        char[] ch = str.toCharArray();
        int len = ch.length;

        if (len == 0)
            return  0;

        boolean flag = true;
        ArrayList<Integer> list = new ArrayList<>();
        if (ch[0] == '+'){
            flag = true;
        }else if (ch[0] == '-'){
            flag = false;
        } else if (ch[0] >= '0' && ch[0] <= '9'){
            list.add(ch[0] - '0');
        }else {
            return 0;
        }

        for (int i = 0; i < len; i++){
            if (ch[i] >= '0' && ch[i] <= '9'){
                list.add(ch[i] - '0');
            }else{
                return 0;
            }
        }

        int num = 0;
        int size = list.size();
        int wei = 1;
        for (int j = size-1; j >= 0; j--){
            num += list.get(j)*wei;
            wei *= 10;
        }

        if (! flag)
            num = - num;
        return num;
    }
}
