package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : 4칙연산 계산기
 */
public class ArithmeticCalc {

	/*
	 오더
	 - 사칙연산 계산기 
	 - 덧셈,뺄셈,곱셈,나눗셈(몫 : (), 나머지:()) 
	 - 사칙연산 기호도 입력받습니다. +,*,-,/    %는 입력받지않음 ,, 
	 - 메인메소드 만들고 테스트후 지우면 그만 
	 - 출력결과 
	 - ===심플 계산기 === 
	 - 5 x 5 = 25
	 - 5 + 5 = 10 
	 - 6 ÷ 5 = 1 (1) 
	 - 5 - 6 = -1
	 */

	
	public void calc(){
		
		//선언부
		int x =0 , y= 0 , anw= 0 , remain = 0;
		String opcode = "";
		Scanner scanner = new Scanner(System.in);
		
		
		
		//연산부
		System.out.println("첫번째 숫자 입력하세요");
		x = scanner.nextInt();
		System.out.println("연산기호를 입력하세요");
		opcode=scanner.next();
		System.out.println("두번째 숫자 입력하세요");
		y=scanner.nextInt();

		if(opcode.equals("+")) { 
			anw = x + y; }
		else if(opcode.equals("-")){ 
			anw = x-y;}
		else if(opcode.equals("x")){ 
			anw = x*y;}
		else if(opcode.equals("÷")){
			anw = x/y;  remain = x%y; }
		else {
			System.out.println("입력된 값이 올바르지 않습니다.");}

		
		
		
		// 출력부
		System.out.println("====심플계산기====");
		if (remain!=0) {
			System.out.println(x+opcode+y+ " =" +anw+"("+remain+")");
		}
		else {
			System.out.println(x+opcode+y+ " =" +anw);
		}
	
	}

}
