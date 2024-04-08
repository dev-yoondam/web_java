package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoMain {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		int lottoNum = 0;
		
		while(lotto.size() < 5) {
			lottoNum = r.nextInt(45) + 1;
			if(!lotto.contains(lottoNum)) {
				lotto.add(lottoNum);
			}
		}
		Collections.sort(lotto);
		System.out.println(lotto);
		
//		[4, 15, 22, 36, 55] 1
//		[3, 6, 11, 23, 43]  2
//		[4, 7, 12, 23, 43] 	1
//		[7, 15, 21, 30, 35]	0
//		[6, 12, 14, 37, 41] 1
//		[5, 8, 17, 19, 25] 	
//		[9, 14, 21, 27, 33] 
//		[2, 3, 24, 37, 42] 	2
//		[4, 8, 16, 22, 35] 
//		[12, 33, 34, 35, 40] 
//		[3, 7, 12, 32, 42]	
//		[3, 10, 16, 38, 43] 2
//		[4, 7, 9, 30, 31]
		
//		Lotto l = new Lotto();
//		l.buyLotto();
	
		
	}
}










