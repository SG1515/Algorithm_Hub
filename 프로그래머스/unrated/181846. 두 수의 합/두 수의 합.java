import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        
        
        BigInteger tmpA = new BigInteger(a);
        BigInteger tmpB = new BigInteger(b);
        
        BigInteger sum = tmpA.add(tmpB);
        
        
        String answer = sum.toString();
        return answer ;
    }
}