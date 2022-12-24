package step1;

import java.util.Scanner;

public class No11_2588 {

	public static void main(String[] args) {
		/* 문제 :
			(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
			이미지 참고 : https://www.acmicpc.net/problem/2588 
			(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		*/
		// 예제입력 : 472
		//			385
		/* 예제출력 :
			2360
			3776
			1416
			181720
		*/
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		//System.out.println((b % 10));
		System.out.println((b % 10) * a);
		
		//System.out.println(((b % 100) / 10));
		System.out.println(((b % 100) / 10) * a);
		
		//System.out.println((b / 100));
		System.out.println((b / 100) * a);
		
		System.out.println(a * b);
	}

}
