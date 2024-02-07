class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int card1 = 0;
        int card2 = 0;
        int idx1 = cards1.length;
        int idx2 = cards2.length;
        
        for(int i=0; i<goal.length; i++){
            String str = goal[i];
            if(card1 < idx1 && str.equals(cards1[card1])){
                card1++;
            } else if(card2 < idx2 && str.equals(cards2[card2])){
                card2++;
            } else {
                answer = "No";
            }
            
        }
        
        
        
        
        return answer;
    }
}