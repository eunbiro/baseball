package baseball;

import java.util.Scanner;

public class CheckNum {
	RandomNum randomNum = new RandomNum();
	
	
	int[] inputNum = new int [4];
	int[] ramNum = randomNum.getRandomNum();
	int stkNum = 0;
	int ballNum = 0;
	int count = 0;

	Scanner scanner = new Scanner(System.in);
	
	public void getCheckNum() {
		System.out.println("=========================");
		System.out.println("  4자리 숫자를 입력해 주세요.");
		System.out.println("=========================");
		System.out.print(">");
		while (true) {
			String scan = scanner.next();
			
			if (scan.length() == 4) {
				System.out.println("=========================");
				System.out.print(" 입력하신 숫자 : ");
				for (int i = 0; i < 4; i++) {
					char charScan = scan.charAt(i);
					inputNum[i] = charScan - '0';
					System.out.print("" + inputNum[i] + " ");
					
				}
			} else {
				System.out.println("=========================");
				System.out.println(" 4자리 숫자만 입력해주세요.");
				System.out.println("=========================");
				continue;
			}
			
			for (int i = 0; i < 4; i++) {
				if (inputNum[i] == ramNum[i]) {
					stkNum += 1;
				} else {
					for (int j = 0; j < 4; j++) {
						if (inputNum[i] == ramNum[j]) {
							ballNum += 1;
						}
					}
				}
			}
			System.out.println("\n " + stkNum + " 스트라이크 | " + ballNum + " 볼");
			
			if (stkNum == 4) {
				System.out.println("=========================");
				System.out.println("    ☆★☆★정답입니다!☆★☆★");
				count++;
				System.out.println("  시도횟수는 " + count + "번 입니다!");
				System.out.println();
				System.out.println();
				break;
			} else {
				System.out.println("=========================");
				System.out.println("      다시 시도해주세요!");
				System.out.println("=========================");
				System.out.print(">");
				count++;
			}
			
			stkNum = 0;
			ballNum = 0;
		}
	};
}
