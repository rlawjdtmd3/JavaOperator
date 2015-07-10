package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story : switch 예제 (남성 판별)
 */

public class ManOrWoman {
	public void ssn() {
		Scanner scanner = new Scanner(System.in);
		//sysem 이 PC임 받아들이는녀석 ,,
		System.out.println("주민번호를 입력하세요(예800101-2123456)");
		String ssn = "" , msg = "";
		ssn = scanner.next();
		//ssn은 주민번호 약자
		
		/*
		 * charAt(n) 이 메소드는 0 부터 시작하여
		 * n 번째 글자 하나만 출력하는데 (영어는 출력, 프로그램은 리턴)
		 * 출력결과를 프로그래밍에서는 리턴값이라고 한다.
		 * 위 예 같은 상황에서는 리턴값이 2가 된다.
		 * */
		
		//리턴값 어떤 메소드가 반환해주는값,,이메소드가 얼마를 결과로 던져주냐 그걸말함

		
		char ch = ssn.charAt(7);
				//몇번자리에 숫자를 뽑아낼때 쓰임 ,, 인덱스
				
		
		/*
		 * ssn의 체계
		 * 1,3번 남자
		 * 2,4번 여자
		 * 5번 외국인
		 * 잘못 입력한 값
		 * */
				
		switch (ch) {
		case '1':case '3': msg ="남자"; break;
		case '2':case '4': msg ="여자"; break;
		case '5': msg ="외국인"; break;
		default: msg ="잘못 입력한 값";break;
		}
		// char 값이니깐 따옴표안에 문자를 넣어줌 ..
		
		System.out.println("입력하신 SSN은 "+msg+"입니다.");
	}
}
