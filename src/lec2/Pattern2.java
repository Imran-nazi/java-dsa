package lec2;

public class Pattern2 {
	public static void main(String[] args) {
		int n=5,star=1,row=1;
		while(row<=n) {
			int i=1;
			//star print
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
	}

}
