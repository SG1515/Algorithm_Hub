import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for(int i=0; i<T; i++){
            int testCaseNumber = Integer.parseInt(br.readLine());
            String s = br.readLine();

            String[] arr = s.split(" ");
            int[] arrCount = new int[arr.length];
            for(int j=0; j<arr.length; j++){
                int tmp = Integer.parseInt(arr[j]);
                arrCount[tmp] += 1; // 숫자가 97 이면 그 인덱스에 값을 ++

            }

            int cnt = -1;
            int answer = 0;
            for(int j=0; j<arrCount.length; j++) {
                // 최빈수 찾기, 여러 개 일 때는 가장 큰 점수 출력 조건
                if(arrCount[j] >= cnt && j > answer){
                    cnt = arrCount[j];
                    answer = j; // 최빈수로 갱신
                }

            }

            System.out.print("#" + testCaseNumber + " " + answer + "\n");
        }



    }//end of main
}

