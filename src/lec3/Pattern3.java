package lec3;

public class Pattern3 {
	public static void main(String[] args) {
		int n=5,N=2*n-1,space=n-1,star=1,row=1;
		//loop
		while(row<=N) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			//star
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
				
			}
			//updt
			System.out.println();
			if(row<n) {
				
				star++;
				space--;
				
			}
			else {
				star--;
				space++;
				
			}
			row++;
			
		}
	}

}
