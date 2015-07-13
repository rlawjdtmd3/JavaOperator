package Loop;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : for-loop + if 결합예제
 */

public class EvenOddSum {
	/*
	 * 입력 받은수(1)부터 입력받은 
	 * 수(10)까지의 수 중에서
	 * 각각 짝수의 합과 홀수의 합을
	 * 분리해서 출력하시오.
	 *  
	 * */

	public void calc() {
		int a= 0 ,b= 0 ,evenSum = 0 , oddSum = 0 ;
		Scanner scanner = new Scanner(System.in);
		
		// 오더가 범위내에서 연산 값의 출력이라면
		// for문을 만들고  ,,, 어떤값일때 어떤값인구조는 switch문
		// 홀수 if(input%2==1)
		// else
		
		
		System.out.println("첫숫자를 입력해주세요");
		a = scanner.nextInt();
		System.out.println("두번째숫자를 입력해주세요");
		b = scanner.nextInt();
		
		for (int i = a; i <= b; i++) {
			if ((i % 2)==0) { // a 와 b는 입력받은순간 고정된값 : 상수
				              // i 는 인덱스 변수
				evenSum += i;
			}else {
				oddSum += i;
			}
			
		}
		
		System.out.println(a+" 부터 "+b+"까지의 정수 중에서\n"
				+ "짝수의 합은 "+evenSum+ "이고 \n"
				+ "홀수의 합은 "+oddSum+ "이다.");
	}

}
