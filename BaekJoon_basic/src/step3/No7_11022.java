package step3;

import java.util.Scanner;

public class No7_11022 {

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
		Case #1: 1 + 1 = 2
		Case #2: 2 + 3 = 5
		Case #3: 3 + 4 = 7
		Case #4: 9 + 8 = 17
		Case #5: 5 + 2 = 7
		*/
		
		Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a = 0, b = 0, sum = 0;

        for(int i = 1; i <= t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum = a + b;

            System.out.println("Case #" + i +": " + a + " + " + b + " = " + sum);
        }
	}

}
