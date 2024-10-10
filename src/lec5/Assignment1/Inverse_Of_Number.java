package Assignment1;

import java.util.Scanner;

public class Inverse_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		System.out.println(Inverse(n));

	}

	public static int Inverse(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int pos=1;//pos from 1 to up to n digit no..
		while(n>0) {
			int rem=n%10;
			sum=(int) (sum+pos*Math.pow(10, rem-1));
//			System.out.println(sum);
			n/=10;
			pos++;
		}
		return sum;
//		System.out.println(sum);
	}

}
