import java.io.*;
import java.math.BigInteger;
import java.util.*;
 
public class Main
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        System.out.println(B - A > C - B ? B - A - 1 : C - B - 1);
    }
}