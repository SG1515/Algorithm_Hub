import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1); //초기값 -1로 채워넣기
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s; j<=e; j++){
                if(j % k == 0)
                    arr[j]++;
            }
            

            
            
        }
        
        
        
        return arr;
    }
}