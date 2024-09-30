package lec3;

import java.util.*;

public class Retry_Pattern {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int star=(n / 2) + 1,space=-1,row=1;
		//loop
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
				
			}
			//star
			int l=1;
			if(row==1 || row==n) {
				l=2;
			}
			while(l<=star) {
				System.out.print("* ");
				l++;
				
			}
			//updation
			System.out.println();
			if(row<(n / 2)+1) {
					star--;
					space+=2;
					
			}
			else {
				star++;
				space-=2;
				
			}
			row++;
			
		}
	}

}
