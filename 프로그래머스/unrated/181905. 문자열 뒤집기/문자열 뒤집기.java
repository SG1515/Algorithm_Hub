import java.util.Arrays;
class Solution {
    
    public String solution(String my_string, int s, int e) {
        String tmp = "";
        StringBuilder sb = new StringBuilder();
        tmp = my_string.substring(s,e+1);
        sb.append(tmp).reverse();
        
        String tmp2 = sb.toString();

        String answer = my_string.substring(0, s) + tmp2 + my_string.substring(e+1, my_string.length());
        
        return answer;
    }
}