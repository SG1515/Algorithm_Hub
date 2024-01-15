class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = new int[][]{};

        
        int rowLength = arr.length;
        int colLength = arr[0].length;
        
        if(rowLength == colLength) {
            answer = new int[rowLength][rowLength];
        } else if (rowLength > colLength){
            answer = new int[rowLength][rowLength];
        } else {
             answer = new int[colLength][colLength];
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}