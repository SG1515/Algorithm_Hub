import java.io.*;
import java.util.*;

public class Main {
	static boolean[] check;
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		check = new boolean[10001];
		
		//생성자
		for(int i=1; i<check.length; i++) {
			if(d(i) < check.length )
				check[d(i)] = true;
		}
		
		//출력
		for(int i=1; i<check.length; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
		
		
	}
	
	public static int d(int num) {
		int sum = num;
		
		while(num != 0) { // 각 자리 더하기
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}

}
