package step2;

import java.util.Scanner;

public class No2_9498 {

	public static void main(String[] args) {
		/* 문제 :
			시험 점수를 입력받아 90 ~ 100점은 A, 
			80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
			나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		*/
		// 예제입력 : 100
		/* 예제출력 : A
		
		*/
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		if(90<= num && num <= 100) {
			System.out.println("A");
		}else if(80<= num && num <= 89) {
			System.out.println("B");
		}else if(70<= num && num <= 79) {
			System.out.println("C");
		}else if(60<= num && num <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
