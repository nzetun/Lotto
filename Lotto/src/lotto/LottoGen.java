package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoGen {
	
	public static List<Integer> numGenerator() {
		
		Random rand = new Random(); 
		int lottoNumber = 1;  //1-69
		int upperBound = 70;
		int powerBall = 1;    //1-26
		int powUpperBound = 27;
		
		List<Integer> lottoList = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			lottoNumber = rand.nextInt(upperBound);
			if(lottoNumber != 0) {
				lottoList.add(lottoNumber);
			} else {
				lottoNumber = 1;
			}
		}
		Collections.sort(lottoList);
		
		powerBall = rand.nextInt(powUpperBound);
		if(powerBall != 0) {
			lottoList.add(powerBall);
		} else {
			powerBall = 1;
			lottoList.add(powerBall);
		}
		
		
		return lottoList;
		
	}
	
	public static void lottoTicket() {
		
		System.out.println("---------------------------------------");
		System.out.println("Noah's Lottery Ticket Generator");
		System.out.println("---------------------------------------");
		System.out.printf("\n\n\n\t");
		System.out.println(numGenerator());
		System.out.printf("\n\n\n");
		System.out.println("---------------------------------------");
		
	}
	
	
}
