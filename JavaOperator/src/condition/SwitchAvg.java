package condition;

import java.util.Scanner;
/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story : switch로 변경 (합격여부 구하기)
 */
public class SwitchAvg {
	public void aaa() {
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0;
		String name = "", msg = "";
		Scanner scanner = new Scanner(System.in);

		// 연산부
		System.out.println("당신의 이름을 입력해주세요.");
		name = scanner.next();
		System.out.println("국어점수를 입력해주세요");
		kor = scanner.nextInt();
		System.out.println("영어점수를 입력해주세요");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력해주세요");
		math = scanner.nextInt();
		total = kor + eng + math;
		avg = (int) total / 3; // 다운캐스팅 . 소수점 이하 버림

		//아래 부분을 switch-case 로 전환
		/*
		 if (avg >= 90) {
			msg = "장학생";
		} else if ((avg >= 70) && (avg < 90)) { // &&(avg <90) 굳이안해도 됨
			msg = "합격";
		} else {
			msg = "불합격";
		} 
		 * */
		
		switch (avg/10) {
			case 10:case 9: msg = "장학생"; break;
			case 8:case 7: msg = "합격"; break;
			default:msg = "불합격"; break;
		}
		
		

		// 출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("-----------------------------------------------------");
		System.out
		.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t" + msg + "\n");
		System.out.println(name + "님은 총점 :" + total + "  평균 :" + avg);

	}
}
