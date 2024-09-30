package lec2;

public class Pattern3 {
	public static void main(String[] args) {
		int n=5,star=n,row=1;
		while(row<=n) {
			int i=1;
			//star
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			star--;
			row++;
		}
	}

}
