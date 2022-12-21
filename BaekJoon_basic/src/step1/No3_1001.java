package step1;

import java.util.Scanner;

public class No3_1001 {

	public static void main(String[] args) {
		// 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		
		// 예제 입력 : 3 2
		// 예제 출력 : 1
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
        int b = s.nextInt();
        
        s.close();
        
        System.out.println(a - b);
	}

}
