package codeforces;

import java.util.Scanner;

public class Two_Elevators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t>0) {
			
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			//Vlad wants to call an elevator that will come to him faster.
			Call_Elevator(a,b,c);
			t--;
		}

	}

	public static void Call_Elevator(int a, int b, int c) {
		// TODO Auto-generated method stub
		//If you call the first elevator, it will immediately start to go to the floor 1
		int ele1=Math.abs(a-1);
		
		//If you call the second one, then first it will reach the floor c
//		 and only then it will go to the floor 1
//		 . It takes |x−y|
//		  seconds for each elevator to move from floor x
//		  to floor y
//		 .
		int ele2=Math.abs(c-b);
		ele2=ele2+Math.abs(c-1);
		
		
		// 1 if it is better to call the first elevator;
		if(ele1<ele2) {
			System.out.println("1");
		}
		else if(ele2<ele1) {
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}
	}

}
