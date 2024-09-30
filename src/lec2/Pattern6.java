package lec2;

public class Pattern6 {
	public static void main(String[] args) {
		int n=5,row=1,star=n,space=0;
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
			space+=2;
			star--;
			row++;
			
		}
	}

}
