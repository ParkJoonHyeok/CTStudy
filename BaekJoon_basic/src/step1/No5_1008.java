package step1;

import java.util.Scanner;

public class No5_1008 {

	public static void main(String[] args) {
		// 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		
		// 예제 입력 : 1 3
		// 예제 출력 : 0.3333333333333333
		
		Scanner s = new Scanner(System.in);
		
		double a = s.nextDouble();
		double b = s.nextDouble();
        
        s.close();
        
        System.out.println(a / b);
	}

}
