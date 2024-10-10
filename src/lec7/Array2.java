package lec7;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
//		int [] a=new int [2];
		int [] a=new int [0];//no array will be created 
		for(int i=0;i<a.length;i++) {
			a[i]=kb.nextInt();
			
		}
		display(a);
	}

	public static void display(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
	}
	

}
