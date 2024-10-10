package Assignment1;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int Sum_Digits=Sum_Of_digits(n);
		//prime composite number
		System.out.println(Check_Boston_No(Sum_Digits,n)) ;
		

	}

	public static int Check_Boston_No(int sum_Digits, int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=2;//1 cant be considered prime or composite number
		//loop
		while(i<=n) {
			if(n%i==0) {
				sum+=Sum_Of_digits(i);
				n/=i;
				
			}
			else {
				i++;
			}
			
		}
		if(sum==sum_Digits) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

	public static int Sum_Of_digits(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
			
		}
		return sum;
		
	}

}
