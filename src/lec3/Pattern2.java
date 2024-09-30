package lec3;

public class Pattern2 {
	public static void main(String[] args) {
		int n=5,star1=n,star2=n,space=-1,row=1;
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
			if(row==1) {
				l=2;
			}
			while(l<=star2) {
				System.out.print("* ");
				l++;
			}
			//updt..
			row++;
			System.out.println();
			space+=2;
			star1--;
			star2--;
			
		}
	}

}
