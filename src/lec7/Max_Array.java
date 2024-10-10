package lec7;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2223,45,678,32};
		System.out.println(Max(a));

	}

	public static int Max(int[] a) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		System.out.println(max);
		//int max=a[0];//23 will be considered maximum.. 
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		return max;
	}

}
