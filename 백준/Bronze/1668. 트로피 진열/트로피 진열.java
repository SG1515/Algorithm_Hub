import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] trophies = new int[n];
        for (int i = 0; i < trophies.length; i++) {
            trophies[i] = Integer.parseInt(br.readLine());
        }
        
        int leftMax = 0;
        int left = 0;
        for (int i = 0; i < trophies.length; i++) {
            if (leftMax < trophies[i]) {
                left += 1;
                leftMax = trophies[i];
            }
        }
        
        int rightMax = 0;
        int right = 0;
        for (int i = trophies.length - 1; i >= 0; i--) {
            if (rightMax < trophies[i]) {
                right += 1;
                rightMax = trophies[i];
            }
        }
        
        System.out.println(left);
        System.out.println(right);
    }
}