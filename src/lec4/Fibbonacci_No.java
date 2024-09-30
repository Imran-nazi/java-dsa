package lec4;

import java.util.Scanner;

public class Fibbonacci_No {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a=0,b=1 ;
		int c=0;
		int i=1;
		while(i<=n) {
			c=a+b;
			a=b;
			b=c;
			
			i++;
		}
		System.out.println("fib. no. of "+n+"th term is : "+a);
	}

}
