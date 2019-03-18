public class StringBufferTest {
    public String replaceSpace(StringBuffer str) {
        if (str == null){
            return null;
        }
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c == ' '){
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args){
        StringBuffer s1 = new StringBuffer("I Love You");
        System.out.println(new StringBufferTest().replaceSpace(s1));
    }
}
