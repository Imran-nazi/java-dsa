package lec2;

public class Pattern7 {
	public static void main(String[] args) {
		int  n=5,star=1,space=n-1,row=1;
		while(row<=n) {
			//space
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
				
			}
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			star+=2;
			space--;
			row++;
		}
	}

}