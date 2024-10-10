package Assignment1;

import java.util.*;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int star=n-2;
		int space=-1;
		int row=1;
		//loop
		while(row<=star) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*\t");
				i++;
				
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			//updt
			if(row<=(n/2)+1) {
				star--;
				space+=2;
			}
			System.out.println();
			row++;
			
		}
		
	}

}
