package method;

public class MethodExam01 {

	public static void main(String[] args) {
		int sum = 0; // 지역변수, main의 {}
		//# 1. 1 ~ 5 까지의 합
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		System.out.println("1 ~ 5까지의 합 : " + sum);
		
		sum = 0; // 변수는 가장 마지막에 저장된 하나의 값만 저장
		//# 1 ~ 10 까지의 합
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10까지의 합 : " + sum);
		//# 50 ~ 100 까지의 합
		sum = 0; 
		for(int i=50; i<=100; i++) {
			sum += i;
		}
		System.out.println("50 ~ 100까지의 합 : " + sum);
		//# 35 ~ 75 까지의 합
		sum = 0; 
		for(int i=35; i<=70; i++) {
			sum += i;
		}
		System.out.println("35 ~ 70까지의 합 : " + sum);
		
		
	} //end of main
} //end of class
