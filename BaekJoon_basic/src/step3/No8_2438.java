package step3;

import java.util.Scanner;

public class No8_2438 {

	public static void main(String[] args) {
		/* 
		문제 :
		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		
		예제입력 : 
		5
		예제출력 :
		*
		**
		***
		****
		*****
		*/
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0; i<t; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
