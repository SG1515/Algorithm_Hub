class Solution {
    public int solution(int[] arr1, int[] arr2) {
       int answer = 0;
        if (arr1.length ==arr2.length ){
            int tmp1 = 0;
            int tmp2 = 0;
            for(int i=0; i<arr1.length; i++){
                tmp1 += arr1[i];
            }
            for(int i=0; i<arr2.length; i++){
                tmp2 += arr2[i];
            }
            if(tmp1 == tmp2) answer = 0;
            else if ((tmp1 > tmp2)) answer = 1;
            else if ((tmp2 > tmp1)) answer = -1;
        } else if (arr1.length < arr2.length){
            answer = -1;
        } else if (arr1.length > arr2.length){
            answer = 1;
        }
        
    return answer;
    }
}