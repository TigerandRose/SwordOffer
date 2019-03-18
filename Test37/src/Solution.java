public class Solution {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        String s = "";
        if (len == 0 || n > len)
            return s;

        char[] ch = str.toCharArray();
        String s1 = "", s2 = "";
        for (int i = 0; i < n; i++)
            s1  += ch[i];
        for (int i = n; i < len; i++)
            s2 += ch[i];

         s = s2 + s1;
        return s;
    }
}
