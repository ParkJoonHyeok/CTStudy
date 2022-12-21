package step1;

import java.util.Scanner;

public class No6_10869 {

	public static void main(String[] args) {
		// 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫),  
		// A%B(나머지)를 출력하는 프로그램을 작성하시오.
		
		// 예제 입력 : 7 3 
		/* 	예제 출력 :
			10
			4
			21
			2
			1
		 */
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
        
        s.close();
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
	}

}
