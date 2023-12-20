class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] charC = control.toCharArray();
        for(int i=0; i< control.length(); i++){
            if(charC[i] == 'w')
                answer += 1;
            else if(charC[i] == 's')
                answer -= 1;
            else if(charC[i] == 'd')
                answer += 10;
            else if(charC[i] == 'a')
                answer -= 10;
        }
        
        return answer;
    }
}