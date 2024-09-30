package lec3;

import java.util.*;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int star1=n / 2 + 1,space=-1,row=1,star2=n/2+1;
		//loop
		while(row<=n) {
			//star1
			int i=1;
			while(i<=star1) {
				System.out.print("* ");
				i++;
			}
			//space
			int l=1;
			while(l<=space) {
				System.out.print("  ");
				l++;
			}
			//star2
			int k=1;
			while(k<=star1) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			
			star1--;
			star2--;
			space+=2;
			if(row<n / 2 + 1) {
				star1++;
				space-=2;
				star2++;
			}
			row++;
		}
	}

}
