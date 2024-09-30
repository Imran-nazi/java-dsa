package lec2;

public class Pattern8 {
	public static void main(String[] args) {
		int n=5,star=1,row=1,space=n-1;
		//loop
		while(row<=n) {
			int k=1;
			//space
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			//star
			int i=1;
			while(i<=star) {
				if(i%2==0) {
					System.out.print("! ");
				}
				else
				System.out.print("* ");
				i++;
				
			}
			System.out.println();
			row++;
			star+=2;
			space--;
			
			
		}
	}

}
