import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[3];
        int[] c = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<3; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<3; i++) {
            c[i]=Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<3; i++) {
            if (i != 2-i) {
                bw.write(c[i]-a[2-i]+" ");
            }
            else bw.write(c[i]/a[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}