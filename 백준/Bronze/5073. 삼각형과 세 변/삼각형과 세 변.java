import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<Integer, Boolean> angle = new HashMap<Integer, Boolean>();
        int[] len = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while(len[0] != 0) {
            angle.clear();
            Arrays.sort(len);
            angle.put(len[0], true);
            angle.put(len[1], true);
            angle.put(len[2], true);

            if(len[2] < len[0] + len[1]) {
                if (angle.size() == 1) {
                    System.out.println("Equilateral");
                } else if (angle.size() == 2) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
            
            len = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
    }
}