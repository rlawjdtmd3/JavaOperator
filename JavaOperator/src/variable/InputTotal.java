package variable;

import java.util.Scanner;
/*
 * @ Date : 2015.07.08
 * @ Author : me
 * @ Story : InputTotal
 */
public class InputTotal {
	public static void main(String[] args) {
		
		//선언부 . 초기화 영역
		Scanner scanner = new Scanner(System.in);
		//int kor =0 , eng =0, math=0, total=0;//디폴트 값 선언 : 지역변수 초기화
		//int kor, eng, math, total; // 인스턴스 변수 선언법
		
		//연산부. 프로세싱
		System.out.println("국어점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scanner.nextInt();
		// total 지역변수를 연산식으로 초기화 함 
		int total = kor + eng + math;
		
		
		//int total = 0 ; 을해주면 int값의 디폴트값으로 초기화
		
		
		//결과값 리턴
		System.out.println("총점 :"+total);
		
		
	}
}
