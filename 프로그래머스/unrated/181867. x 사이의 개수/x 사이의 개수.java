class Solution {
    public int[] solution(String myString) {
        String[] tmp = {};
        tmp = myString.split("x", myString.length());
        int[] answer = new int[tmp.length];
        
        for(int i=0; i<tmp.length; i++){
            answer[i] = tmp[i].length();
        }
        
        return answer;
    }
}