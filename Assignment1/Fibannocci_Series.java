package Assignment1;

import java.util.Scanner;

public class Fibannocci_Series {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		//loop for nth fibb no.
		int i=0;
		int a=0;
		int b=1;
		while(i<n) {
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(a);
	}
	

}
