class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] sArr = number.split("");
        int tmp =0;
        for(int i=0; i<number.length(); i++){
            tmp += Integer.parseInt(sArr[i]);
        }
        
        answer = tmp%9;
        
        return answer;
    }
}