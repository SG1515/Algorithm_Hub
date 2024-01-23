class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        //전체 갯수 
        int total = brown + yellow;
        
        for(int i=1; i<=total; i++){
            int row = i; //행, 세로
            int col = total / row; //열, 가로
            
            // 세로가 길면 돌아가기. 카펫의 가로길이는 세로길이보다 같거나 김
            if (row > col) {
                continue;
            }
            
            // 가로와 세로 모두 노란색을 감싸기 위해서는
            // 상하좌우 각각 1개씩, 즉 세로 -2 가로 -2가 노란색과 같아야함.
            if((row-2) * (col-2) ==yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
            
            
        }
        
        return answer;
    }
}