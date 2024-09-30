package lec4;

import java.util.*;

public class Prime_Factor {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int i=2;//start from 2, not 1
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i+" ");
				n=n/i;
			}
			else {
				i++;
			}
		}
	}

}
