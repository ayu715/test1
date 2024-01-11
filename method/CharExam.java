package method;

import java.util.Scanner;

/* 문6 홍길동과 홍길순이가 가위(s), 바위(r), 보(p) 게임을 한다.
 r,p,s 중 하나를 입력해 승자 또는 무승부를 출력하는 프로그램을 작성
홍길동 : r
홍길순 : s

홍길동 승1

*/
public class CharExam {
	
public static void main(String[] args)  {
	// 문자를 이용해서 비밀번호를 암호화 시키고
	// 다시 복호화 시키는 문제
	
	String name = "홍길동";
	String password = "ghdrlfehd";
	String encryptedPassword ="";
	String decryptedPassword ="";
	final int KEY_VALUE = 3;
	
	
/*  정수 + 정수 -> 정수(정수 연산자 정수  => 정수)
 *  정수 연산자 실수 => 실수
 *  문자 + 정수 = 정수 (자동타입변환), 유니코드
 *  (char)(문자 + 정수) => 문자 : 명시적타입변환(=강제형변환)
    (char)(문자 연산자(+,0,*,/) 정수) => 문자 : 명시적타입변환(=강제형변환)
 
 */
	//#1. 암호화
	// 문자열 길이 : 문자열. length()
	// 문자 하나를 읽어서 * 5 를 한 코드로 변환 => (char)(password.charAt(i) * 5
	for(int i=0; i<password.length(); i++) {
		encryptedPassword = encryptedPassword +(char)(password.charAt(i) * KEY_VALUE);
	
	}
	
	for(int i=0; i<encryptedPassword.length(); i++) {
		decryptedPassword +=(char)(encryptedPassword.charAt(i) / KEY_VALUE);
	
	}
	 System.out.println(password);
	System.out.println(encryptedPassword);
	System.out.println(decryptedPassword);
	

	
	
}
	
}
	
	
	
	
	
	
	

