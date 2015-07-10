package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story : BigNumber예제  if else 예제 (큰 수 구하기)
 */
public class BigNumber {
	public static void main(String[] args) {
		/*
		 * 문제 ) 학생 3명의 점수를 입력바당서 1등 출력 (0점 ~ 100점)
		 * 결과 ) 1등은 98 점입니다. 
		 * 힌트 ) a 와 b 비교 , b 와 c를 비교 , a와 c를 비교
		 * 특정값이 아니니깐 스위치문 쓰면안됨 ,, 비교를해야하니깐  if else
		 * */
	
		
		//선언부
		int a = 0 , b = 0 , c= 0 , win = 0 ;
		Scanner scanner = new Scanner(System.in);
		
		
		//연산부
		System.out.println("첫번째 점수를 입력하세요.");
		a = scanner.nextInt();
		System.out.println("두번째 점수를 입력하세요.");
		b = scanner.nextInt();
		System.out.println("세번째 점수를 입력하세요.");
		c = scanner.nextInt();
		
		/*
		 * 조건식을 따져서 결과를 가정하지 말고,
		 * 결과를 상정한 다음 거기에 맞는 조건식을
		 * 설정하세요.
		 * */
		
		
		if (a>b && a>c) {
			win = a ;  
		}else if(b > a && b >c)	{
			win = b; 
		}else if(c > a && c> b) {
			win = c; 
		} else{
			System.out.println("동점자가 존재합니다.");
		}
		 
		
		//출력부 
		System.out.println("1등은 "+win+"점 입니다.\n");
	
	}
}

