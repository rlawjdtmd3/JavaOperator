package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * order 
		 * 스캐너로 두 값을 입력받아서
		 * 사칙연산 결과가 나오도록 하시오.
		 * 20 + 7 =27
		 * 20 * 7 = 140 
		 * */
		
		// 연산에 쓸 재료들을 준비하는 선언부
		Scanner scanner = new Scanner(System.in);
		int x=0, y=0 , a = 0 , b = 0 , c=0 , d= 0 ,e =0   ;// 지역변수는 디폴트값을 초기화
		
		
		// 연산부  // next 커서 다음 글자(숫자)를 변수 할당하라 
		System.out.println("첫숫자를 입력");
		x = scanner.nextInt();
		System.out.println("두번째숫자를 입력");
		y = scanner.nextInt();
		
		//////a~e까지 따로 변수주지말고 그냥 결과값에 x+y,x-y 이런식으로 주면 메모리 사용감소시킬수잇음.
		 
		a = x+y ;
		b = x-y ;
		c = x*y ;
		d = x/y ;
		e = x%y ;
		
		
		// 출력영역
		System.out.println(x+"+"+y+"의 값은\t"+a+"입니다.\n");
		System.out.println(x+"-"+y+"의 값은\t"+b+"입니다.\n");
		System.out.println(x+"*"+y+"의 값은\t"+c+"입니다.\n");
		System.out.println(x+"/"+y+"의 값은\t"+d+"입니다.\n");
		System.out.println(x+"%"+y+"의 값은\t"+e+"입니다.\n");

	}
}
