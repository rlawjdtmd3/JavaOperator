package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : if -else 예제
 *		프로그램을 하나 개발해야 합니다.
 *	오더는 
 *	학생		국어		영어		수학		총점		평균		합격여부
 *-----------------------------------------------------
 *	(홍길동)	(90)    (90)    (90)   (270)   (90)      (합격)
 *  
 *	평균이 90점 이상이면 장학생
 *	평균이 70점 이상 - 90점 미만이면 합격
 *	평균이 70점 미만이면 불합격
 */
public class CalcAvgMain {
	public static void main(String[] args) {
		// 선언부
		double kor = 0, eng = 0, math = 0, total = 0, avg = 0;
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

		if (avg >= 90) {
			msg = "장학생";
		} else if ((avg >= 70) && (avg < 90)) { // &&(avg <90) 굳이안해도 됨
			msg = "합격";
		} else {
			msg = "불합격";
		}

		// 출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("-----------------------------------------------------");
		System.out
		.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t" + msg + "\n");
		System.out.println(name + "님은 총점 :" + total + "  평균 :" + avg);

	}

}
