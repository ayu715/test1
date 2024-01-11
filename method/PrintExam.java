package method;

import java.util.Scanner;

public class PrintExam {
	


	public static void main(String[] args) {
		/* 초기 용지 : 100장
		// 인쇄방식 : 단면(true)과 양면(false) : boolean duplex
		            양면    :   인쇄할매수 % 2 == 0 -----인쇄매수 / 2
		            		   인쇄할매수 % 2 == 1 -----인쇄매수 / 2 + 1
		// 인쇄할 매수를 입력 받기
		// 출력형태
		// ~장 출력
		// 남은 용지매수 : ~ 장
		// 용지를 출력하려 할 때 용지가 없는 경우, 용지가 부족, 용지가 남는 경우
		// if ~ else if ~ else
	*/
		Scanner scan = new Scanner(System.in);
		System.out.print("인쇄 방식 선택 (1. 단면, 2. 양면)");
		int printingMethod = scan.nextInt();
		
		System.out.print("인쇄할 매수 입력 >>");
		int printAmount = scan.nextInt();
		
		printShow(printAmount, printingMethod);
	} // end of main
								//인쇄할 용지			인쇄방식(양면인지 단면인지)
	public static void printShow(int printAmount, int printingMethod) {
		int paperNumber = 100; // 초기 용지(=기본 용지)
		
		//	. 양면인쇄일 때
		if(printingMethod == 2) {
			//인쇄할용지매수 = 인쇄할 용지 매수가 짝수일 때		인쇄할 용지 매수가 홀수 일때
			printAmount = (printAmount % 2 == 0) ? printAmount/2 : printAmount / 2 + 1;
			// 				조건		?	조건의 결과가 true 일때 실행할 문장 : 조건의 결과가 거짓일 때 실행할 문장
		}
		
		if(paperNumber==0) {
			System.out.println("용지 없음");
		} else if(paperNumber < printAmount) {    //인쇄할 매수가 기본용지보다 많을 때
												//인쇄할 매수 - 기본용지
			System.out.println("용지 부족" + (printAmount - paperNumber));
			System.out.println(paperNumber + "장만 인쇄");
			paperNumber = 0; // 기본 용지를 0으로 설정
		} else {
			paperNumber -= printAmount;
			System.out.println(printAmount + "장 출력");
					System.out.println("남은 용지 매수 : " + paperNumber);
		}
	}
	//gender = genderNum%2 == 0 ? "여자" : "남자" ;
} //end of class
