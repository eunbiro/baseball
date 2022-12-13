package baseball;

import java.util.Scanner;

public class GameEx {

	public static void main(String[] args) {
		CheckNum checkNum = new CheckNum();
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("======================================");
			System.out.println(" 1. 게임시작  |  2. 게임방법  |  3. 게임종료");
			System.out.println("======================================");
			System.out.print(">");
			
			int scan = scanner.nextInt();
			
			if (scan == 1) {
				checkNum.getCheckNum();
			} else if (scan == 2) {
				Tutorial.getTuto();
				System.out.println();
				System.out.println();
				continue;
			} else if (scan == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}
		
	}
}
