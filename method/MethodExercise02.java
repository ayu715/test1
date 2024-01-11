package method;

import java.util.Scanner;

// 문1 hello Java 라는 문자열 3번 반복해서 출력하는 메소드를 작성

// 문2 100장 중 몇장 출력했는지랑 남은 장 수 출력하는 것
public class MethodExercise02 {
	
	public static void total_paper(int amount) {
		System.out.println("현재 용지는 " + amount + "장 입니다.");
	}
	public static void print_paper(int amount) {
		System.out.println("출력한 용지는 " + amount + "장 입니다.");
	}
	public static void remain_paper(int amount) {
		System.out.println("남은 용지는 " + amount + "장 입니다.");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String check = "";
		int paper = 100;
		int printpaper = 0;
		int remainpaper = 0;
		boolean run = true;
			
		while(run) {
			total_paper(paper);
		System.out.println("몇 장을 출력 하시겠습니까?");
		printpaper = scan.nextInt();
		paper = paper - printpaper;
	
		print_paper(printpaper);
		remain_paper(paper);
		
		scan.nextLine();
		System.out.println("계속 출력하시겠습니까?(Y/N)");
		check = scan.nextLine();
		if (check.equals("y") || check.equals("Y")) {
			continue;
      } else if (check.equals("N") || check.equals("n")) {
			run = false;
			break;
      } else {
			System.out.println("잘못 입력하셨습니다.");
      }
	
		
		}
	}
	public static void restart(String check,boolean run) {
		if (check.equals("y") || check.equals("Y")) {
      } else if (check.equals("N") || check.equals("n")) {
			run = false;
      } else {
			System.out.println("잘못 입력하셨습니다.");
			run = false;
      }
	}
	
	
}
	
	
	
	
	
	
	

