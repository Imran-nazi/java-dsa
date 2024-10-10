package Assignment1;

import java.util.Scanner;

public class GCD {
		public static void main(String[] args) {
			Scanner kb=new Scanner(System.in);
			int divisor=kb.nextInt();
			int divident=kb.nextInt();
			
			while(divident%divisor!=0) {
				int rem=divident%divisor;
				divident=divisor;
				divisor=rem;
				
			}
			System.out.println(divisor);
		}
}
