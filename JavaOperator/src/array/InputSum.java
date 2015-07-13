package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : int 형 배열 입력예제 
 * */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
     // int a=0,b=0,c=0;
		int sum=0, avg=0 ;
		System.out.println("3개의 숫자를 입력하세요");
		int[] arr = new int[3]; // 3개 숫자 저장공간
		//배열에 값을 입력하라고 하면 무조건 for +CTRL +SPACE
		for (int i = 0; i < arr.length; i++) { // i < arr.length 한계값 그대로 가져오는것 확인
			arr[i] = scanner.nextInt();
			
		}
		//입력된 값을 출력해보세요
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
			 
		}
		//입력된 값을 합산,평균 내보세요.
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i]; //누적공식
			avg = sum/3;
		}
		
		System.out.println("\n합:"+sum);
		System.out.println("평균:"+avg);
		//System.out.println("평균:"+sum/arr.length); arr.length = 숫자값을가짐 //이렇해두됨
		//평균구하는것도 사실밖에서 한번만해두됨 그래야 리소스소모 낭비 방지 ..
	}

}
