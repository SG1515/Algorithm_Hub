import java.util.Arrays;

public class Solution {
    public double solution(int[] array) {
        return Arrays.stream(array).average().orElse(0.0);
    }
    
    public static void main(String... args) {
        double result = 0;
        int x[] = {1, 2, 3, 4};
        Solution getMean = new Solution();
        System.out.println("평균값 : " + getMean.solution(x));
    }
}