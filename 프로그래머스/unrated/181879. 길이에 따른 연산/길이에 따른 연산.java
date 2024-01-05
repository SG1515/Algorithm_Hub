class Solution {
    public int solution(int[] num_list) {
        int answer_1 =0;
        int answer_2 =1;
        if (num_list.length >= 11){
            for(int i=0; i<num_list.length; i++){
                 answer_1 += num_list[i];
            }
        } else if(num_list.length <= 10){
            for(int x : num_list){
                 answer_2 *= x ;
            }
        }
        
        if (num_list.length>=11) {
            return answer_1;    
        }else {
            return answer_2;
        }
        
    }
}