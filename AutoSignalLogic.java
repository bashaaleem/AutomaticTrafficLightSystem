package demo;

import java.util.Scanner;

public class AutoSignalLogic {
	
	/* This class is to write logic / algorithm for Automatic Traffic Signal System
	 * Traffic Signal should change between Red and Green Color Signals for a 
	 * set period of time (provided by the user)
	 */
	public static int num = 1;
	
	public void autoSignal (int userDuration) throws InterruptedException {
		int n = userDuration;
		int count = 0;
		if(num <= userDuration) {
			System.out.println("\nRed Color");
			for(int i=n ; i > 0  ; i-- ) {
				num += 1;
				if(i <=5 && count == 0) {
					System.out.println("\nOrange Color");
					count++;
				} 
				System.out.print(i+" ");
				Thread.sleep(1000);
			}
		} else {
			System.out.println("\nGreen Color");
			for(int j=num-1 ; j>=1; j--) {
				if(j <= 5 && count ==0) {
					System.out.println("\nOrange Color");
					count++;
				}
				System.out.print(j+" ");
				Thread.sleep(1000);
			}
			num = 1;
		}
		autoSignal(userDuration);	
		
	}

}
