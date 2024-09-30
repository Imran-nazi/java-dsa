package lec2;

public class Pattern1 {
	public static void main(String[] args) {
		int row=1,n=5, star=n;
		
		//loop
		while(row<=n) {
			int i=1;
			//print star
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			System.out.println("");
			row++;
		}
	}

}
