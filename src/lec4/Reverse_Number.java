package lec4;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10 + rem;
			n/=10;
		}
		System.out.println("rev no is= "+rev);
	}

}
