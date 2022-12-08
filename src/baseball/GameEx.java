package baseball;

import java.util.Arrays;
import java.util.Scanner;

public class GameEx {

	public static void main(String[] args) {
		RandomNum randomNum = new RandomNum();
		
		System.out.println(Arrays.toString(randomNum.getRandomNum()));
		
		
		int[] chkNum = {4, 3, 7, 9};
		
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine();
		int inputNum = Integer.parseInt(tmp);
		
		

	}
}
