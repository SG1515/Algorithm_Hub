class Solution {
    boolean solution(String s) {
        int cntOpen = 0;
        int cntClose = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                cntOpen++;
            } else if (s.charAt(i) == ')'){
                cntClose++;
            }
            if (cntOpen < cntClose) {
                return false;
            }
        }
        if(cntOpen == cntClose){
            return true;
        }
        return false;
    }
}