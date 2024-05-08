import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        
		for(int test_case = 1; test_case <= 10; test_case++) {
			sc.nextInt();
            int[][] arr = new int[100][100];

            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {     
                    arr[i][j] = sc.nextInt();	// 배열에 입력받기
                }
            } 
            // 합 구하고 비교       
            int maxSum = -1;
            int dSum1 = 0;
            int dSum2 = 0;
            for(int i = 0; i < 100; i++) {
            	int rSum = 0;
                int cSum = 0;
                for(int j = 0; j < 100; j++) {
                	rSum += arr[i][j];		// 행의 합
                    cSum += arr[j][i];		// 열의 합
            	}
                maxSum = Math.max(maxSum, Math.max(rSum, cSum));
                
                dSum1 += arr[i][i];			// 대각선의 합
                dSum2 += arr[i][99 -i];		// 대각선 "
            }
            maxSum = Math.max(maxSum, Math.max(dSum1, dSum2));
            
            System.out.printf("#%s %s\n", test_case, maxSum);
		}
	}
}