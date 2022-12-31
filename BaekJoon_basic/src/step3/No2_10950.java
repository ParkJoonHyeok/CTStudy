package step3;

import java.util.Scanner;

public class No2_10950 {

	public static void main(String[] args) {
		/* 
		문제 :
		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		예제입력 : 
		5
		1 1
		2 3
		3 4
		9 8
		5 2
		예제출력 :
		2
		5
		7
		17
		7
		*/

		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();		
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i<t; i++) {
			a= s.nextInt();
			b= s.nextInt();
			
			System.out.println(a+b);
		}
	}

}
