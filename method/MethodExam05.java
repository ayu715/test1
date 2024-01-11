package method;

// 문1 hello Java 라는 문자열 3번 반복해서 출력하는 메소드를 작성

// 문2 100장중 몇장 출력했는지랑 남은 장 수 출력하는 것
public class MethodExam05 {
	
	public static int plus(int a, int b) {
		//메소드 오버로딩 : 메소드이름이 같고 매개변수 타입이 다르거나, 또는 매개변수의 개수가 다른 것
		return a+b;
	}
	public static int minus(int a, int b) {
		return a-b;
	}
	public static int multip(int a, int b) {
		return a*b;
	}
	public static double division(double a, double b) {
		if(b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return a/b;
	}
	public static void poweron() {
		System.out.println("전원을 켭니다.");
	}
	
	public static void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	
	public static void main(String[] args) {
		
		poweron();
		System.out.println("4+3 = " + plus(4,3));
		System.out.println("8-3 = " +minus(8,3));
		System.out.println("3*5 = " +multip(3,5));
		System.out.println("5/2 = " +division(5,2));
		poweroff();
		
		//전자계싼기
		// 1. 전원켜기
		// 2. 계산 - plus(4,3), minus(8.3), multip(3,5), division(5, 2)  
		// 3. 전원 끄기 - powerOFF() 
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

