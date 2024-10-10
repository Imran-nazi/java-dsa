package Assignment1;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();//no of cars 
		while(n>0) {
			int Car_No=kb.nextInt();
			Odd_Even_Check(Car_No);
			n--;
		}

	}

	public static void Odd_Even_Check(int car_No) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		while(car_No>0) {
			int rem=car_No%10;
			if(rem%2==0) {
				
				even+=rem;
			}
			else {
				odd+=rem;
			}
			car_No/=10;
		}
		
		if(odd%3==0 || even%4==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		
		
	}

}
