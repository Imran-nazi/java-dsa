package lec7;


public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {12,23,21};
		Swap(a,0,1);
		System.out.println(a[0]+" "+a[1]);

	}

	public static void Swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=a[temp];
		
	}

}
