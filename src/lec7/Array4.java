package lec7;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//swapping of array 
		int [] a= {22,34,56};
		int [] b= {212,314,156};
//		Swap(a,b);
		//swapping changes uss particular frame tak seemat rahega.. 
		int [] temp=a;
		a=b;
		b=temp;
		System.out.println(a[0]+" "+b[0]);
	}
//
//	public static void Swap(int[] a, int[] b) {
//		// TODO Auto-generated method stub
//		int [] temp=a;
//		a=b;
//		b=temp;
//		//yaha 2 reference variable meh changes kiye hain , nah ki array ko interchange kiye ho .
//		//isleyeh yah stack se method udega toh , koi swapping of array nahi dikhega , . 
//	}

}
