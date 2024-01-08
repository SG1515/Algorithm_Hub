class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] tmp = binomial.split(" ");
        
        int num1 = Integer.parseInt(tmp[0]);
        int num2 = Integer.parseInt(tmp[2]);
        
        if(tmp[1].equals("+")) 
            answer = num1 + num2;
        else if(tmp[1].equals("-")) 
            answer = num1 - num2;
        else if(tmp[1].equals("*")) 
            answer = num1 * num2;
            
        
        
        return answer;
    }
}