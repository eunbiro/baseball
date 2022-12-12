package baseball;

import java.util.Arrays;

public class RandomNum {
	int [] ramNum = new int[4];
	
	public int[] getRandomNum() {
		
		int[] ramArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ramNum = new int[4];

		for (int i = 0; i < ramArr.length; i++) {
			int chkNum = (int) (Math.random() * ramArr.length);
			int tmp = 0;
			
			tmp = ramArr[0];
			ramArr[0] = ramArr[chkNum];
			ramArr[chkNum] = tmp;
		}
		
		ramNum = Arrays.copyOf(ramArr,4);
		
		return ramNum;
	}
	
}
