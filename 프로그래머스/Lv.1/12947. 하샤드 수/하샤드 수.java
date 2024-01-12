class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = "" + x;
        String[] strArr = str.split("");
        
        int sum = 0;
        for(int i=0; i<strArr.length; i++){
            sum += Integer.parseInt(strArr[i]);
        }
        
        if (x % sum ==0){
            return answer;
        } else {
            return false;
        }
        
        
    }
}