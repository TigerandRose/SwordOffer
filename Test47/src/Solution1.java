public class Solution1 {
    public static  void main(String args[]){
        String s = "df";
        System.out.println(s.length());
        char[] ch = s.toCharArray();
        System.out.println(ch.length);
        for (char c : ch){
            System.out.println(c);
        }
    }
}
