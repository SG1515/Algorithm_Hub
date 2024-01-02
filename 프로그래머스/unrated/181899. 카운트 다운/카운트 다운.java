class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[Math.abs(start - end_num) +1];
        int num = start;
        for(int i=0; i< answer.length; i++){
            answer[i] = num;
                if (start > end_num){
                    num--;
                } else {
                    num++;
                }
                
        }
        return answer;
    }
}