package Assignment1;

import java.util.Scanner;

public class Print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int rev=0;
		while(n>0) {
			int rem=n%10;//last digit no. is stored 
			rev=(rev*10)+rem;
			n/=10;
			
		}
		System.out.println(rev);
		

	}

}
