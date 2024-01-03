import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] a1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] +1);
        int[] a2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] +1);
        
        int[] answer = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, answer, 0, a1.length);
        System.arraycopy(a2, 0, answer, a1.length, a2.length);
        
        return answer;
    }
}