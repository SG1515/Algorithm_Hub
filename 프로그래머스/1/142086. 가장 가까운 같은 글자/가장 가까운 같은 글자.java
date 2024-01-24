import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            answer[i] = i - map.getOrDefault(c, i+1);
            map.put(c, i);
            
            
        }
        return answer;
    }
}