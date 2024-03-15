import java.util.*;
import java.io.*;

public class Main {
	
	static int[] check;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		String str = br.readLine();
		char[] pw = new char[S];
		int[] dnaNum = new int[4];
		int[] currNum = new int[4];
		check = new int[4];
		int result=0;
		
		for(int i=0;i<S;i++) { //몇 개 있는지 체크
			pw[i] = str.charAt(i);
			if(pw[i] == 'A') dnaNum[0]++;
			if(pw[i]=='C') dnaNum[1]++;
			if(pw[i]=='G') dnaNum[2]++;
			if(pw[i]=='T') dnaNum[3]++;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++) {//최소로 들어가야하는 개수
			check[i] = Integer.parseInt(st.nextToken());
		}
		
		if(!checkNum(dnaNum)) {
			System.out.print(result);
			return;
		}
		
		for(int i=0;i<P;i++) { //슬라이딩하기 위한 초기화 과정
			if(pw[i] == 'A') currNum[0]++;
			if(pw[i]=='C') currNum[1]++;
			if(pw[i]=='G') currNum[2]++;
			if(pw[i]=='T') currNum[3]++;
		}
		if(checkNum(currNum)) result++;
		
		for(int j=P;j<S;j++) { //j는 뒷부분 인덱스
			int i=j-P; //i는 앞부분 인덱스
			
			if(pw[i]=='A') currNum[0]--;
			if(pw[i]=='C') currNum[1]--;
			if(pw[i]=='G') currNum[2]--;
			if(pw[i]=='T') currNum[3]--;
			
			if(pw[j]=='A') currNum[0]++;
			if(pw[j]=='C') currNum[1]++;
			if(pw[j]=='G') currNum[2]++;
			if(pw[j]=='T') currNum[3]++;
			
			if(checkNum(currNum)) result++;
		}
		
		System.out.print(result);
	}
	
	public static boolean checkNum(int[] num) {
		for(int i=0;i<4;i++) {
			if(num[i] < check[i])
				return false;
		}
		return true;
	}
}