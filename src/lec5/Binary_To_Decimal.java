package lec5;

import java.util.Scanner;

public class Binary_To_Decimal {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
				int n=kb.nextInt();
				int mol=1;//2^0
				int sum=0;
				while(n>0) {
					int rem=n%10;
					sum+=rem*mol;
					mol=mol*2;
					n/=10;
					
				}
				System.out.println("bin to dec= "+sum);
	}
	

}
