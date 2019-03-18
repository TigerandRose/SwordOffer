import java.util.ArrayList;

public class Solution {
    public boolean isNumeric(char[] str){
        boolean sign = false, decimal = false, hasE = false;

        for (int i = 0; i < str.length; i++){
            if (str[i] == 'E' || str[i] == 'e'){
                if (i == str.length-1)
                    return false;
                if (hasE)
                    return false;
                hasE = true;
            }else if (str[i] == '+' || str[i] == '-'){
                if (! sign && i > 0 && str[i-1] != 'E' && str[i-1] != 'e')
                    return false;
                if (sign && str[i-1] != 'E' && str[i-1] != 'e')
                    return false;
                sign = true;
            }else if (str[i] == '.'){
                if (hasE || decimal)
                    return false;
                decimal = true;
            }else if (str[i] < '0' || str[i] > '9'){
                return false;
            }
       }
        return  true;
    }

}
