import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100001];
        int[] b = new int[100001];
        String t = sc.nextLine();
        String tt = sc.nextLine();
        for(int i=0;i<t.length();i++) {
            a[i] = t.charAt(i)-'0';
            b[i] = tt.charAt(i)-'0';
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t.length();i++)
            sb.append(a[i]&b[i]);
        sb.append("\n");
        for(int i=0;i<t.length();i++)
            sb.append(a[i]|b[i]);
        sb.append("\n");
        for(int i=0;i<t.length();i++)
            sb.append(a[i]^b[i]);
        sb.append("\n");
        for(int i=0;i<t.length();i++)
            sb.append(a[i]^1);
        sb.append("\n");
        for(int i=0;i<t.length();i++)
            sb.append(b[i]^1);
        sb.append("\n");
        System.out.println(sb);
    }
}
