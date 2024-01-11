package method;

import java.util.Scanner;

/* 문6 홍길동과 홍길순이가 가위(s), 바위(r), 보(p) 게임을 한다.
 r,p,s 중 하나를 입력해 승자 또는 무승부를 출력하는 프로그램을 작성
홍길동 : r
홍길순 : s

홍길동 승1

*/
public class MethodExercise03 {
	
public static void main(String[] args)  {
	
	Scanner scan = new Scanner(System.in);
	
	String dong = "";
	String check = "";
	String soon = "";
	String winner = "";
	int dwin = 0;
	int dtie = 0;
	int dloose = 0;
	int swin = 0;
	int stie = 0;
	int sloose = 0;
	boolean run = true;

	
	while(run) {
	System.out.println("홍길동은 가위(s),바위(r),보(p) 중 하나를 내세요");
	dong = scan.nextLine(); 
	
	System.out.println("홍길순은 가위(s),바위(r),보(p) 중 하나를 내세요");
	soon = scan.nextLine(); 
	
	if(dong.equals("s") || dong.equals("가위")) {
		
		if(soon.equals("s") || soon.equals("가위")) {
			dtie += 1;
			stie += 1;
			winner = "무승부";
		}else if(soon.equals("r") || soon.equals("바위")) {
			dloose += 1;
			swin += 1;
			winner = "홍길순";
		}else if(soon.equals("p") || soon.equals("보"))  {
			dwin += 1;
			sloose += 1;
			winner = "홍길동";
		}
	
	} else 	if(dong.equals("r") || dong.equals("바위")) {
		if(soon.equals("s") || soon.equals("가위")) {
			dwin += 1;
			sloose += 1;
			winner = "홍길동";
		}else if(soon.equals("r") || soon.equals("바위")) {
			dtie += 1;
			stie += 1;
			winner = "무승부";
		}else if(soon.equals("p") || soon.equals("보"))  {
			dloose += 1;
			swin += 1;
			winner = "홍길순";
}
	
	
	
	} else 	if(dong.equals("p") || dong.equals("보")) {
		if(soon.equals("s") || soon.equals("가위")) {
			dloose += 1;
			swin += 1;
			winner = "홍길순";
		}else if(soon.equals("r") || soon.equals("바위")) {
			dwin += 1;
			sloose += 1;
			
			winner = "홍길동";
		}else if(soon.equals("p") || soon.equals("보"))  {
			dtie += 1;
			stie += 1;
			winner = "무승부";
}
	
	}
	
	if(winner.equals("홍길동")) {
		System.out.println("승리자 : 홍길동 " + dwin + "승");
		
	} else if(winner.equals("홍길순")) {
		System.out.println("승리자 : 홍길순" + swin + "승");
	} else if(winner.equals("무승부")) {
		System.out.println("무승부");
	}

	//scan.nextLine();
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
	
	
}
	
	
	
	
	
	
	

