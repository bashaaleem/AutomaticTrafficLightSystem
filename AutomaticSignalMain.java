package demo;

import java.util.Scanner;

public class AutomaticSignalMain {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the time interval for signal change: ");
			int duration = sc.nextInt();
			AutoSignalLogic signal = new AutoSignalLogic();
			try {
				synchronized(signal){
					signal.autoSignal(duration);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

	}

}
