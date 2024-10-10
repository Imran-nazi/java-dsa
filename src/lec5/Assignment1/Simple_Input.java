package Assignment1;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int sum=0;
		//loop taking input
		while(true) {
			int n=kb.nextInt();
			sum+=n;
			if(sum<0) {
				break;
			}
			else {
			System.out.println(n+" ");
			}
		}
		

	}

}
