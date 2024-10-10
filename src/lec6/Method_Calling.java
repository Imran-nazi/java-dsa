package lec6;

public class Method_Calling {
	public static void main(String[] args) {
		int a=3,b=6;
		Add(a,b);
		Sub(a,b);
	}

	private static void Sub(int a, int b) {
		// TODO Auto-generated method stub
		//int c=a-b;
		System.out.println(a-b);
		Mul(a,b);
		
	}

	private static void Add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
		
		
		
	}

	private static void Mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}
	

}
