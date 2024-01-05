class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count =0;
        int[] tmp = new int[arr.length];
        
        while(count != arr.length) {// 카운트 == 배열의 길이까지
            count = 0;
            tmp = arr.clone();
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                } else if(arr[i]<50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
                if(arr[i] == tmp[i]) count++;
            }

            answer++;
        }
        
        
        return answer-1;
    }
}