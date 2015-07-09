package operator;

import java.util.Scanner;
/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : 시간 분 초로 환산하는 프로그램
 */
public class TimeSeperator {
	public static void main(String[] args) {
		/*
		 * 입력받은 초를 시간 분 초로 환산하는 프로그램
		 * */
		
		//변수의 선언
		Scanner scanner = new Scanner(System.in);
		int input = 0 ,second = 0 ,minute= 0 , hour = 0;
		System.out.println("구하고자 하는 시간(초) 입력 :");
		input = scanner.nextInt();
		// 입력받은 초가 500 이라고 한다면
		// 500초로 60으로 나눈 나머지가 초 % , /
		// 위 연산의 몫은 다시 60으로 나눈 나머지가 분
		// 위 연산에서 나온 몫이 시간
		
	    second = input % 60 ;
	    minute = (input / 60) % 60;
	    hour =  (input / 60 )/ 60 ;
	    
	    System.out.println(hour+"시"+minute+"분"+second+"초");
	
	    
	    
		
	}
}
