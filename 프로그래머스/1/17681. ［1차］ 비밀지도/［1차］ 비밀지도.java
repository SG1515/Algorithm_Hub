import java.util.Arrays;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
    
        for(int i=0; i<n; i++){
            String tmp = "";
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            s1 = String.format("%" + n + "s", s1).replace(' ', '0');
            s2 = String.format("%" + n + "s", s2).replace(' ', '0');
            for(int j=0; j<n; j++){
                if (s1.charAt(j) == '1' || s2.charAt(j) == '1'){
                    tmp += "#";
                } else {
                    tmp += " ";
                }
            }
            answer[i] = tmp;
        }
        
        return answer;
    }
}

/*

String.format은 주어진 형식에 따라 문자열을 만들어주는 메서드입니다. 여기서 % 기호는 형식 지정자를 나타내며, s는 문자열을 나타냅니다. 따라서 "%" + n + "s"는 전체 길이가 n이고 문자열을 나타내는 형식 지정자입니다.

예를 들어, n이 5일 경우 %5s는 길이가 5인 문자열을 의미하며, 이 문자열의 왼쪽에는 공백이 추가됩니다. String.format("%5s", "123")를 호출하면 결과는 " 123"이 됩니다. 여기서 "123"은 원래의 문자열이고, 왼쪽에 공백이 추가되어 전체 길이가 5가 됩니다.

따라서 String.format("%" + n + "s", s1)은 s1이라는 이진수 문자열을 전체 길이가 n인 문자열로 변환합니다. 그리고 replace(' ', '0')를 사용하여 앞에 추가된 모든 공백을 0으로 대체하여 이진수를 나타내는 문자열이 정확한 길이를 갖도록 합니다.

요약하면, 이 부분은 주어진 이진수 문자열이 n보다 짧을 경우 앞에 0을 채워주는 역할을 합니다.*/