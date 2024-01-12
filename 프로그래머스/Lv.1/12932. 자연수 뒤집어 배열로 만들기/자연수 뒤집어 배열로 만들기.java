class Solution {
    public long[] solution(long n) {
   
        
        String s = Long.toString(n);
        char[] arr = s.toCharArray();
        long[] answer = new long[arr.length];
        
        int idx =0;
        for(int i=arr.length-1; i>=0; i--){
            answer[idx++] = Long.parseLong(String.valueOf(arr[i]));
        }
        
        return answer;
    }
}

/*
Long.parseLong(String.valueOf(charArray[i]))에서 String.valueOf(charArray[i])는 문자를 문자열로 변환하는 과정입니다. 이렇게 하는 이유는 Long.parseLong 메서드가 문자열을 인자로 받기 때문입니다.

Long.parseLong 메서드는 문자열을 long 값으로 변환합니다. 그러나 charArray[i]는 char 타입이므로 직접 인자로 사용할 수 없습니다. 따라서 String.valueOf(charArray[i])를 통해 해당 문자를 문자열로 변환한 후에 Long.parseLong 메서드에 전달합니다.

문자를 문자열로 변환하는 이유는 Long.parseLong 메서드에 문자를 전달할 수 없기 때문입니다. 이러한 변환 작업을 통해 문자를 문자열로 변환한 후 Long.parseLong을 사용하여 해당 문자열을 long 값으로 변환합니다.*/