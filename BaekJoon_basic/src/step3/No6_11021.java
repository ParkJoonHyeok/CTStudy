package step3;

import java.util.Scanner;

public class No6_11021 {

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
		Case #1: 2
		Case #2: 5
		Case #3: 7
		Case #4: 17
		Case #5: 7
		*/
		
		Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a = 0, b = 0;

        for(int i = 1; i <= t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println("Case #" + i + ": " + (a+b));
        }
	}

}
