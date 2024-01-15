class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        
        while (num <= n*n){
            //왼쪽에서 오른쪽
            for(int i=colStart; i<=colEnd; i++){
                answer[rowStart][i] = num++;
            }
            rowStart++;
            
            //위에서 아래쪽
            for(int i=rowStart; i<= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--;
            
            //오른쪽에서 왼쪽
            for(int i=colEnd; i>=colStart; i--){
                answer[rowEnd][i] = num++;
            }
            rowEnd--;
            
            //아래에서 위로
            for(int i=rowEnd; i>=rowStart; i--){
                answer[i][colStart] = num++;
            }
            colStart++;
            
        }
        
        
        return answer;
    }
}