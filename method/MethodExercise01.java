package method;

// 문1 hello Java 라는 문자열 3번 반복해서 출력하는 메소드를 작성

// 문2 100장중 몇장 출력했는지랑 남은 장 수 출력하는 것
public class MethodExercise01 {
	
	public static void showPrint(int num) {
		for(int i=1; i<=num; i++) {
		System.out.println("hello java");
	}
	}
	
	public static void main(String[] args) {
		showPrint(5); // 메소드 호출
		showPrint2(5, "즐거운!!");
		System.out.println(multi(5,4));
		System.out.println(add(3,5));
		System.out.println(add2(2,4,7));
		System.out.println(multDouble(1.5,2.7));
		System.out.println(add3(5,2.6));

		
		//두 정수를 넘겨주고 그 결과 되돌려 받아서 출력
		
	} // end of main
		
	// 메소드를 정의 - 위로 부터 두 정수를 넘겨받아서 그것을 가지고 곱셈을 한다음 그 결과를 위로 넘겨주기
	
	public static int multi(int a,int b) {
		return a * b;  //결과를 리턴(=반환), 반환값이 있을 때는 생략할 수 없음
		
	}
	public static int add(int a,int b) {
		return a + b;  
		
	}
	public static int add2(int a,int b,int c) {
		return a + b + c	;  
		
	}
	public static double multDouble(double a,double b) {
		return a + b;  
		
	}
	public static double add3(int a,double b) {
		return a + b;  
		
	}
	public static void showPrint2(int count, String mesage) {
		for(int i=1; i<=count; i++) {
		System.out.println(mesage);
	}
		return; // 일반적으로 생략하고 씀
	}
	
	}
	
	
	
	
	
	
	
	
	
	

