public class Solution {
    public String LeftRotateString(String str,int n){
        int len = str.length();
        if (len==0 || n >len)
            return str;

         String s1 = swap(str, 0, n-1);
         String s2 = swap(s1, n, len-1);
         str = swap(s2, 0, len-1);

         return str;
    }

    public String swap(String str, int star, int end){
        char[] ch = str.toCharArray();

        int i = star;
        int j = end;
        while (i < j){
            char temp;
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        String s = new String(ch);
        return s;
    }
}
