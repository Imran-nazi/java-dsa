package Assignment1;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int digit=kb.nextInt();
		System.out.println(Count(n,digit));
		

	}

	public static int Count(int n, int digit) {
		// TODO Auto-generated method stub
		int count=0;
		while(n>0) {
			int rem=n%10;
			if(rem==digit) {
				count++;
			}
			n/=10;
		}
		return count;
	}

}
