class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String intA = Integer.toString(a);
        String intB = Integer.toString(b);

        String sumAtoB = intA+intB;
        String sumBtoA = intB+intA;
        
        int resultAtoB = Integer.parseInt(sumAtoB);
        int resultBtoA = Integer.parseInt(sumBtoA);
        
        if (resultAtoB > resultBtoA )
            answer = resultAtoB;
        else
            answer = resultBtoA;
        
        
        
        return answer;
    }
}