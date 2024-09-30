package lec4;

import java.util.*;

public class Hcf {
	public static void main(String[] args) {
		//to find hcf of a given no.
		int divisor=36,divident=60;
		
		
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
			
			
		}
		System.out.println("hcf= "+divisor);
		
	
	}

}
