import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int temp;
        Queue<Integer> Q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            Q.add(i);
        }

        sb.append("<");
        while (!Q.isEmpty()) {
            temp = k - 1;
            while (temp != 0) {
                Q.add(Q.poll());
                temp--;
            }
            sb.append(Q.poll());
            if(Q.size() != 0) sb.append(", ");
        }
        sb.append('>');
        System.out.println(sb);
        bf.close();
    }
}