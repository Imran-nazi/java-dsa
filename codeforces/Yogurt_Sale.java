package codeforces;

import java.util.Scanner;

public class Yogurt_Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		//test cases 
		int t=kb.nextInt();
		while(t>0) {
			int n=kb.nextInt();//n items maxim needs to purchase
			int a=kb.nextInt();//1 iterm
			int b=kb.nextInt();//2 item
			Minimum_Amount(n,a,b); 
			t--;
		}
		

	}

	public static void Minimum_Amount(int n, int a, int b) {
		// TODO Auto-generated method stub
		//direct purchase of 1 item ie. a 
		int sum1=n*a;
		//but there is a promotion where you can buy two yogurts for b burles.
		//When buying two yogurts, he can choose to buy them at the regular price or at the promotion price.
		int pair=n/2;//quotioent
		int remaining=n%2;
		int sum2=pair*b;
		sum2=sum2+remaining*a;
		System.out.println(Math.min(sum1, sum2));
		
		
	}

}
