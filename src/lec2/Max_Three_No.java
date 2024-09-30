package lec2;

public class Max_Three_No {
	public static void main(String [] args) {
		int a=20,b=7,c=8;
		if(a==b && a>c )
			System.out.println("a & b is >");
		else if(b==c && b>a)
			System.out.println("c & b is >");
		else if(a>b && a>c)
			System.out.println("a is >");
		
		else if(b>a && b>c)
			System.out.println("b is >");
		else
			System.out.println("c is >");
	}

}
