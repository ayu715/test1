package method;

import java.util.Scanner;
/*
 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추는 게임
 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 도출
 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇번 만에 숫자를 맞췄는지 알려줌
 */
public class MethodExercise4_14 {
	
public static void main(String[] args)  {
	//#1. Scanner 객체 생성
	Scanner scan = new Scanner(System.in);
	//#2. 변수 선언
	int com = 0;  // 컴퓨터 값을 담을 변수
	int user = 0; // 사용자로부터 입력 받은 값을 담을 변수
	int count = 0; // 시도 횟수를 세서 담을 변수
	boolean run = true;
	
	// #3. 컴퓨터가 생각하는 숫자
	com = (int)(Math.random()*100) +1;
	//컴퓨터가 가지고 있는 값 확인 - 프로그램 확인 끝나면 주석 처리 또는 삭제
	 System.out.println("com의 값 :" + com);
	do {
		count ++; // 게임 시작을 누적
		
		// #4. 사용자로부터 값 입력 받기
		System.out.print("1과 100사이의 값을 입력하세요 :");
		user = scan.nextInt();
		// #5. 컴퓨터의 값과 사용자의 값을 비교하는 작업
			// 컴값 == 사용자 값,  컴값 > 사용자 값, 컴값 < 사용자 값
		if(com == user) {
			System.out.println("숫자가 일치합니다.");
			System.out.println(count + "번째 만에 맞췄습니다.");
			break;
		} else if(com > user) {
			System.out.println("숫자가 불일치합니다.(업)");
		}else if(com < user) {
			System.out.println("숫자가 불일치합니다.(다운)");
		}
		
	}
	while(run);
	
	
} // end of main
} //end of class
