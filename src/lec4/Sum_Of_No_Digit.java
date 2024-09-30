package lec4;

import java.util.*;

public class Sum_Of_No_Digit {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
			
		}
		
		System.out.println("sum = "+sum);
	}

}
