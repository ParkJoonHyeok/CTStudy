package step3;

import java.util.Scanner;

public class No3_8393 {

	public static void main(String[] args) {
		/* 
		문제 :
		n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

		
		예제입력 : 3
		예제출력 : 6
		
		*/
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();	
		int num = 0;
		for(int i=1; i <=n; i++) {
			num += i;
		}
		System.out.println(num);
		
	}

}
