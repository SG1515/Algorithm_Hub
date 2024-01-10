import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
   // 마지막 5개 요소 추출
        for(int i=0; i<5; i++){
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}