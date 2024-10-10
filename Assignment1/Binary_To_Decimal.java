package Assignment1;

import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int sum=0;
		int mol=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+(rem*mol);
			mol=mol*2;
			n/=10;
			
		}
			
			System.out.println(sum);
	}

}
