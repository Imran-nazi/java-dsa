package Assignment1;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int count=0;
		
		for(int i=2;i<n;i++) { // 2 to (n-1)
			if(n%i==0) {
				count++;
				break;
			}
		}
		
		if(count>0) {
			System.out.println("not prime");
			
		}
		else {
			System.out.println("Prime");
		}
	}

}
