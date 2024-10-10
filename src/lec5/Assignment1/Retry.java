package Assignment1;

import java.util.Scanner;

public class Retry {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int star=n-2;
		int space=-1;
		int row=1;
		//loop
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*\t");
				i++;
			}
			//space
			int k=1;
			while(k<=space) {
				System.out.print("\t");
				k++;
			}
			//star
			int l=1;
			if(row==1 || row==n) {
				l=2;
			}
			while(l<=star) {
				System.out.print("*\t");
				l++;
			}
			//updt
			if(row<(n/2)+1) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
				
			}
			System.out.println();
			row++;
		}
		
	}
	

}
