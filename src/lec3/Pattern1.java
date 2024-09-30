package lec3;

public class Pattern1 {
	public static void main(String[] args) {
		int n=5,row=1,star1=1,star2=1,space=2*n-3;
		//loop
		while(row<=n) {
			//star1
			int i=1;
			while(i<=star1) {
				System.out.print("* ");
				i++;
				
			}
			//space
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			//star2
			int l=1;
			if(row==n && star2==n) {
				l=2;
			}
			while(l<=star2) {
			System.out.print("* ");
				l++;
				 
			}
			//updation
			row++;
			System.out.println();
			star1++;
			star2++;
			space-=2;
			
		}
	}

}
