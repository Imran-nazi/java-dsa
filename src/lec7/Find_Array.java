package lec7;

public class Find_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,3,5,1,87,32,21,24,98};//hard code ,we are not taking input 
		
		int item=4;
		System.out.println(Find(a,item));

	}

	public static int Find(int[] a, int item) {//this proves array is call by reference ,as we are checking from index value..
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			if(item==a[i]) {
				
				return i;
			}
		}
		
		return -1;//if values is not found ..
		
	}

}
