package operator;
/*
 * @ Date : 2015.07.08
 * @ Author : me
 * @ Story : 삼항 연산자 문법
 */
public class Ternary {
	public static void main(String[] args) {
		int left = 1, right = 0 , result = 0; // 지역변수 초기화
		boolean bool = true ;
		/*
		 * 삼항 연산자는 if-else의 축약문으로
		 * 조건식 (bool) 이 true 이면 left 값을 출력하고
		 * false 이면 right 값을 출력한다. 
		 * */
		result = bool ? left :right ;
		System.out.println("참 거짓 결과 : " + result);
		
	}
}
