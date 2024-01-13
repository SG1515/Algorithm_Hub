import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] % divisor == 0){
                list.add(arr[i]);
                cnt++;
            }
        }
        
        if(cnt == 0) {
            int[] answer = new int[]{-1};
            return answer ;
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}