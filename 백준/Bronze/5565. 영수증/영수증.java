import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine()); 
        
        for (int i = 1; i <= 9; i++) {
            total -= Integer.parseInt(br.readLine());
        }
        System.out.print(total);
    }
}