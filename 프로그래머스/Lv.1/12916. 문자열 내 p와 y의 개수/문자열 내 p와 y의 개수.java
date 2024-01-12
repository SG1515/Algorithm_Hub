class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int cntY =0;
        int cntP =0;
        for(int i=0; i<c.length; i++){
            if(c[i] == 'p'){
                cntP++;
            } else if (c[i] == 'y'){
                cntY++;
            }
        }
        answer = (cntP == cntY) ? true : false;
        
        
        return answer;
    }
}