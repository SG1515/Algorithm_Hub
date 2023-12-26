import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int num = 0;
        String[] tmp = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            
            tmp[i] = my_string.substring(num, my_string.length());
            num++;
        }

        Arrays.sort(tmp);

        return tmp;
    }
}