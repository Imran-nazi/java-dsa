package lec5;

import java.util.Scanner;
//decimal to binary

public class Binary_Conversion {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int mol=1;//10^0
		int sum=0;
		while(n>0) {
			int rem=n%2;
			sum+=rem*mol;
			mol=mol*10;
			n/=2;
			
			
		}
		System.out.println("bin no.= "+sum);
		
	}

}
