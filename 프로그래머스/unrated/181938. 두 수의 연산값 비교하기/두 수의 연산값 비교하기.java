class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stA = Integer.toString(a);
        String stB = Integer.toString(b);
        
        int sumAB = Integer.parseInt(stA+stB);
        
        if(sumAB > 2 * a * b )
            answer = sumAB;
        else if (2 * a * b > sumAB)
            answer = 2 * a * b;
        else if (sumAB == 2 * a * b)
            answer = sumAB;
        
        
        return answer;
    }
}