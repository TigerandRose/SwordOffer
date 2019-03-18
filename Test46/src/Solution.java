public class Solution {
    public boolean match(char[] str, char[] pattern){
        if (str.length == 0 || pattern.length == 0){
            return false;
        }

        return fun(str, pattern, 0, 0);
    }

    public boolean fun(char[] str, char[] pattern, int strPost, int patternPost){
        if (strPost == str.length && patternPost == pattern.length)
            return true;
        if (strPost != str.length && patternPost == pattern.length)
            return false;

        if (pattern[patternPost+1] == '*'){
            if ((str[strPost] == pattern[patternPost]) || ((pattern[patternPost] == '.') && (strPost != str.length))){
                return fun(str, pattern, strPost+1, patternPost+2) ||
                           fun(str, pattern, strPost+1, patternPost) ||
                           fun(str, pattern, strPost, patternPost+2);
            }else{
                return fun(str, pattern, strPost, patternPost+2);
            }
        }

        if ((str[strPost] == pattern[patternPost]) || ((pattern[patternPost] == '.') && (strPost != str.length))){
            return fun(str, pattern, strPost+1, patternPost+1);
        }

        return false;
    }
}
