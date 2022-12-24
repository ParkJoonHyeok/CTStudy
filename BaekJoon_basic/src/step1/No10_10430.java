package step1;

import java.util.Scanner;

public class No10_10430 {

	public static void main(String[] args) {
		/* 문제 :
			(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
			(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
			세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		*/
		// 예제입력 : 5 8 4
		/* 예제출력 : 
		 	1
			1
			0
			0
		*/
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
				
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);
	}

}
