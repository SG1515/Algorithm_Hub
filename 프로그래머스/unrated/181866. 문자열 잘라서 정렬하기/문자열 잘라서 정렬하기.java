import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        
        String[] tmp = myString.split("x");
        for(int i=0; i<tmp.length; i++){
            if(!tmp[i].isEmpty()){
                list.add(tmp[i]);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        
        Arrays.sort(answer);
        return answer;
    }
}