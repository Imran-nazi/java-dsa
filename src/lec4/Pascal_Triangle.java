package lec4;

import java.util.Scanner;

public class Pascal_Triangle {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		
		int star=1;
		int row=0;
		while(row<n) {
			int ncr=1;
			//ncr
			int r=0;
			//star
			while(r<star) {
				System.out.print(ncr+" ");//starting` ncr must print 1
				ncr=((row-r)*ncr)/(r+1);
				r++;
			}
			System.out.println();
			row++;
			star++;
			
		}
		
	}

}
