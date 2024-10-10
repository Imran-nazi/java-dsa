package codeforces;

import java.util.Scanner;

public class Three_Brothers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();//bro 1
		int b=kb.nextInt();//bro 2
		Late(a,b);
		
		

	}

	public static void Late(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
		System.out.println(6-sum);
	}

}
