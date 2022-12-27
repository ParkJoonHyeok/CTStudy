package step2;

import java.util.Scanner;

public class No1_1330 {

	public static void main(String[] args) {
		/* 문제 :
		두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		*/
		// 예제입력 : 1 2
		/* 예제출력 : <
		
		*/

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
