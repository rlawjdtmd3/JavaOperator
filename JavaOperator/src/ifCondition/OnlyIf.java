package ifCondition;
/*
 * @ Date : 2015.07.08
 * @ Author : me
 * @ Story : OnlyIf 테스트
 */
public class OnlyIf {
	public static void main(String[] args) {
		int x =1 ,y =2 ; //지변초기화
		if ((x==1) && (y==1)) {// && 엔퍼센트 읽고 and 연산자 역할
			System.out.println("x 는 1이면서 , y도 2이다.");
		}
		if ((x==1)||(y==1)) {// ||컬럼이라고 읽고 or 연산자 역할
			System.out.println("x 는 1이거나 ,y는 2이다.");
		}
	}
}
