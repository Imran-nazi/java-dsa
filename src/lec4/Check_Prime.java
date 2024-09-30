package lec4;

public class Check_Prime {
	public static void main(String[] args) {
		int n=10,count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
				//if atleast 1 no. is divisible , then need not to check divisibility further, so use break;
				
			}
			
		}
		if(count>=1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime no.");
		}
	}

}
