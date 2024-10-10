package Assignment1;

import java.util.Scanner;

public class Chewbacca_And_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		long n=kb.nextLong();
		System.out.println(Inverting_Digits(n));
		

	}

	public static long Inverting_Digits(long n) {
		// TODO Auto-generated method stub
		long sum=0;
		long mol=1;
		while(n>9) {
			long rem=n%10;
			
			
			//inversing number
			if(rem>=5) {
				sum=sum+ (9-rem)*mol;
				
			}
			else {
				sum=sum+rem*mol;
			}
			n/=10;
			mol=mol*10;
		}
		//no. 9 or below
		if(n==9 || n<5) {
			sum=sum + n * mol;
			
		}
		else {
			sum=sum+ (9 - n) * mol;
		}
		return sum;
		
	}

}
