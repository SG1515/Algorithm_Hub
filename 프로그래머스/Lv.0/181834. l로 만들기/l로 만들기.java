class Solution {
    public String solution(String myString) {
        String answer = "";
        int tmp =0;
        char[] c = myString.toCharArray();
        for(int i=0; i<c.length; i++){
            if(c[i] < 'l'){
                c[i] = 'l';
            }
        }
        
        
        answer = String.valueOf(c);
        
        
        return answer;
    }
}