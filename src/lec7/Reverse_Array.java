package lec7;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,70,30,4};
		Rev(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static void Rev(int[] a) {
		// TODO Auto-generated method stub
		int i=0;
		int j=a.length-1;
		int temp=0;
		while(i<j) {// if both index is equal , then no reverse takes place...
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		
	}

}
