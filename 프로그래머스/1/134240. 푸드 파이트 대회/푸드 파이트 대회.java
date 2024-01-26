class Solution {
    public String solution(int[] food) {
        String answer = "";
        int firstFood = 0;

        for(int i=0; i<food.length; i++){
            if(food[i] % 2 == 1) {
                food[i] = food[i] -1;
            }
            
            for(int j=0; j<food[i]/2; j++){
                answer += ""+ firstFood;
            }
            
            firstFood++;
        }
        
        answer += "" + 0; //하드코딩 해도 되지않을까..?
        firstFood--;
        for(int i=food.length-1; i>0; i--){
            if(food[i] % 2 == 1) {
                food[i] = food[i] -1;
            }
            
            for(int j=0; j<food[i]/2; j++){
                answer += ""+ firstFood;
            }
            
            firstFood--;
        }
        
        return answer;
    }
}