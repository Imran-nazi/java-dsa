package Assignment1;

import java.util.*;

public class Catch_The_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		while(n>0) {
			int x=kb.nextInt();//x-axis 
			int y=kb.nextInt();//y-axis
			if(y<=-2) {//below -2 co-ordinate , character cant catch the coin..
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			n--;
		}

	}

}
