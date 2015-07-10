package controller;
/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : 프로그램 한자리 모이는곳
 */


import condition.ArithmeticCalc;
import condition.CalcAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;

public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09 성적계산기
		CalcAvg avg = new CalcAvg();
		avg.calcAvg();
		
		// 2015.07.09 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
		calc.calc();
	
		// 2015.07.10 사칙연산 계산기 위에것 if문을 switch문으로 변경 (스위치 성적계산기)
		SwitchAvg avg2 = new SwitchAvg();
		avg2.aaa();
	
		// 2015.07.10 ssn테스트기
		ManOrWoman manOrWoman = new ManOrWoman();
		manOrWoman.ssn(); //ssn() 원 클래스의 메소드 이름이다.
		
	}
}
