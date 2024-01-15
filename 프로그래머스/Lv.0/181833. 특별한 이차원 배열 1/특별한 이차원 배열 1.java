class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        //초기화 전부 0
        
        for(int i=0; i<n; i++) {
            answer[i][i] = 1;
            }
        
        return answer;
    }
}