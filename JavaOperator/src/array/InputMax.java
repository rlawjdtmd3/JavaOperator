package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : int 형 배열에서 입력값 중 최대값 구하기 
 * */
public class InputMax {
	public static void main(String[] args) {
		System.out.println("3개의 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		// 배열 선언 및 초기화
		// for-loop 으로 입력받으시고요
		// 비교로직은 if 문을 사용하세요
		
		int a= 0 ,b=0, c=0 ,max =0 ;
		int[] sc = new int[3];
		
		for (int i = 0; i < sc.length; i++) {
			sc[i] = scanner.nextInt();
			if (sc[i]>max){
				max = sc[i];
			}
				
		}
		System.out.println("최대값 :" + max);
		
	}
}

