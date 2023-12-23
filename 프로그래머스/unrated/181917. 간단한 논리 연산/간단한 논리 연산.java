
class Solution {
    
    public Boolean solution(Boolean x1, Boolean x2, Boolean x3, Boolean x4) {
        Boolean answer;
        // V = 하나라도 T면 T 
        // ^ = 하나라도 F면 F 
        
        Boolean tmp1 = true;
        Boolean tmp2 = true;

        if (x1 == true && x2 == true)
            tmp1 = true;
            else if (x1 == true && x2 != true)
            tmp1 = true;
            else if (x1 != true && x2 == true)
            tmp1 = true;
            else 
            tmp1 = false;

        
        if (x3 == true && x4 == true)
            tmp2 = true;
            else if (x3 == true && x4 != true)
            tmp2 = true;
            else if (x3 != true && x4 == true)
            tmp2 = true;
            else 
            tmp2 = false;
        Boolean result = true;
        
        if (tmp1 == true && tmp2 == true)
            result = true;
            else if (tmp1 == true && tmp2 != true)
            result = false;
            else if (tmp1 != true && tmp2 == true)
            result = false;
            else 
            result = false;
    
        answer = result;
        return answer;
    }
}