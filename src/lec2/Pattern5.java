package lec2;

public class Pattern5 {
	public static void main(String[] args) {
		int n=5,space=n-1,row=1,star=1;
		//loop
		while(row<=n) {
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
			//updation
			System.out.println();
			row++;
			star++;
			space--;
			
			
		}
	}

}
