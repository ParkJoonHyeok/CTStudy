package step3;

import java.util.Scanner;

public class No4_25304 {

	public static void main(String[] args) {
		/* 
		문제 :
		준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 
		준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
		영수증에 적힌,
			구매한 각 물건의 가격과 개수
			구매한 물건들의 총 금액
		을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
		
		예제입력 : 
		260000
		4
		20000 5
		30000 2
		10000 6
		5000 8
		예제출력 :
		Yes
		
		*/

		Scanner s = new Scanner(System.in);
		
		int total = s.nextInt();
		int num = s.nextInt();
		int pay = 0;
		int cnt = 0;
	
		for(int i = 0; i< num; i++) {
			pay = s.nextInt();
			cnt = s.nextInt();
			total = total - (pay*cnt);
		}
		if(total ==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
