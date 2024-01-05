class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i=0; i<strArr.length; i++){
            String tmp = "";
            if(i % 2 == 0) {
                tmp = strArr[i];
                answer[i] = tmp.toLowerCase();
            }else {
                tmp = strArr[i];
                answer[i] = tmp.toUpperCase();
            }
        }
        
        return answer;
    }
}