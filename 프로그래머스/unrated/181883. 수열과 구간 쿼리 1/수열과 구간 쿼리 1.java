import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);
        
        for(int i=0; i<queries.length; i++){
            int q1 = queries[i][0];
            int q2 = queries[i][1];
            
            for(int j=q1; j<=q2; j++){
                answer[j]++;
                
            }
            
        }

        return answer;
    }
}